package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import sprint2.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


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
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write(" \n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Team6: PSD Sprint 2</title>\n");
      out.write("\t\t      <style type=\"text/css\"> \n");
      out.write("<!-- \n");
      out.write("body  {\n");
      out.write("\tfont: 100% Verdana, Arial, Helvetica, sans-serif;\n");
      out.write("\tbackground: #666666;\n");
      out.write("\tmargin: 0; \n");
      out.write("\tpadding: 0;\n");
      out.write("\ttext-align: center; \n");
      out.write("\tcolor: #000000;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".twoColElsLt #container { \n");
      out.write("\twidth: 46em;  \n");
      out.write("\tbackground: #FFFFFF;\n");
      out.write("\tmargin: 0 auto; \n");
      out.write("\tborder: 1px solid #000000;\n");
      out.write("\ttext-align: left; \n");
      out.write("} \n");
      out.write("\n");
      out.write("\n");
      out.write(".twoColElsLt #sidebar1 {\n");
      out.write("\tfloat: left; \n");
      out.write("\twidth: 12em;\n");
      out.write("\tbackground: #EBEBEB; \n");
      out.write("\tpadding: 15px 0; \n");
      out.write("}\n");
      out.write(".twoColElsLt #sidebar1 h3, .twoColElsLt #sidebar1 p {\n");
      out.write("\tmargin-left: 10px; \n");
      out.write("\tmargin-right: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".twoColElsLt #mainContent {\n");
      out.write(" \tmargin: 0 1.5em 0 13em; \n");
      out.write("} \n");
      out.write("\n");
      out.write("\n");
      out.write(".fltrt {\n");
      out.write("\tfloat: right;\n");
      out.write("\tmargin-left: 8px;\n");
      out.write("}\n");
      out.write(".fltlft {\n");
      out.write("\tfloat: left;\n");
      out.write("\tmargin-right: 8px;\n");
      out.write("}\n");
      out.write(".clearfloat { \n");
      out.write("\tclear:both;\n");
      out.write("    height:0;\n");
      out.write("    font-size: 1px;\n");
      out.write("    line-height: 0px;\n");
      out.write("}\n");
      out.write("--> \n");
      out.write("</style>\n");
      out.write("  \n");
      out.write("    </head>\n");
      out.write(" \n");
      out.write("   <body class=\"twoColElsLt\">\n");
      out.write("\n");
      out.write("<div id=\"container\">\n");
      out.write("  <div id=\"sidebar1\">\n");
      out.write("    <h3></h3>\n");
      out.write("  \n");
      out.write("  <!-- end #sidebar1 --></div>\n");
      out.write("  <div id=\"mainContent\">\n");
      out.write("  \n");
      out.write("  \t\t<h1>Login Page</h1>\n");
      out.write("  \t\t\n");
      out.write("  \t\t<form method=\"post\">\n");
      out.write("\t\tLogin ID: <input type=\"text\" name=\"username\">\n");
      out.write("\t\t<br />\n");
      out.write("\t\tPassword: <input type=\"password\" name=\"password\" />\n");
      out.write("\t\t<br />\n");
      out.write("\t\t<input type=\"submit\" value=\"Submit\" />\n");
      out.write("\t\t\n");
      out.write("\t\t</form>\n");
      out.write("  \t\t\n");
      out.write("  \t\t");
 if ("admin".equals(request.getParameter("username")) && "admin".equals(request.getParameter("password"))) { 
      out.write("\n");
      out.write("\t\t\t");
      if (true) {
        _jspx_page_context.forward("admin.html");
        return;
      }
      out.write("\n");
      out.write("\t\t");
 } 
		
		else if ("user".equals(request.getParameter("username")) && "user".equals(request.getParameter("password"))) { 
      out.write("\n");
      out.write("\t\t\t");
      if (true) {
        _jspx_page_context.forward("user.html");
        return;
      }
      out.write("\n");
      out.write("\t\t");
 } 
		
		if(request.getParameter("username") != null && request.getParameter("password") != null ) { 
      out.write("\n");
      out.write("\t\t\t <br>\n");
      out.write("\t\t\t <font color=\"red\">Please re-enter the username and password! </font>\n");
      out.write("\t\t\t <br>\n");
      out.write("\t\t");
 } 
		
		User users = new User();
 		
 		for(int i=0; i<users.size; i++){
 			out.println(users.getStuName);
 		}
		
      out.write("\n");
      out.write(" \n");
      out.write(" \t\t<hr><ol> \n");
      out.write("        <p>Copyright @ Fantastic 4, Team 6.</p>\n");
      out.write("    <!-- end #mainContent --></div>\n");
      out.write("\t<br class=\"clearfloat\" />\n");
      out.write("<!-- end #container --></div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
