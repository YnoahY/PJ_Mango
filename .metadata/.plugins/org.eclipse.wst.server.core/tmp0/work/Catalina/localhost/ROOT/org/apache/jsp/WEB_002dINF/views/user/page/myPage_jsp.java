/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.64
 * Generated at: 2022-11-01 07:55:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.user.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import mango.mango.model.MemberVO;
import mango.mango.model.ReserveVO;
import mango.mango.model.OrdersPayVO;
import mango.mango.model.AskVO;

public final class myPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("mango.mango.model.MemberVO");
    _jspx_imports_classes.add("mango.mango.model.OrdersPayVO");
    _jspx_imports_classes.add("mango.mango.model.ReserveVO");
    _jspx_imports_classes.add("mango.mango.model.AskVO");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");

MemberVO login = (MemberVO) session.getAttribute("login");
if (login != null)
   System.out.println(login.toString());

      out.write('\r');
      out.write('\n');

List<ReserveVO> list = (List<ReserveVO>) request.getAttribute("reserveList");

      out.write('\r');
      out.write('\n');

List<OrdersPayVO> ordersPayList = (List<OrdersPayVO>) request.getAttribute("ordersPayList");

      out.write('\r');
      out.write('\n');

List<AskVO> askList = (List<AskVO>) request.getAttribute("askList");

      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>마이페이지</title>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/reset.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/myPage.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("   <div class=\"myPage_wrap\">\r\n");
      out.write("    <!-- 사이드바 -->\r\n");
      out.write("     <aside class=\"sideBar\">\r\n");
      out.write("       <div class=\"side_head\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/page/myPage.do\">MY HOME</a></div>\r\n");
      out.write("       <div class=\"side_body\">\r\n");
      out.write("         <div><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/page/myReserve.do\">예매 목록</a></div>\r\n");
      out.write("         <div><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/page/myOrdersPage.do\">구매 목록</a></div>\r\n");
      out.write("         <div><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/page/myAskList.do\">문의 목록</a></div>\r\n");
      out.write("         <div><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/page/memberModify.do\">회원정보수정</a></div>\r\n");
      out.write("       </div>\r\n");
      out.write("     </aside>\r\n");
      out.write("     \r\n");
      out.write("     <!-- 예매, 구매, 문의 전체 묶음 -->\r\n");
      out.write("     <div class=\"myPage_container\">\r\n");
      out.write("\r\n");
      out.write("         <!--나의 예매 목록 title -->\r\n");
      out.write("         <div class=\"myPage_subtitle\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/page/myReserve.do\">예매 목록</a></div>\r\n");
      out.write("         \r\n");
      out.write("         <!-- 예매 전체 묶음 -->\r\n");
      out.write("         <div class=\"reserveList_wrap\">\r\n");
      out.write("          ");

          if (list == null) {
          
      out.write("\r\n");
      out.write("          <div>예약한 영화가 없습니다</div>\r\n");
      out.write("          ");

          } else {
          for (int i = 0; i < list.size(); i++) {
             ReserveVO reserveVO = list.get(i);
          
      out.write("\r\n");
      out.write("             <div class=\"reserveList_card\">\r\n");
      out.write("                <div class=\"reserveId_title\">\r\n");
      out.write("                	<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/page/myReserve.do\">예매번호 : ");
      out.print(reserveVO.getReserveSequence());
      out.write("</a>\r\n");
      out.write("                </div>   \r\n");
      out.write("                <div class=\"information_wrapper\">\r\n");
      out.write("                   <div class=\"wrapper_content\">\r\n");
      out.write("                      <div class=\"reserve_info\">");
      out.print(reserveVO.getTitle());
      out.write("</div>\r\n");
      out.write("                         <div class=\"reserve_pos\">\r\n");
      out.write("                         <div class=\"reserve_content\">");
      out.print(reserveVO.getSelectedTheater());
      out.write("</div>\r\n");
      out.write("                         <div class=\"reserve_content\">자리 : ");
      out.print(reserveVO.getSelectedSeat());
      out.write("</div>\r\n");
      out.write("                         <div class=\"reserve_content\">일시 : ");
      out.print(reserveVO.getMovieDate());
      out.write(' ');
      out.print(reserveVO.getRunningTime());
      out.write("</div>\r\n");
      out.write("                         </div>\r\n");
      out.write("                   </div>\r\n");
      out.write("                </div>  \r\n");
      out.write("                              \r\n");
      out.write("                <div class=\"reserve_content_wrapper\">\r\n");
      out.write("                   <div class=\"font_size\">결제일</div>\r\n");
      out.write("                   &nbsp;/&nbsp;\r\n");
      out.write("                   <div class=\"reserve_content\">");
      out.print(reserveVO.getPayVO().getPayDate());
      out.write("</div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"orders_content_wrapper\">\r\n");
      out.write("                   <div class=\"font_size\">결제 비용</div>\r\n");
      out.write("                   &nbsp;/&nbsp;\r\n");
      out.write("                   <div class=\"reserve_content\">");
      out.print(reserveVO.getPayVO().getPayMoney());
      out.write("원</div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("               ");

               }
               
      out.write("\r\n");
      out.write("\r\n");
      out.write("               ");

               }
               
      out.write("                        \r\n");
      out.write("         </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("         <!--나의 구매 목록 title -->\r\n");
      out.write("         <div class=\"myPage_subtitle\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/page/myOrdersPage.do\">구매 목록</a></div>\r\n");
      out.write("         \r\n");
      out.write("         <!-- 구매 상품 전체 묶음 -->\r\n");
      out.write("         <div class=\"ordersList_wrap\">\r\n");
      out.write("          ");

          if (ordersPayList == null) {
          
      out.write("\r\n");
      out.write("          <div>구매한 상품이 없습니다</div>\r\n");
      out.write("          ");

          } else {
          for (int i = 0; i < ordersPayList.size(); i++) {
             OrdersPayVO ordersPayVO = ordersPayList.get(i);
          
      out.write("         \r\n");
      out.write("             <div class=\"ordersList_card\">\r\n");
      out.write("                <div class=\"ordersId_title\">\r\n");
      out.write("                	<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/page/myOrdersPage.do\">주문번호 : ");
      out.print(ordersPayVO.getOrdersId());
      out.write("</a>\r\n");
      out.write("                </div>   \r\n");
      out.write("                <div class=\"information_wrapper\">\r\n");
      out.write("                   <div class=\"wrapper_content\">\r\n");
      out.write("                      <div class=\"wrapper_content_title\">주문 상품</div>\r\n");
      out.write("                      <div class=\"orders_info\"></div>\r\n");
      out.write("                   </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"orders_content_wrapper\">\r\n");
      out.write("                   <div class=\"font_size\">주문일</div>\r\n");
      out.write("                   &nbsp;/&nbsp;\r\n");
      out.write("                   <div class=\"goods_name\">");
      out.print(ordersPayVO.getOrdersPayDate());
      out.write("</div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"orders_content_wrapper\">\r\n");
      out.write("                   <div class=\"font_size\">결제 수단</div>\r\n");
      out.write("                   &nbsp;/&nbsp;\r\n");
      out.write("                   <div class=\"goods_name\">카카오페이</div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"orders_content_wrapper\">\r\n");
      out.write("                   <div class=\"font_size\">결제 비용</div>\r\n");
      out.write("                   &nbsp;/&nbsp;\r\n");
      out.write("                   <div class=\"goods_name\">");
      out.print(ordersPayVO.getOrdersPayMoney());
      out.write("원</div>\r\n");
      out.write("                </div>     \r\n");
      out.write("           </div> \r\n");
      out.write("               ");

               }
               
      out.write("\r\n");
      out.write("\r\n");
      out.write("               ");

               }
               
      out.write("                               \r\n");
      out.write("         </div> \r\n");
      out.write("\r\n");
      out.write("         <!--나의 문의 내역 title -->\r\n");
      out.write("         <div class=\"myPage_subtitle\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/page/myAskList.do\">문의 내역</a></div>\r\n");
      out.write("         \r\n");
      out.write("         <!-- 문의 전체 묶음 -->\r\n");
      out.write("         <div class=\"ordersList_wrap\">\r\n");
      out.write("           ");

          if (askList == null) {
          
      out.write("\r\n");
      out.write("          <div>문의 내역이 없습니다</div>\r\n");
      out.write("          ");

          } else {
          for (int i = 0; i < askList.size(); i++) {
             AskVO askVO = askList.get(i);
          
      out.write("          \r\n");
      out.write("             <div class=\"ordersList_card\">\r\n");
      out.write("                <div class=\"ordersId_title\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/page/myAskList.do\">문의 번호 : ");
      out.print(askVO.getAskId());
      out.write("</a></div>   \r\n");
      out.write("                <div class=\"information_wrapper\">\r\n");
      out.write("                   <div class=\"wrapper_content\">\r\n");
      out.write("                      <div class=\"wrapper_content_title\">문의 종류</div>\r\n");
      out.write("                      <div class=\"orders_info\">");
      out.print(askVO.getAskCat());
      out.write("</div>\r\n");
      out.write("                   </div>\r\n");
      out.write("                   <div class=\"wrapper_content\">\r\n");
      out.write("                      <div class=\"wrapper_content_title\">문의 제목</div>\r\n");
      out.write("                      <div class=\"orders_info\">");
      out.print(askVO.getAskSubject());
      out.write("</div>\r\n");
      out.write("                   </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"orders_content_wrapper\">\r\n");
      out.write("                   <div class=\"font_size\">문의일</div>\r\n");
      out.write("                   &nbsp;/&nbsp;\r\n");
      out.write("                   <div class=\"goods_name\">");
      out.print(askVO.getAskDate());
      out.write("</div>\r\n");
      out.write("                </div>     \r\n");
      out.write("           </div> \r\n");
      out.write("               ");

               }
               
      out.write("\r\n");
      out.write("               ");

               }
               
      out.write("                               \r\n");
      out.write("         </div>              \r\n");
      out.write("     </div>\r\n");
      out.write("   </div>\r\n");
      out.write("   <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/myPage.js\"></script>\r\n");
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
