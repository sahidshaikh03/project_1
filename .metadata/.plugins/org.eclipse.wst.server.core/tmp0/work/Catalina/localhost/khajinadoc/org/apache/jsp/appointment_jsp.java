/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-05-13 06:50:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class appointment_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!--\n");
      out.write("author: W3layouts\n");
      out.write("author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zxx\">\n");
      out.write("<head>\n");
      out.write("<title>Health Plus a Medical Category Bootstrap Responsive Website Template | Appointment :: w3layouts</title>\n");
      out.write("<!-- for-meta-tags-->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Health Plus Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("Smartphone Compatible web template, free web designs for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\n");
      out.write("		function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!-- //for-meta-tags-->\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"css/wickedpicker.css\" rel=\"stylesheet\" type='text/css' media=\"all\" />\n");
      out.write("			<link rel=\"stylesheet\" href=\"css/jquery-ui.css\" />\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<!-- font-awesome icons -->\n");
      out.write("<link href=\"css/font-awesome.css\" rel=\"stylesheet\"> \n");
      out.write("<!-- //font-awesome icons -->\n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=Raleway:200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800\" rel=\"stylesheet\">\n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=Lato:300,300i,400,400i,700,900\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("	\n");
      out.write("<body>\n");
      out.write("<div class=\"main\" id=\"home\">\n");
      out.write("<!-- banner -->\n");
      out.write("		<div class=\"header_agileinfo\">\n");
      out.write("						<div class=\"w3_agileits_header_text\">\n");
      out.write("							<ul class=\"top_agile_w3l_info_icons\">\n");
      out.write("									<li><i class=\"fa fa-home\" aria-hidden=\"true\"></i>12K Street,New York City.</li>\n");
      out.write("									<li class=\"second\"><i class=\"fa fa-phone\" aria-hidden=\"true\"></i>(+000) 123 456 87</li>\n");
      out.write("									\n");
      out.write("									<li><i class=\"fa fa-envelope-o\" aria-hidden=\"true\"></i><a href=\"mailto:maria@example.com\">info@example.com</a></li>\n");
      out.write("								</ul>\n");
      out.write("\n");
      out.write("						</div>\n");
      out.write("						<div class=\"agileinfo_social_icons\">\n");
      out.write("							<ul class=\"agileits_social_list\">\n");
      out.write("								<li><a href=\"#\" class=\"w3_agile_facebook\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("								<li><a href=\"#\" class=\"agile_twitter\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("								<li><a href=\"#\" class=\"w3_agile_dribble\"><i class=\"fa fa-dribbble\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("								<li><a href=\"#\" class=\"w3_agile_rss\"><i class=\"fa fa-rss\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("							</ul>\n");
      out.write("						</div>\n");
      out.write("						<div class=\"clearfix\"> </div>\n");
      out.write("			</div>				\n");
      out.write("\n");
      out.write("		<div class=\"header-bottom\">\n");
      out.write("				<nav class=\"navbar navbar-default\">\n");
      out.write("				<!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("				<div class=\"navbar-header\">\n");
      out.write("				  <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("					<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("					<span class=\"icon-bar\"></span>\n");
      out.write("					<span class=\"icon-bar\"></span>\n");
      out.write("					<span class=\"icon-bar\"></span>\n");
      out.write("				  </button>\n");
      out.write("					<div class=\"logo\">\n");
      out.write("						<h1><a class=\"navbar-brand\" href=\"index.jsp\"><span>Khajina</span>Doc <i class=\"fa fa-plus\" aria-hidden=\"true\"></i> <p>Quality Care 4U</p></a></h1>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("\n");
      out.write("				<!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("				<div class=\"collapse navbar-collapse nav-wil\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("					<nav class=\"menu menu--sebastian\">\n");
      out.write("					<ul id=\"m_nav_list\" class=\"m_nav menu__list\">\n");
      out.write("						<li class=\"m_nav_item menu__item menu__item--current\" id=\"m_nav_item_1\"> <a href=\"index.jsp\" class=\"menu__link\"> Home </a></li>\n");
      out.write("						<li class=\"m_nav_item menu__item\" id=\"moble_nav_item_2\"> <a href=\"about.jsp\" class=\"menu__link\"> About Us </a> </li>		\n");
      out.write("						<li class=\"m_nav_item menu__item\" id=\"moble_nav_item_4\"> <a href=\"appointment.jsp\" class=\"menu__link\">Appointment  </a> </li>\n");
      out.write("						\n");
      out.write("						<li class=\"m_nav_item menu__item\" id=\"moble_nav_item_3 dropdown\"> <a href=\"#\" class=\"menu__link dropdown-toggle\" data-toggle=\"dropdown\">Login  <b class=\"caret\"></b></a> \n");
      out.write("						   <ul class=\"dropdown-menu agile_short_dropdown\">\n");
      out.write("									<li><a href=\"Patient_Login.jsp\">Patient Login</a></li>\n");
      out.write("									<li><a href=\"Doctor_Login.jsp\">Doctor Login</a></li>\n");
      out.write("									<li><a href=\"Admin_Login.jsp\">Admin Login</a></li>\n");
      out.write("						   </ul>\n");
      out.write("						</li>\n");
      out.write("						<li class=\"m_nav_item menu__item\" id=\"moble_nav_item_6\"> <a href=\"contact.jsp\" class=\"menu__link\"> Contact </a> </li>\n");
      out.write("					</ul>\n");
      out.write("				</nav>\n");
      out.write("\n");
      out.write("				</div>\n");
      out.write("				<!-- /.navbar-collapse -->\n");
      out.write("			</nav>\n");
      out.write("	 </div>\n");
      out.write("</div>\n");
      out.write("<!-- banner -->\n");
      out.write("<!-- banner1 -->\n");
      out.write("	<div class=\"banner1 jarallax\">\n");
      out.write("		<div class=\"container\">\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("	<div class=\"services-breadcrumb\">\n");
      out.write("		<div class=\"container\">\n");
      out.write("			<ul>\n");
      out.write("				<li><a href=\"index.jsp\">Home</a><i>|</i></li>\n");
      out.write("				<li>Appointment</li>\n");
      out.write("			</ul>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("<!-- //banner1 -->\n");
      out.write("<!-- icons -->\n");
      out.write("	<div class=\"banner-bottom\" id=\"about\">\n");
      out.write("		<div class=\"container\">\n");
      out.write("					<h2 class=\"w3_heade_tittle_agile\">Appointment</h2>\n");
      out.write("			        <p class=\"sub_t_agileits\">Add Short Description</p>\n");
      out.write("\n");
      out.write("					<div class=\"book-appointment\">\n");
      out.write("						<h4>Make an appointment</h4>\n");
      out.write("								<form action=\"AppointmentController\" method=\"post\" >\n");
      out.write("								<div class=\"left-agileits-w3layouts same\">\n");
      out.write("								<div class=\"gaps\">\n");
      out.write("									<!--  <p>Patient Name</p>-->\n");
      out.write("										<input type=\"hidden\" name=\"DR_ID\" placeholder=\"\" required=\"\"/>\n");
      out.write("								</div>\n");
      out.write("								<div class=\"gaps\">\n");
      out.write("									<p>Patient Name</p>\n");
      out.write("										<input type=\"text\" name=\"Appointment_name\" placeholder=\"Patient Name\" required=\"\"/>\n");
      out.write("								</div>	\n");
      out.write("									<div class=\"gaps\">	\n");
      out.write("									<p>Phone Number</p>\n");
      out.write("										<input type=\"text\" name=\"Appointment_number\" placeholder=\"Patient Contact Number\" required=\"\"/>\n");
      out.write("									</div>\n");
      out.write("									<div class=\"gaps\">\n");
      out.write("									<p>Email</p>\n");
      out.write("											<input type=\"email\" name=\"Appointment_email\" placeholder=\"Email Id of Patient \" required=\"\" />\n");
      out.write("									</div>	\n");
      out.write("									<div class=\"gaps\">\n");
      out.write("									<p>Symptoms</p>\n");
      out.write("											<textarea name=\"Appointment_symptoms\" placeholder=\"Patient Symptoms\" required=\"\" ></textarea>\n");
      out.write("									</div>\n");
      out.write("								</div>\n");
      out.write("								<div class=\"right-agileinfo same\">\n");
      out.write("								<div class=\"gaps\">\n");
      out.write("									<p>Select Date</p>		\n");
      out.write("											<input  id=\"datepicker1\" name=\"Appointment_date\" type=\"text\" value=\"\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'mm/dd/yyyy';}\" required=\"\">\n");
      out.write("								</div>\n");
      out.write("								<div class=\"gaps\">\n");
      out.write("									<p>Department</p>	\n");
      out.write("										<select class=\"option\" name=\"Appointment_department\">\n");
      out.write("											<option></option>\n");
      out.write("											<option>Cardiology</option>\n");
      out.write("											<option>Ophthalmology</option>\n");
      out.write("											<option>Neurology</option>\n");
      out.write("											<option>Psychology</option>\n");
      out.write("											<option>Dermatology</option>\n");
      out.write("										</select>\n");
      out.write("								</div>\n");
      out.write("								<div class=\"gaps\">\n");
      out.write("									<p>Gender</p>	\n");
      out.write("										<select class=\"option\" name=\"Appointment_gender\">\n");
      out.write("											<option></option>\n");
      out.write("											<option>Male</option>\n");
      out.write("											<option>Female</option>\n");
      out.write("										</select>\n");
      out.write("								</div>\n");
      out.write("								<div class=\"gaps\">\n");
      out.write("									<p>Time</p>		\n");
      out.write("										<input type=\"text\" id=\"timepicker\" name=\"Appointment_time\" class=\"timepicker option\" value=\"\">	\n");
      out.write("								</div>\n");
      out.write("								</div>\n");
      out.write("								<div class=\"clearfix\"></div>\n");
      out.write("											  <input type=\"submit\" name=\"action\" value=\"appointment\">\n");
      out.write("								</form>\n");
      out.write("							</div>\n");
      out.write("					   </div>\n");
      out.write("\n");
      out.write("		</div>\n");
      out.write("	\n");
      out.write("<!-- icons -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- footer -->\n");
      out.write("	<div class=\"footer\">\n");
      out.write("		<div class=\"container\">\n");
      out.write("			<h4>Subscribe to <span>Newsletter</span></h4>\n");
      out.write("			<form action=\"#\" method=\"post\">\n");
      out.write("				<input type=\"email\" name=\"Email\" placeholder=\"Enter Your Email...\" required=\"\">\n");
      out.write("				<input type=\"submit\" value=\"Send\">\n");
      out.write("			</form>\n");
      out.write("			<div class=\"agile_footer_copy\">\n");
      out.write("				<div class=\"w3agile_footer_grids\">\n");
      out.write("					<div class=\"col-md-4 w3agile_footer_grid\">\n");
      out.write("						<h3>About Us</h3>\n");
      out.write("						<p>Duis aute irure dolor in reprehenderit in voluptate velit esse.<span>Excepteur sint occaecat cupidatat \n");
      out.write("							non proident, sunt in culpa qui officia deserunt mollit.</span></p>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"col-md-4 w3agile_footer_grid\">\n");
      out.write("						<h3>Contact Info</h3>\n");
      out.write("						<ul>\n");
      out.write("							<li><i class=\"fa fa-map-marker\" aria-hidden=\"true\"></i>1234k Avenue, 4th block, <span>New York City.</span></li>\n");
      out.write("							<li><i class=\"fa fa-envelope-o\" aria-hidden=\"true\"></i><a href=\"mailto:info@example.com\">info@example.com</a></li>\n");
      out.write("							<li><i class=\"fa fa-phone\" aria-hidden=\"true\"></i>+1234 567 567</li>\n");
      out.write("						</ul>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"col-md-4 w3agile_footer_grid w3agile_footer_grid1\">\n");
      out.write("						<h3>Navigation</h3>\n");
      out.write("						<ul>\n");
      out.write("							<li><span class=\"fa fa-long-arrow-right\" aria-hidden=\"true\"></span><a href=\"gallery.jsp\">Department</a></li>\n");
      out.write("							<li><span class=\"fa fa-long-arrow-right\" aria-hidden=\"true\"></span><a href=\"appointment.jsp\">Appointment</a></li>\n");
      out.write("							<li><span class=\"fa fa-long-arrow-right\" aria-hidden=\"true\"></span><a href=\"about.jsp\">About</a></li>\n");
      out.write("							<li><span class=\"fa fa-long-arrow-right\" aria-hidden=\"true\"></span><a href=\"contact.jsp\">Contact Us</a></li>\n");
      out.write("						</ul>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"clearfix\"> </div>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"w3_agileits_copy_right_social\">\n");
      out.write("				<div class=\"col-md-6 agileits_w3layouts_copy_right\">\n");
      out.write("					<p>&copy; 2017 Health Plus. All rights reserved | Design by <a href=\"http://w3layouts.com/\">W3layouts</a></p>\n");
      out.write("				</div>\n");
      out.write("				<div class=\"col-md-6 w3_agile_copy_right\">\n");
      out.write("					<ul class=\"agileits_social_list\">\n");
      out.write("								<li><a href=\"#\" class=\"w3_agile_facebook\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("								<li><a href=\"#\" class=\"agile_twitter\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("								<li><a href=\"#\" class=\"w3_agile_dribble\"><i class=\"fa fa-dribbble\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("								<li><a href=\"#\" class=\"w3_agile_rss\"><i class=\"fa fa-rss\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("							</ul>\n");
      out.write("				</div>\n");
      out.write("				<div class=\"clearfix\"> </div>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("<!-- //footer -->\n");
      out.write("<a href=\"#\" id=\"toTop\" style=\"display: block;\"> <span id=\"toTopHover\" style=\"opacity: 1;\"> </span></a>\n");
      out.write(" <!-- js -->\n");
      out.write("<script src=\"js/jquery-2.2.3.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/wickedpicker.js\"></script>\n");
      out.write("			<script type=\"text/javascript\">\n");
      out.write("				$('.timepicker').wickedpicker({twentyFour: false});\n");
      out.write("			</script>\n");
      out.write("		<!-- Calendar -->\n");
      out.write("				<script src=\"js/jquery-ui.js\"></script>\n");
      out.write("				  <script>\n");
      out.write("						  $(function() {\n");
      out.write("							$( \"#datepicker,#datepicker1,#datepicker2,#datepicker3\" ).datepicker();\n");
      out.write("						  });\n");
      out.write("				  </script>\n");
      out.write("			<!-- //Calendar -->\n");
      out.write("\n");
      out.write("<!-- bootstrap-pop-up -->\n");
      out.write("	<div class=\"modal video-modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModal\">\n");
      out.write("		<div class=\"modal-dialog\" role=\"document\">\n");
      out.write("			<div class=\"modal-content\">\n");
      out.write("				<div class=\"modal-header\">\n");
      out.write("					Health Plus\n");
      out.write("					<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>						\n");
      out.write("				</div>\n");
      out.write("				<section>\n");
      out.write("					<div class=\"modal-body\">\n");
      out.write("						<img src=\"images/g9.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("						<p>Ut enim ad minima veniam, quis nostrum \n");
      out.write("							exercitationem ullam corporis suscipit laboriosam, \n");
      out.write("							nisi ut aliquid ex ea commodi consequatur? Quis autem \n");
      out.write("							vel eum iure reprehenderit qui in ea voluptate velit \n");
      out.write("							esse quam nihil molestiae consequatur, vel illum qui \n");
      out.write("							dolorem eum fugiat quo voluptas nulla pariatur.\n");
      out.write("							<i>\" Quis autem vel eum iure reprehenderit qui in ea voluptate velit \n");
      out.write("								esse quam nihil molestiae consequatur.</i></p>\n");
      out.write("					</div>\n");
      out.write("				</section>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("<!-- //bootstrap-pop-up -->\n");
      out.write("<!-- start-smoth-scrolling -->\n");
      out.write("<script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("	jQuery(document).ready(function($) {\n");
      out.write("		$(\".scroll\").click(function(event){		\n");
      out.write("			event.preventDefault();\n");
      out.write("			$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);\n");
      out.write("		});\n");
      out.write("	});\n");
      out.write("</script>\n");
      out.write("<!-- start-smoth-scrolling -->\n");
      out.write("			<script src=\"js/jarallax.js\"></script>\n");
      out.write("	<script src=\"js/SmoothScroll.min.js\"></script>\n");
      out.write("	<script type=\"text/javascript\">\n");
      out.write("		/* init Jarallax */\n");
      out.write("		$('.jarallax').jarallax({\n");
      out.write("			speed: 0.5,\n");
      out.write("			imgWidth: 1366,\n");
      out.write("			imgHeight: 768\n");
      out.write("		})\n");
      out.write("	</script>\n");
      out.write("	\n");
      out.write("	<script src=\"js/bootstrap.js\"></script>\n");
      out.write("<!-- //for bootstrap working -->\n");
      out.write("<!-- here stars scrolling icon -->\n");
      out.write("	<script type=\"text/javascript\">\n");
      out.write("		$(document).ready(function() {\n");
      out.write("			/*\n");
      out.write("				var defaults = {\n");
      out.write("				containerID: 'toTop', // fading element id\n");
      out.write("				containerHoverID: 'toTopHover', // fading element hover id\n");
      out.write("				scrollSpeed: 1200,\n");
      out.write("				easingType: 'linear' \n");
      out.write("				};\n");
      out.write("			*/\n");
      out.write("								\n");
      out.write("			$().UItoTop({ easingType: 'easeOutQuart' });\n");
      out.write("								\n");
      out.write("			});\n");
      out.write("	</script>\n");
      out.write("<!-- //here ends scrolling icon -->\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
