package org.apache.jsp.jsp.jsp2.el;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class basic_002darithmetic_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("<!--\r\n");
      out.write(" Licensed to the Apache Software Foundation (ASF) under one or more\r\n");
      out.write("  contributor license agreements.  See the NOTICE file distributed with\r\n");
      out.write("  this work for additional information regarding copyright ownership.\r\n");
      out.write("  The ASF licenses this file to You under the Apache License, Version 2.0\r\n");
      out.write("  (the \"License\"); you may not use this file except in compliance with\r\n");
      out.write("  the License.  You may obtain a copy of the License at\r\n");
      out.write("\r\n");
      out.write("      http://www.apache.org/licenses/LICENSE-2.0\r\n");
      out.write("\r\n");
      out.write("  Unless required by applicable law or agreed to in writing, software\r\n");
      out.write("  distributed under the License is distributed on an \"AS IS\" BASIS,\r\n");
      out.write("  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\r\n");
      out.write("  See the License for the specific language governing permissions and\r\n");
      out.write("  limitations under the License.\r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <title>JSP 2.0 Expression Language - Basic Arithmetic</title>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <h1>JSP 2.0 Expression Language - Basic Arithmetic</h1>\r\n");
      out.write("    <hr>\r\n");
      out.write("    This example illustrates basic Expression Language arithmetic.\r\n");
      out.write("    Addition (+), subtraction (-), multiplication (*), division (/ or div), \r\n");
      out.write("    and modulus (% or mod) are all supported.  Error conditions, like\r\n");
      out.write("    division by zero, are handled gracefully.\r\n");
      out.write("    <br>\r\n");
      out.write("    <blockquote>\r\n");
      out.write("      <code>\r\n");
      out.write("        <table border=\"1\">\r\n");
      out.write("          <thead>\r\n");
      out.write("\t    <td><b>EL Expression</b></td>\r\n");
      out.write("\t    <td><b>Result</b></td>\r\n");
      out.write("\t  </thead>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t    <td>${1}</td>\r\n");
      out.write("\t    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t    <td>${1 + 2}</td>\r\n");
      out.write("\t    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${1 + 2}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t    <td>${1.2 + 2.3}</td>\r\n");
      out.write("\t    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${1.2 + 2.3}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t    <td>${1.2E4 + 1.4}</td>\r\n");
      out.write("\t    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${1.2E4 + 1.4}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t    <td>${-4 - 2}</td>\r\n");
      out.write("\t    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${-4 - 2}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t    <td>${21 * 2}</td>\r\n");
      out.write("\t    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${21 * 2}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t    <td>${3/4}</td>\r\n");
      out.write("\t    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${3/4}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t    <td>${3 div 4}</td>\r\n");
      out.write("\t    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${3 div 4}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t    <td>${3/0}</td>\r\n");
      out.write("\t    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${3/0}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t    <td>${10%4}</td>\r\n");
      out.write("\t    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${10%4}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t    <td>${10 mod 4}</td>\r\n");
      out.write("\t    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${10 mod 4}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>${(1==2) ? 3 : 4}</td>\r\n");
      out.write("      <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(1==2) ? 3 : 4}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("      </code>\r\n");
      out.write("    </blockquote>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
