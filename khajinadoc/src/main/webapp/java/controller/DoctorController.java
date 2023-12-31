package controller;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import dao.Doctordao;
import dao.Patientdao;
import model.Doctordata;
import service.Servicesss;

/**
 * Servlet implementation class DoctorController
 */
@WebServlet("/DoctorController")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 512, maxFileSize = 1024 * 1024 * 512, maxRequestSize = 1024 * 1024
		* 512)
public class DoctorController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DoctorController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	private String extractfilename(Part file) {
		String cd = file.getHeader("content-disposition");
		System.out.println(cd);
		String[] items = cd.split(";");
		for (String string : items) {
			if (string.trim().startsWith("filename")) {
				return string.substring(string.indexOf("=") + 2, string.length() - 1);
			}
		}
		return "";
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("upload")) {
			Doctordata d = new Doctordata();
			String savePath = "C:\\Users\\shahid shaikh\\docapp\\khajinadoc\\src\\main\\webapp\\img";
			File fileSaveDir = new File(savePath);
			if (!fileSaveDir.exists()) {
				fileSaveDir.mkdir();
			}
			Part file1 = request.getPart("image");
			String fileName = extractfilename(file1);
			file1.write(savePath + File.separator + fileName);
			String filePath = savePath + File.separator + fileName;

			String savePath2 = "C:\\Users\\shahid shaikh\\docapp\\khajinadoc\\src\\main\\webapp\\img";
			File imgSaveDir = new File(savePath2);
			if (!imgSaveDir.exists()) {
				imgSaveDir.mkdir();
			}
			d.setImage(fileName);
			d.setDname(request.getParameter("dname"));
			d.setDemail(request.getParameter("demail"));
			d.setDpassword(request.getParameter("dpassword"));
			d.setDhaddress(request.getParameter("dhaddress"));
			d.setDcaddress(request.getParameter("dcaddress"));
			d.setDspeciality(request.getParameter("dspeciality"));
			d.setDContact(Long.parseLong(request.getParameter("dcontact")));
			Doctordao.insertDoctor(d);
			request.setAttribute("msg", "data registered successfully");
			request.getRequestDispatcher("Doctor_Login.jsp").forward(request, response);
		} else if (action.equalsIgnoreCase("login")) {
			Doctordata d = new Doctordata();
			d.setDemail(request.getParameter("demail"));
			d.setDpassword(request.getParameter("dpassword"));
			String demail = request.getParameter("demail");
			boolean flag = Doctordao.checkEmail(demail);
			System.out.println(flag);
			if (flag == true) {
				Doctordata d1 = Doctordao.DoctorLogin(d);
				if (d1 == null) {
					request.setAttribute("msg1", "password is incorrect");
					request.getRequestDispatcher("Doctor_Login.jsp").forward(request, response);
				} else {
					HttpSession session = request.getSession();
					session.setAttribute("data", d1);
					request.getRequestDispatcher("Doctor-home.jsp").forward(request, response);
				}
			} else {
				request.setAttribute("msg", "email is not registerd");
				request.getRequestDispatcher("Doctor_Login.jsp").forward(request, response);
			}
		} else if (action.equalsIgnoreCase("update")) {
			Doctordata d = new Doctordata();
			d.setDid(Integer.parseInt(request.getParameter("did")));
			d.setDname(request.getParameter("dname"));
			d.setDemail(request.getParameter("demail"));
			d.setDhaddress(request.getParameter("dhaddress"));
			d.setDcaddress(request.getParameter("dcaddress"));
			d.setDspeciality(request.getParameter("dspeciality"));
			d.setDContact(Long.parseLong(request.getParameter("dcontact")));
			Doctordao.updateProfile(d);
			HttpSession session = request.getSession();
			session.setAttribute("data", d);
			request.getRequestDispatcher("Doctor-home.jsp").forward(request, response);
		} else if (action.equalsIgnoreCase("change password")) {
			int did = Integer.parseInt(request.getParameter("did"));
			String dop = request.getParameter("dop");
			String dnp = request.getParameter("dnp");
			String dcnp = request.getParameter("dcnp");
			boolean flag = Doctordao.checkOldPassword(dop, did);
			if (flag == true) {
				if (dnp.equals(dcnp)) {
					Doctordao.updatePassword(dnp, did);
					response.sendRedirect("Doctor-home.jsp");
				} else {
					request.setAttribute("msg1", "New password and confirm new password not matched");
					request.getRequestDispatcher("Doctor_changepassword.jsp").forward(request, response);
				}
			} else {
				request.setAttribute("msg", "old password not matched");
				request.getRequestDispatcher("Doctor_changepassword.jsp").forward(request, response);
			}
		} else if (action.equalsIgnoreCase("get otp")) {
			String email = request.getParameter("demail");
			Random r = new Random();
			int num = r.nextInt(99999);
			Servicesss s = new Servicesss();
//			s.sendMail(email, num);
			s.sendMail(email, num);
			request.setAttribute("demail", email);
			request.setAttribute("otp", num);
			request.getRequestDispatcher("Doctor-verifyotp.jsp").forward(request, response);
		} else if (action.equalsIgnoreCase("verify")) {
			String email = request.getParameter("demail");
			int otp1 = Integer.parseInt(request.getParameter("otp1"));
			int otp2 = Integer.parseInt(request.getParameter("otp2"));
			if (otp1 == otp2) {
				request.setAttribute("demail", email);
				request.getRequestDispatcher("Doctor-newpassword.jsp").forward(request, response);
			} else {
				request.setAttribute("demail", email);
				request.setAttribute("dotp", otp1);
				request.setAttribute("msg", "OTP not metched");
				request.getRequestDispatcher("Doctor-verifyotp.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("New Password")) {
			String email = request.getParameter("demail");
			String np = request.getParameter("dnp");
			String cnp = request.getParameter("dcnp");
			if(np.equals(cnp)) {
				Patientdao.updatePassword(email, np);
				response.sendRedirect("Doctor_Login.jsp");
			}
			else {
				request.setAttribute("email", email);
				request.setAttribute("msg", "New password and confirm new password not matched");
				request.getRequestDispatcher("Doctor-newpassword.jsp").forward(request, response);
			}
		}

	}
}
