/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.64
 * Generated at: 2022-10-21 05:33:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.user.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mango.mango.model.MemberVO;

public final class orders_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(12);
    _jspx_dependants.put("jar:file:/C:/Mango/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Mango/WEB-INF/lib/egovframework.rte.ptl.mvc-3.8.0.jar!/META-INF/taglib.tld", Long.valueOf(1539665194000L));
    _jspx_dependants.put("/WEB-INF/views/taglib.jsp", Long.valueOf(1659599458555L));
    _jspx_dependants.put("/WEB-INF/lib/egovframework.rte.ptl.mvc-3.8.0.jar", Long.valueOf(1663548654023L));
    _jspx_dependants.put("jar:file:/C:/Mango/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Mango/WEB-INF/lib/spring-webmvc-4.3.16.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1523252374000L));
    _jspx_dependants.put("jar:file:/C:/Mango/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Mango/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/C:/Mango/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Mango/WEB-INF/lib/spring-webmvc-4.3.16.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1523252374000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1654653023355L));
    _jspx_dependants.put("jar:file:/C:/Mango/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Mango/WEB-INF/lib/spring-security-taglibs-4.2.5.RELEASE.jar!/META-INF/security.tld", Long.valueOf(1522394476000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-security-taglibs-4.2.5.RELEASE.jar", Long.valueOf(1663548649495L));
    _jspx_dependants.put("jar:file:/C:/Mango/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Mango/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/C:/Mango/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Mango/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.3.16.RELEASE.jar", Long.valueOf(1663548648291L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("mango.mango.model.MemberVO");
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

MemberVO login = (MemberVO) session.getAttribute("login");
if (login != null)
   System.out.println(login.toString());

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>order</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/reset.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/orders.css\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("   <div class=\"orders_wrapper\">\r\n");
      out.write("      <div class=\"orders_wrapper_title\">주문 결제</div>      \r\n");
      out.write("<!-- 구매자 정보 -->\r\n");
      out.write("      <div class=\"member_detail detail_wrapper\">\r\n");
      out.write("         <div class=\"title_bold_big\">구매자 정보</div>\r\n");
      out.write("         <div class=\"margin_top\">구매자 이름: <span class=\"margin_left\">");
      out.print(login.getName());
      out.write("</span></div>\r\n");
      out.write("         <div>핸드폰 번호: <span class=\"margin_left\">");
      out.print(login.getPhone());
      out.write("</span></div>\r\n");
      out.write("         <div>우편번호 : <span class=\"margin_left\">");
      out.print(login.getZipNo());
      out.write("</span></div>\r\n");
      out.write("         <div>도로명 주소 : <span class=\"margin_left\">");
      out.print(login.getAddress());
      out.write("</span></div>\r\n");
      out.write("      </div>  \r\n");
      out.write("<!-- 배송지 정보 -->\r\n");
      out.write("      <div class=\"delivery_detail detail_wrapper\">\r\n");
      out.write("         <div class=\"title_bold_big\">수령인 정보</div>\r\n");
      out.write("         <div class=\"margin_top\">\r\n");
      out.write("            <form action=\"/page/orders/update.do\" method=\"post\">\r\n");
      out.write("                  <div class=\"modify_orders\">\r\n");
      out.write("                     <div>수령인 이름: </div>\r\n");
      out.write("                     <div><input name=\"receiverName\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ordersList[0].receiverName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></div>\r\n");
      out.write("                     <div></div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"modify_orders\">\r\n");
      out.write("                     <div>핸드폰 번호: </div>\r\n");
      out.write("                     <div><input id=\"phone\" name=\"receiverPhone\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ordersList[0].receiverPhone}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></div>\r\n");
      out.write("                     <div><button class=\"md_btn\" id=\"ph\" class=\"pnCheckButton\" type=\"button\" onClick=\"opensms();\">번호인증</button></div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"modify_orders\">\r\n");
      out.write("                     <div>우편 번호: </div>\r\n");
      out.write("                     <div><input name=\"receiverZipno\" id=\"zipNo\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ordersList[0].receiverZipno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></div>\r\n");
      out.write("                     <div><button class=\"md_btn\" id=\"jusoCheck\" type=\"button\" onclick=\"goPopup();\">주소검색</button></div>         \r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"modify_orders\">\r\n");
      out.write("                     <div>도로명 주소: </div>\r\n");
      out.write("                     <div><input name=\"receiverAddress\" id=\"address\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ordersList[0].receiverAddress}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></div>\r\n");
      out.write("                     <div></div>         \r\n");
      out.write("                  </div>\r\n");
      out.write("                  <input type=\"hidden\" name=\"ordersId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ordersList[0].ordersId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                  <input class=\"modify_orders_btn\" type=\"submit\" value=\"수정 저장\">\r\n");
      out.write("               </form>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>       \r\n");
      out.write("<!-- 결제하기 -->\r\n");
      out.write("      <div class=\"pay_detail\">\r\n");
      out.write("         <div class=\"pay_total\">총 결제액:  <span class=\"comma_price\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ordersList[0].totalPrice}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span></div>\r\n");
      out.write("         <div class=\"pay_submit\">\r\n");
      out.write("            <form action=\"/page/ordersKakao/insert.do\" method=\"post\">\r\n");
      out.write("               <span class=\"orders_pay\">결제하기</span>\r\n");
      out.write("               <input type=\"hidden\" name=\"OrdersId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ordersList[0].ordersId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("               <input type=\"hidden\" name=\"OrdersPayMoney\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ordersList[0].totalPrice}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("               <button type=\"submit\"><img class=\"btn\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/images/payment_icon_yellow_medium.png\"></button>\r\n");
      out.write("            </form>\r\n");
      out.write("         </div> \r\n");
      out.write("      </div>\r\n");
      out.write("   </div>\r\n");
      out.write("   <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/orders.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
