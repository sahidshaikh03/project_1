/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-05-09 06:13:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Patientdata;

public final class Patient_005fprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("model.Patientdata");
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
      out.write("<title>KhajinaDoc a Medical Online Solution |</title>\n");
      out.write("<!-- for-meta-tags-->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\"\n");
      out.write("	content=\"Health Plus Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("Smartphone Compatible web template, free web designs for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\">\n");
      out.write("	addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\n");
      out.write("		function hideURLbar(){ window.scrollTo(0,1); } \n");
      out.write("</script>\n");
      out.write("<!-- //for-meta-tags-->\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("	media=\"all\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/flexslider.css\" type=\"text/css\"\n");
      out.write("	media=\"screen\" Department=\"\" />\n");
      out.write("<link href=\"css/services.css\" rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("	media=\"all\" />\n");
      out.write("<link href=\"css/ziehharmonika.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<link href=\"css/JiSlider.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<!-- font-awesome icons -->\n");
      out.write("<link href=\"css/font-awesome.css\" rel=\"stylesheet\">\n");
      out.write("<!-- //font-awesome icons -->\n");
      out.write("<link\n");
      out.write("	href=\"//fonts.googleapis.com/css?family=Raleway:200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800\"\n");
      out.write("	rel=\"stylesheet\">\n");
      out.write("<link\n");
      out.write("	href=\"//fonts.googleapis.com/css?family=Lato:300,300i,400,400i,700,900\"\n");
      out.write("	rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<style>\n");
      out.write(".overlay {\n");
      out.write("	border: 2px solid black;\n");
      out.write("	/* Set the border style to a 1px solid black line */\n");
      out.write("	padding: 10px;\n");
      out.write("	margin-top: 10px;\n");
      out.write("	/* Add some padding around the box content to make it easier to read */\n");
      out.write("}\n");
      out.write("\n");
      out.write(".department .btn-group .btn:first-child {\n");
      out.write("	margin-right: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the primary button */\n");
      out.write(".btn-primary {\n");
      out.write("	background-color: #007bff;\n");
      out.write("	color: #fff;\n");
      out.write("	border: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the success button */\n");
      out.write(".btn-success {\n");
      out.write("	background-color: #28a745;\n");
      out.write("	color: #fff;\n");
      out.write("	border: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Add margin to the buttons */\n");
      out.write(".btn-group>.btn {\n");
      out.write("	margin-right: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".social_agileinfo li a {\n");
      out.write("	display: block;\n");
      out.write("	width: 30px;\n");
      out.write("	height: 30px;\n");
      out.write("	line-height: 30px;\n");
      out.write("	text-align: center;\n");
      out.write("	background: #333;\n");
      out.write("	border-radius: 50%;\n");
      out.write("	margin: 0 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".social_agileinfo li a i {\n");
      out.write("	font-size: 18px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".social_agileinfo li a:hover {\n");
      out.write("	background: #555;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".social_agileinfo li a:hover i {\n");
      out.write("	color: #fff;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".social_agileinfo li a:focus {\n");
      out.write("	outline: none;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div class=\"main\" id=\"home\">\n");

   Patientdata p = null;
   if(session.getAttribute("data")!=null){
	   p = (Patientdata)session.getAttribute("data");
   }
   else{
	   response.sendRedirect("Patient_Login.jsp");
   }
   
      out.write("\n");
      out.write("<!-- banner -->\n");
      out.write("		<div class=\"header_agileinfo\">\n");
      out.write("					<div class=\"w3_agileits_header_text\">\n");
      out.write("				<ul class=\"top_agile_w3l_info_icons\">\n");
      out.write("					<li><i class=\"fa fa-home\" aria-hidden=\"true\"></i>Near\n");
      out.write("						Kankariya,Ahemdabad</li>\n");
      out.write("					<li class=\"second\"><i class=\"fa fa-phone\" aria-hidden=\"true\"></i>(+91)8200405262</li>\n");
      out.write("\n");
      out.write("					<li><i class=\"fa fa-envelope-o\" aria-hidden=\"true\"></i><a\n");
      out.write("						href=\"mailto:maria@example.com\">khajinadoc@gmail.com</a></li>\n");
      out.write("				</ul>\n");
      out.write("\n");
      out.write("			</div>\n");
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
      out.write("					\n");
      out.write("						<li class=\"m_nav_item menu__item\" id=\"moble_nav_item_3 dropdown\"> <a href=\"#\" class=\"menu__link dropdown-toggle\" data-toggle=\"dropdown\">");
      out.print(p.getName());
      out.write("  <b class=\"caret\"></b></a> \n");
      out.write("						   <ul class=\"dropdown-menu agile_short_dropdown\">\n");
      out.write("									<li><a href=\"Patient_profile.jsp\">Profile</a></li>\n");
      out.write("									<li><a href=\"Patient_changepassword.jsp\">Change Password</a></li>\n");
      out.write("									<li><a href=\"Patient_logout.jsp\">Logout</a></li>\n");
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
      out.write("				<li>Patient Profile</li>\n");
      out.write("			</ul>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("<!-- //banner1 -->\n");
      out.write("	<div class=\"banner-bottom\" id=\"about\">\n");
      out.write("		<div class=\"container\">\n");
      out.write("			<h2 class=\"w3_heade_tittle_agile\">Patient Profile</h2>\n");
      out.write("		    <p class=\"sub_t_agileits\">Get in touch...</p>\n");
      out.write("\n");
      out.write("           <div class=\"contact-top-agileits\">\n");
      out.write("               <div class=\"col-md-4 contact-grid \">\n");
      out.write("					<div class=\"contact-grid1 agileits-w3layouts\">\n");
      out.write("						<i class=\"fa fa-location-arrow\"></i>\n");
      out.write("						<div class=\"con-w3l-info\">\n");
      out.write("						   <h4>Address </h4>\n");
      out.write("						  <p>Near Kankariya,<span>Ahmedabad.</span></p>\n");
      out.write("						</div>\n");
      out.write("						<div class=\"clearfix\"></div>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("				<div class=\"col-md-4 contact-grid\">\n");
      out.write("					<div class=\"contact-grid2 w3\">\n");
      out.write("						<i class=\"fa fa-phone\" aria-hidden=\"true\"></i>\n");
      out.write("						<div class=\"con-w3l-info\">\n");
      out.write("						  <h4>Call Us</h4>\n");
      out.write("						   <p>+91 8200405262</p>\n");
      out.write("						</div>\n");
      out.write("						<div class=\"clearfix\"></div>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("				<div class=\"col-md-4 contact-grid\">\n");
      out.write("					<div class=\"contact-grid3 w3l\">\n");
      out.write("						<i class=\"fa fa-envelope\"></i>\n");
      out.write("						<div class=\"con-w3l-info\">\n");
      out.write("						  <h4>Email</h4>\n");
      out.write("						  <p><a href=\"mailto:info@example.com\">Khajinadoc@gmail.com</a>\n");
      out.write("						 \n");
      out.write("						  </p></div>\n");
      out.write("						  <div class=\"clearfix\"></div>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("				<div class=\"clearfix\"></div>\n");
      out.write("				\n");
      out.write("			</div>\n");
      out.write("      <section class=\"contact py-lg-4 py-md-3 py-sm-3 py-3\">\n");
      out.write("         <div class=\"container py-lg-5 py-md-4 py-sm-4 py-3\">\n");
      out.write("            <h3 class=\"title text-center mb-lg-5 mb-md-4 mb-sm-4 mb-3\">Patient Profile</h3>\n");
      out.write("            <div class=\"contact-list-grid\">\n");
      out.write("               <form action=\"PatientController\" method=\"post\">\n");
      out.write("                  <div class=\" agile-wls-contact-mid\">\n");
      out.write("                  <div class=\"form-group contact-forms\">\n");
      out.write("                        <input type=\"hidden\" class=\"form-control\" placeholder=\"Name\" name=\"id\" value=\"");
      out.print(p.getId() );
      out.write("\">\n");
      out.write("                     </div>\n");
      out.write("                     <div class=\"form-group contact-forms\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Name\" name=\"name\" value=\"");
      out.print(p.getName() );
      out.write("\">\n");
      out.write("                     </div>\n");
      out.write("                     <div class=\"form-group contact-forms\">\n");
      out.write("                        <input type=\"email\" class=\"form-control\" placeholder=\"Enter Email\" name=\"email\" value=\"");
      out.print( p.getEmail());
      out.write("\">\n");
      out.write("                     </div>\n");
      out.write("                     <div class=\"form-group contact-forms\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter Address\" name=\"address\" value=\"");
      out.print(p.getAddress());
      out.write("\">\n");
      out.write("                     </div>\n");
      out.write("                     <div class=\"form-group contact-forms\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter Contact no\" name=\"contact\" value=\"");
      out.print(p.getContact() );
      out.write("\">\n");
      out.write("                     </div>\n");
      out.write("                    <button type=\"submit\" name=\"action\" value=\"update\"  class=\"btn btn-block sent-butnn\">Update</button>\n");
      out.write("                  </div>\n");
      out.write("               </form>\n");
      out.write("            </div>\n");
      out.write("           </div>\n");
      out.write("         <!--//contact-map -->\n");
      out.write("      </section>\n");
      out.write("				  <ul class=\"agileits_social_list two\">\n");
      out.write("				        <li class=\"fallow\"> Follow Us :</li>\n");
      out.write("								<li><a href=\"#\" class=\"w3_agile_facebook\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("								<li><a href=\"#\" class=\"agile_twitter\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("								<li><a href=\"#\" class=\"w3_agile_dribble\"><i class=\"fa fa-dribbble\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("								<li><a href=\"#\" class=\"w3_agile_rss\"><i class=\"fa fa-rss\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("							</ul>\n");
      out.write("				         \n");
      out.write("			   </div>\n");
      out.write("	    </div>\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("<div class=\"footer\">\n");
      out.write("		<div class=\"container\">\n");
      out.write("			<h4>\n");
      out.write("				Subscribe to <span>Newsletter</span>\n");
      out.write("			</h4>\n");
      out.write("			<form action=\"#\" method=\"post\">\n");
      out.write("				<input type=\"email\" name=\"Email\" placeholder=\"Enter Your Email...\"\n");
      out.write("					required=\"\"> <input type=\"submit\" value=\"Send\">\n");
      out.write("			</form>\n");
      out.write("			<div class=\"agile_footer_copy\">\n");
      out.write("				<div class=\"w3agile_footer_grids\">\n");
      out.write("					<div class=\"col-md-4 w3agile_footer_grid\">\n");
      out.write("						<h3>About Us</h3>\n");
      out.write("						<p>\n");
      out.write("							\"Welcome to KhajinDoc, the leading doctor finder app for\n");
      out.write("							finding top-quality healthcare providers near you. Our app is\n");
      out.write("							designed to make it easy for you to find and book appointments\n");
      out.write("							with the best doctors, surgeons, and specialists in your area.</span>\n");
      out.write("						</p>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"col-md-4 w3agile_footer_grid\">\n");
      out.write("						<h3>Contact Info</h3>\n");
      out.write("						<ul>\n");
      out.write("							<li><i class=\"fa fa-map-marker\" aria-hidden=\"true\"></i>Near\n");
      out.write("								Kankariya <span>Ahmedabad.</span></li>\n");
      out.write("							<li><i class=\"fa fa-envelope-o\" aria-hidden=\"true\"></i><a\n");
      out.write("								href=\"khajinadoc@gmail.com\">khajinadoc@gmail.com</a></li>\n");
      out.write("							<li><i class=\"fa fa-phone\" aria-hidden=\"true\"></i>+91\n");
      out.write("								8200405262</li>\n");
      out.write("						</ul>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"col-md-4 w3agile_footer_grid w3agile_footer_grid1\">\n");
      out.write("						<h3>Navigation</h3>\n");
      out.write("						<ul>\n");
      out.write("							<li><span class=\"fa fa-long-arrow-right\" aria-hidden=\"true\"></span><a\n");
      out.write("								href=\"Department-home.jsp\">Department</a></li>\n");
      out.write("							<li><span class=\"fa fa-long-arrow-right\" aria-hidden=\"true\"></span><a\n");
      out.write("								href=\"appointment.jsp\">Appointment</a></li>\n");
      out.write("							<li><span class=\"fa fa-long-arrow-right\" aria-hidden=\"true\"></span><a\n");
      out.write("								href=\"about.jsp\">About</a></li>\n");
      out.write("							<li><span class=\"fa fa-long-arrow-right\" aria-hidden=\"true\"></span><a\n");
      out.write("								href=\"contact.jsp\">Contact Us</a></li>\n");
      out.write("						</ul>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"clearfix\"></div>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"w3_agileits_copy_right_social\">\n");
      out.write("				<div class=\"col-md-6 agileits_w3layouts_copy_right\">\n");
      out.write("					<p>&copy; 2023 KHAJINADOC. All rights reserved.</p>\n");
      out.write("				</div>\n");
      out.write("				<div class=\"col-md-6 w3_agile_copy_right\">\n");
      out.write("					<ul class=\"agileits_social_list\">\n");
      out.write("						<li><a href=\"#\" class=\"w3_agile_facebook\"><i\n");
      out.write("								class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("						<li><a href=\"#\" class=\"agile_twitter\"><i\n");
      out.write("								class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("						<li><a href=\"#\" class=\"w3_agile_dribble\"><i\n");
      out.write("								class=\"fa fa-dribbble\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("						<li><a href=\"#\" class=\"w3_agile_rss\"><i class=\"fa fa-rss\"\n");
      out.write("								aria-hidden=\"true\"></i></a></li>\n");
      out.write("					</ul>\n");
      out.write("				</div>\n");
      out.write("				<div class=\"clearfix\"></div>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("	<!-- //footer -->\n");
      out.write("	<a href=\"#\" id=\"toTop\" style=\"display: block;\"> <span\n");
      out.write("		id=\"toTopHover\" style=\"opacity: 1;\"> </span></a>\n");
      out.write("	<!-- js -->\n");
      out.write("	<script src=\"js/jquery-2.2.3.min.js\"></script>\n");
      out.write("	<script src=\"js/JiSlider.js\"></script>\n");
      out.write("	<script>\n");
      out.write("		$(window).load(function() {\n");
      out.write("			$('#JiSlider').JiSlider({\n");
      out.write("				color : '#fff',\n");
      out.write("				start : 3,\n");
      out.write("				reverse : true\n");
      out.write("			}).addClass('ff')\n");
      out.write("		})\n");
      out.write("	</script>\n");
      out.write("	<script type=\"text/javascript\">\n");
      out.write("		var _gaq = _gaq || [];\n");
      out.write("		_gaq.push([ '_setAccount', 'UA-36251023-1' ]);\n");
      out.write("		_gaq.push([ '_setDomainName', 'jqueryscript.net' ]);\n");
      out.write("		_gaq.push([ '_trackPageview' ]);\n");
      out.write("\n");
      out.write("		(function() {\n");
      out.write("			var ga = document.createElement('script');\n");
      out.write("			ga.type = 'text/javascript';\n");
      out.write("			ga.async = true;\n");
      out.write("			ga.src = ('https:' == document.location.protocol ? 'https://ssl'\n");
      out.write("					: 'http://www')\n");
      out.write("					+ '.google-analytics.com/ga.js';\n");
      out.write("			var s = document.getElementsByTagName('script')[0];\n");
      out.write("			s.parentNode.insertBefore(ga, s);\n");
      out.write("		})();\n");
      out.write("	</script>\n");
      out.write("\n");
      out.write("	<script src=\"js/ziehharmonika.js\"></script>\n");
      out.write("	<script>\n");
      out.write("		$(document).ready(function() {\n");
      out.write("			$('.ziehharmonika').ziehharmonika({\n");
      out.write("				collapsible : true,\n");
      out.write("				prefix : ''\n");
      out.write("			});\n");
      out.write("		});\n");
      out.write("	</script>\n");
      out.write("	<!-- stats -->\n");
      out.write("	<script src=\"js/jquery.waypoints.min.js\"></script>\n");
      out.write("	<script src=\"js/jquery.countup.js\"></script>\n");
      out.write("	<script>\n");
      out.write("		$('.counter').countUp();\n");
      out.write("	</script>\n");
      out.write("	<!-- //stats -->\n");
      out.write("	<script type=\"text/javascript\">\n");
      out.write("		$(function() {\n");
      out.write("			$(\"#bars li .bar\").each(function(key, bar) {\n");
      out.write("				var percentage = $(this).data('percentage');\n");
      out.write("\n");
      out.write("				$(this).animate({\n");
      out.write("					'height' : percentage + '%'\n");
      out.write("				}, 1000);\n");
      out.write("			})\n");
      out.write("		})\n");
      out.write("	</script>\n");
      out.write("\n");
      out.write("	<!-- bootstrap-pop-up -->\n");
      out.write("	<div class=\"modal video-modal fade\" id=\"myModal\" tabindex=\"-1\"\n");
      out.write("		role=\"dialog\" aria-labelledby=\"myModal\">\n");
      out.write("		<div class=\"modal-dialog\" role=\"document\">\n");
      out.write("			<div class=\"modal-content\">\n");
      out.write("				<div class=\"modal-header\">\n");
      out.write("					Health Plus\n");
      out.write("					<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\n");
      out.write("						aria-label=\"Close\">\n");
      out.write("						<span aria-hidden=\"true\">&times;</span>\n");
      out.write("					</button>\n");
      out.write("				</div>\n");
      out.write("				<section>\n");
      out.write("					<div class=\"modal-body\">\n");
      out.write("						<img src=\"images/g9.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("						<p>\n");
      out.write("							Ut enim ad minima veniam, quis nostrum exercitationem ullam\n");
      out.write("							corporis suscipit laboriosam, nisi ut aliquid ex ea commodi\n");
      out.write("							consequatur? Quis autem vel eum iure reprehenderit qui in ea\n");
      out.write("							voluptate velit esse quam nihil molestiae consequatur, vel illum\n");
      out.write("							qui dolorem eum fugiat quo voluptas nulla pariatur. <i>\" Quis\n");
      out.write("								autem vel eum iure reprehenderit qui in ea voluptate velit esse\n");
      out.write("								quam nihil molestiae consequatur.</i>\n");
      out.write("						</p>\n");
      out.write("					</div>\n");
      out.write("				</section>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("	<!-- //bootstrap-pop-up -->\n");
      out.write("\n");
      out.write("	<!-- flexSlider -->\n");
      out.write("	<script defer src=\"js/jquery.flexslider.js\"></script>\n");
      out.write("	<script type=\"text/javascript\">\n");
      out.write("		$(window).load(function() {\n");
      out.write("			$('.flexslider').flexslider({\n");
      out.write("				animation : \"slide\",\n");
      out.write("				start : function(slider) {\n");
      out.write("					$('body').removeClass('loading');\n");
      out.write("				}\n");
      out.write("			});\n");
      out.write("		});\n");
      out.write("	</script>\n");
      out.write("	<!-- //flexSlider -->\n");
      out.write("\n");
      out.write("\n");
      out.write("	<!-- start-smoth-scrolling -->\n");
      out.write("	<script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("	<script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("	<script type=\"text/javascript\">\n");
      out.write("		jQuery(document).ready(function($) {\n");
      out.write("			$(\".scroll\").click(function(event) {\n");
      out.write("				event.preventDefault();\n");
      out.write("				$('html,body').animate({\n");
      out.write("					scrollTop : $(this.hash).offset().top\n");
      out.write("				}, 1000);\n");
      out.write("			});\n");
      out.write("		});\n");
      out.write("	</script>\n");
      out.write("	<!-- start-smoth-scrolling -->\n");
      out.write("	<script src=\"js/jarallax.js\"></script>\n");
      out.write("	<script src=\"js/SmoothScroll.min.js\"></script>\n");
      out.write("	<script type=\"text/javascript\">\n");
      out.write("		/* init Jarallax */\n");
      out.write("		$('.jarallax').jarallax({\n");
      out.write("			speed : 0.5,\n");
      out.write("			imgWidth : 1366,\n");
      out.write("			imgHeight : 768\n");
      out.write("		})\n");
      out.write("	</script>\n");
      out.write("\n");
      out.write("	<script src=\"js/bootstrap.js\"></script>\n");
      out.write("	<!-- //for bootstrap working -->\n");
      out.write("	<!-- here stars scrolling icon -->\n");
      out.write("	<script type=\"text/javascript\">\n");
      out.write("		$(document).ready(function() {\n");
      out.write("			/*\n");
      out.write("				var defaults = {\n");
      out.write("				containerID: 'toTop', // fading element id\n");
      out.write("				containerHoverID: 'toTopHover', // fading element hover id\n");
      out.write("				scrollSpeed: 1200,\n");
      out.write("				easingType: 'linear' \n");
      out.write("				};\n");
      out.write("			 */\n");
      out.write("\n");
      out.write("			$().UItoTop({\n");
      out.write("				easingType : 'easeOutQuart'\n");
      out.write("			});\n");
      out.write("\n");
      out.write("		});\n");
      out.write("	</script>\n");
      out.write("	<!-- //here ends scrolling icon -->\n");
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
