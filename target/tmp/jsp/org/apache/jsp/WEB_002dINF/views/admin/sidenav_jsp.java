package org.apache.jsp.WEB_002dINF.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sidenav_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div>\n");
      out.write("\t<ul class=\"nav nav-list\">\n");
      out.write("\t\t<li class=\"nav-header\">\n");
      out.write("\t\t\tCustomer Management\n");
      out.write("\t\t</li>\n");
      out.write("\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t<li class=\"\">\n");
      out.write("\t\t\t<a href=\"/admin/customers\">Master List</a>\n");
      out.write("\t\t</li>\n");
      out.write("\t\t<li class=\"nav-header\">\n");
      out.write("\t\t\tStore Management\n");
      out.write("\t\t</li>\n");
      out.write("\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t<li class=\"\">\n");
      out.write("\t\t\t<a href=\"/admin/stores\">Master List</a>\n");
      out.write("\t\t</li>\n");
      out.write("\t\t<li class=\"nav-header\">\n");
      out.write("\t\t\tCategory Management\n");
      out.write("\t\t</li>\n");
      out.write("\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t<li class=\"\">\n");
      out.write("\t\t\t<a href=\"/admin/categories\">Master List</a>\n");
      out.write("\t\t</li>\n");
      out.write("\t\t<li class=\"nav-header\">\n");
      out.write("\t\t\tProduct Management\n");
      out.write("\t\t</li>\n");
      out.write("\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t<li class=\"\">\n");
      out.write("\t\t\t<a href=\"/admin/products\">Master List</a>\n");
      out.write("\t\t</li>\n");
      out.write("\t\t<li class=\"nav-header\">\n");
      out.write("\t\t\tSale Transaction Management\n");
      out.write("\t\t</li>\n");
      out.write("\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t<li class=\"\">\n");
      out.write("\t\t\t<a href=\"/admin/saletransactions\">Master List</a>\n");
      out.write("\t\t</li>\n");
      out.write("\t</ul>\n");
      out.write("</div>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
