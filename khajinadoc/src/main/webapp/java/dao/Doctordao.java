package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.Dbconnection;
import model.Doctordata;
 
 
 public class Doctordao {

	public static void insertDoctor(Doctordata d) {
		try {
			Connection con = Dbconnection.getconnection();
			String sql = "insert into Doctordata(image,dname,demail,dpassword,dhaddress,dcaddress,dspeciality,dcontact) values(?,?,?,?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);

			pst.setString(1, d.getImage());
			pst.setString(2, d.getDname());
			pst.setString(3, d.getDemail());
			pst.setString(4, d.getDpassword());
			pst.setString(5, d.getDhaddress());
			pst.setString(6, d.getDcaddress());
			pst.setString(7, d.getDspeciality());
			pst.setLong(8, d.getDContact());
			pst.executeUpdate();
			System.out.println("data inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * public static Doctordata DoctorLogin(Doctordata d) { Doctordata d1 = null;
	 * try { Connection con = Dbconnection.getconnection(); String
	 * sql="select * from Doctordata where demail=? and dpassword=?";
	 * PreparedStatement pst = con.prepareStatement(sql); pst.setString(1,
	 * d.getDemail()); pst.setString(2, d.getDpassword()); ResultSet rs =
	 * pst.executeQuery(); if(rs.next()) { d1 = new Doctordata();
	 * d1.setDid(rs.getInt("did")); d1.setDname(rs.getString("dname"));
	 * d1.setDemail(rs.getString("demail"));
	 * d1.setDpassword(rs.getString("dpassword"));
	 * d1.setDhaddress(rs.getString("dhaddress"));
	 * d1.setDcaddress(rs.getString("dcaddress"));
	 * d1.setDspeciality(rs.getString("dspeciality"));
	 * d1.setDContact(rs.getLong("dcontact"));
	 * 
	 * }
	 * 
	 * } catch (Exception e) { e.printStackTrace(); } return d1;
	 * 
	 * 
	 * }
	 */
	public static Doctordata DoctorLogin(Doctordata d) {
		Doctordata d1 = null;
		try {
			Connection con = Dbconnection.getconnection();
			String sql = "select * from Doctordata where demail=? and dpassword=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, d.getDemail());
			pst.setString(2, d.getDpassword());
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				d1 = new Doctordata();
				d1.setDid(rs.getInt("did"));
				d1.setDname(rs.getString("dname"));
				d1.setDemail(rs.getString("demail"));
				d1.setDpassword(rs.getString("dpassword"));
				d1.setDhaddress(rs.getString("dhaddress"));
				d1.setDcaddress(rs.getString("dcaddress"));
				d1.setDspeciality(rs.getString("dspeciality"));
				d1.setDContact(rs.getLong("dcontact"));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return d1;
	}

	public static void updateProfile(Doctordata d) {
		try {
			Connection con = Dbconnection.getconnection();
			String sql = "update Doctordata set dname=?,demail=?,dhaddress=?,dcaddress=?,dspeciality=?,dcontact=? where did=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, d.getDname());
			pst.setString(2, d.getDemail());
			pst.setString(3, d.getDhaddress());
			pst.setString(4, d.getDcaddress());
			pst.setString(5, d.getDspeciality());
			pst.setLong(6, d.getDContact());
			pst.setInt(7, d.getDid());
			pst.executeUpdate();
			System.out.println("profile updated");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static boolean checkEmail(String demail) {
		boolean flag = false;
		try {
			Connection conn = Dbconnection.getconnection();
			String sql = "select * from Doctordata where demail=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setNString(1, demail);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public static boolean checkOldPassword(String dop, int did) {
		boolean flag = false;
		try {
			Connection con = Dbconnection.getconnection();
			String sql = "select * from Doctordata where dpassword=? and did=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, dop);
			pst.setInt(2, did);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public static void updatePassword(String dnp, int did) {
		try {
			Connection con = Dbconnection.getconnection();
			String sql = "update Doctordata set dpassword=? where did=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, dnp);
			pst.setInt(2, did);
			pst.executeUpdate();
			System.out.println("password changed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static List<Doctordata> getalldoctor() {
		List<Doctordata> list = new ArrayList<Doctordata>();
		try {
			Connection con = Dbconnection.getconnection();
			String sql = "select * from Doctordata ";
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Doctordata d = new Doctordata();
				d = new Doctordata();
				d.setDid(rs.getInt("did"));
				d.setDname(rs.getString("dname"));
				d.setDemail(rs.getString("demail"));
				d.setDpassword(rs.getString("dpassword"));
				d.setDhaddress(rs.getString("dhaddress"));
				d.setDcaddress(rs.getString("dcaddress"));
				d.setDspeciality(rs.getString("dspeciality"));
				d.setDContact(rs.getLong("dcontact"));
				list.add(d);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static List<Doctordata> getcardiologist() {
		ArrayList<Doctordata> list = new ArrayList<Doctordata>();
		try {
			Connection con = Dbconnection.getconnection();
			String sql = "select * from Doctordata where dspeciality='cardiologist'";
			PreparedStatement pst = con.prepareStatement(sql);

			ResultSet rs = pst.executeQuery();
			while (rs.next()) {

				Doctordata d = new Doctordata();
				d.setDid(rs.getInt("did"));
				d.setDname(rs.getString("dname"));
				d.setDemail(rs.getString("demail"));
				d.setDpassword(rs.getString("dpassword"));
				d.setDhaddress(rs.getString("dhaddress"));
				d.setDcaddress(rs.getString("dcaddress"));
				d.setDspeciality(rs.getString("dspeciality"));
				d.setDContact(rs.getLong("dcontact"));
				list.add(d);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static Doctordata cardiologistdrbyid(int did) {
		Doctordata d = null;

		try {
			Connection con = Dbconnection.getconnection();
			String sql = "select * from Doctordata where did=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, did);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				d = new Doctordata();

				d.setDid(rs.getInt("did"));
				d.setDname(rs.getString("dname"));
				d.setDemail(rs.getString("demail"));
				d.setDpassword(rs.getString("dpassword"));
				d.setDhaddress(rs.getString("dhaddress"));
				d.setDcaddress(rs.getString("dcaddress"));
				d.setDspeciality(rs.getString("dspeciality"));
				d.setDContact(rs.getLong("dcontact"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return d;
	}

	public static List<Doctordata> getOphthalmology() {
		ArrayList<Doctordata> list = new ArrayList<Doctordata>();
		try {
			Connection con = Dbconnection.getconnection();
			String sql = "select * from Doctordata where dspeciality='Neurology'";
			PreparedStatement pst = con.prepareStatement(sql);

			ResultSet rs = pst.executeQuery();
			while (rs.next()) {

				Doctordata d = new Doctordata();
				d.setDid(rs.getInt("did"));
				d.setDname(rs.getString("dname"));
				d.setDemail(rs.getString("demail"));
				d.setDpassword(rs.getString("dpassword"));
				d.setDhaddress(rs.getString("dhaddress"));
				d.setDcaddress(rs.getString("dcaddress"));
				d.setDspeciality(rs.getString("dspeciality"));
				d.setDContact(rs.getLong("dcontact"));
				list.add(d);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public static Doctordata getopthamologybyid(int did) {
		Doctordata d = null;

		try {
			Connection con = Dbconnection.getconnection();
			String sql = "select * from Doctordata where did=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, did);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				d = new Doctordata();

				d.setDid(rs.getInt("did"));
				d.setDname(rs.getString("dname"));
				d.setDemail(rs.getString("demail"));
				d.setDpassword(rs.getString("dpassword"));
				d.setDhaddress(rs.getString("dhaddress"));
				d.setDcaddress(rs.getString("dcaddress"));
				d.setDspeciality(rs.getString("dspeciality"));
				d.setDContact(rs.getLong("dcontact"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return d;
	}
	
	public static List<Doctordata> getNeurology() {
		ArrayList<Doctordata> list = new ArrayList<Doctordata>();
		try {
			Connection con = Dbconnection.getconnection();
			String sql = "select * from Doctordata where dspeciality='Neurology'";
			PreparedStatement pst = con.prepareStatement(sql);

			ResultSet rs = pst.executeQuery();
			while (rs.next()) {

				Doctordata d = new Doctordata();
				d.setDid(rs.getInt("did"));
				d.setDname(rs.getString("dname"));
				d.setDemail(rs.getString("demail"));
				d.setDpassword(rs.getString("dpassword"));
				d.setDhaddress(rs.getString("dhaddress"));
				d.setDcaddress(rs.getString("dcaddress"));
				d.setDspeciality(rs.getString("dspeciality"));
				d.setDContact(rs.getLong("dcontact"));
				list.add(d);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static List<Doctordata> getPsychology() {
		ArrayList<Doctordata> list = new ArrayList<Doctordata>();
		try {
			Connection con = Dbconnection.getconnection();
			String sql = "select * from Doctordata where dspeciality='Psychology'";
			PreparedStatement pst = con.prepareStatement(sql);

			ResultSet rs = pst.executeQuery();
			while (rs.next()) {

				Doctordata d = new Doctordata();
				d.setDid(rs.getInt("did"));
				d.setDname(rs.getString("dname"));
				d.setDemail(rs.getString("demail"));
				d.setDpassword(rs.getString("dpassword"));
				d.setDhaddress(rs.getString("dhaddress"));
				d.setDcaddress(rs.getString("dcaddress"));
				d.setDspeciality(rs.getString("dspeciality"));
				d.setDContact(rs.getLong("dcontact"));
				list.add(d);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static List<Doctordata> getDermatology() {
		ArrayList<Doctordata> list = new ArrayList<Doctordata>();
		try {
			Connection con = Dbconnection.getconnection();
			String sql = "select * from Doctordata where dspeciality='Dermatology'";
			PreparedStatement pst = con.prepareStatement(sql);

			ResultSet rs = pst.executeQuery();
			while (rs.next()) {

				Doctordata d = new Doctordata();
				d.setDid(rs.getInt("did"));
				d.setDname(rs.getString("dname"));
				d.setDemail(rs.getString("demail"));
				d.setDpassword(rs.getString("dpassword"));
				d.setDhaddress(rs.getString("dhaddress"));
				d.setDcaddress(rs.getString("dcaddress"));
				d.setDspeciality(rs.getString("dspeciality"));
				d.setDContact(rs.getLong("dcontact"));
				list.add(d);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static void deleteDoctor(int did) {
		try {
			Connection conn = Dbconnection.getconnection();
			String sql = "delete from Doctordata where Did=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, did);
			pst.executeUpdate();
			System.out.println("data deleted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
