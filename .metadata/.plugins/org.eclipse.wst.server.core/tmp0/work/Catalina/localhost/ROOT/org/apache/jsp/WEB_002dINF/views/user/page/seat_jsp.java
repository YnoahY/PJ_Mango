/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.64
 * Generated at: 2022-11-01 07:22:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.user.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mango.mango.model.ReserveVO;

public final class seat_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("mango.mango.model.ReserveVO");
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

request.setCharacterEncoding("UTF-8");
String theaterKind = request.getParameter("theaterKind");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");

ReserveVO reserve = (ReserveVO) request.getAttribute("reserve");

      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>Document</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/reset.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/seat.css\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("<link rel='stylesheet'\r\n");
      out.write("	href='//cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/css/toastr.min.css' />\r\n");
      out.write("<script\r\n");
      out.write("	src='//cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/js/toastr.min.js'></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"select-container\">\r\n");
      out.write("		<div class=\"select-wrapper\">\r\n");
      out.write("			<div class=\"select-title\">인원/좌석</div>\r\n");
      out.write("			<div class=\"select-seat-container\">\r\n");
      out.write("				<div class=\"select-seat-number-container\">\r\n");
      out.write("					<div class=\"select-seat-number-wrapper\">\r\n");
      out.write("						<div class=\"select-seat\">\r\n");
      out.write("							<div class=\"select-seat-age\">일반</div>\r\n");
      out.write("							<div class=\"select-seat-number\">\r\n");
      out.write("								<ul class=\"select-seat-ul select-seat-ul-normal\">\r\n");
      out.write("									<li class=\"select-number-normal \">0</li>\r\n");
      out.write("									<li class=\"select-number-normal\">1</li>\r\n");
      out.write("									<li class=\"select-number-normal\">2</li>\r\n");
      out.write("									<li class=\"select-number-normal\">3</li>\r\n");
      out.write("									<li class=\"select-number-normal\">4</li>\r\n");
      out.write("									<li class=\"select-number-normal\">5</li>								\r\n");
      out.write("								</ul>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"select-seat\">\r\n");
      out.write("							<div class=\"select-seat-age\">청소년</div>\r\n");
      out.write("							<div class=\"select-seat-number\">\r\n");
      out.write("								<ul class=\"select-seat-ul select-seat-ul-teen\">\r\n");
      out.write("									<li class=\"select-number-teen\">0</li>\r\n");
      out.write("									<li class=\"select-number-teen\">1</li>\r\n");
      out.write("									<li class=\"select-number-teen\">2</li>\r\n");
      out.write("									<li class=\"select-number-teen\">3</li>\r\n");
      out.write("									<li class=\"select-number-teen\">4</li>\r\n");
      out.write("									<li class=\"select-number-teen\">5</li>									\r\n");
      out.write("								</ul>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"select-seat\">\r\n");
      out.write("							<div class=\"select-seat-age\">우대</div>\r\n");
      out.write("							<div class=\"select-seat-number\">\r\n");
      out.write("								<ul class=\"select-seat-ul  select-seat-ul-old\">\r\n");
      out.write("									<li class=\"select-number-old\">0</li>\r\n");
      out.write("									<li class=\"select-number-old\">1</li>\r\n");
      out.write("									<li class=\"select-number-old\">2</li>\r\n");
      out.write("									<li class=\"select-number-old\">3</li>\r\n");
      out.write("									<li class=\"select-number-old\">4</li>\r\n");
      out.write("									<li class=\"select-number-old\">5</li>									\r\n");
      out.write("								</ul>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"reserve-number-wrapper\">\r\n");
      out.write("						<div class=\"reserve-number-title\">선택된 좌석 수</div>\r\n");
      out.write("						<div class=\"reserve-number\">0</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"select-seat-information\">\r\n");
      out.write("					<div class=\"selected-movie\">");
      out.print(reserve.getTitle());
      out.write("</div>\r\n");
      out.write("					<div class=\"select-seat-information-wrapper\">\r\n");
      out.write("						<div class=\"select-theater-place selected-theater-place-info\">");
      out.print(theaterKind);
      out.write("</div>\r\n");
      out.write("						<div class=\"select-theater-place selected-theater-place-info\">");
      out.print(reserve.getSelectedTheater());
      out.write("</div>\r\n");
      out.write("						<div class=\"select-theater-place selected-theater-place-info\">4관 6층</div>\r\n");
      out.write("						<div class=\"select-theater-place\">\r\n");
      out.write("							<span>남은좌석</span>\r\n");
      out.write("							<span class=\"remain-seats\">152</span>\r\n");
      out.write("							/\r\n");
      out.write("							<span class=\"all-seats\">172</span>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"select-theater-date\">\r\n");
      out.write("						<div class=\"theater-date\">");
      out.print(reserve.getMovieDate());
      out.write("</div>\r\n");
      out.write("						<div class=\"theater-time\">");
      out.print(reserve.getRunningTime());
      out.write("</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"selected-seats-wrapper\">\r\n");
      out.write("						<span class=\"selected-seats-title\">좌석번호</span>\r\n");
      out.write("						<span class=\"selected-seats\">선택한 좌석이 없습니다.</span>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"ticket-price-wrapper\">\r\n");
      out.write("						<div class=\"ticket-price-title\">가격</div>\r\n");
      out.write("						<div class=\"ticket-price\">0원</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<form action=\"/page/kakao/insert.do\" class=\"seatForm\" method=\"post\">\r\n");
      out.write("						<input type=\"hidden\" class=\"title\" name=\"title\">\r\n");
      out.write("						<input type=\"hidden\" class=\"selectedTheater\" name=\"selectedTheater\">\r\n");
      out.write("						<input type=\"hidden\" class=\"reserveDate\" name=\"movieDate\">\r\n");
      out.write("						<input type=\"hidden\" class=\"runningTime\" name=\"runningTime\">\r\n");
      out.write("						<input type=\"hidden\" class=\"movieName\" name=\"movieName\" value=\"");
      out.print(reserve.getMovieName());
      out.write("\">\r\n");
      out.write("						\r\n");
      out.write("						<!-- 티켓의수(선택한 좌석) -->\r\n");
      out.write("						<input type=\"hidden\" class=\"ticketNumber\" name=\"ticketNumber\">\r\n");
      out.write("						<input type=\"hidden\" class=\"selectedSeat\" name=\"selectedSeat\">\r\n");
      out.write("						<!-- 결제 정보 -->\r\n");
      out.write("						<input type=\"hidden\" class=\"payMoney\" name=\"payMoney\">\r\n");
      out.write("						<button type=\"button\" class=\"reserve-button\">\r\n");
      out.write("							결제하기\r\n");
      out.write("							<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/images/payment_icon_yellow_medium.png\">\r\n");
      out.write("						</button>\r\n");
      out.write("					</form>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"seat-container\">\r\n");
      out.write("				<div class=\"seat-wrapper\">\r\n");
      out.write("					<div class=\"screen-view-wrapper\">\r\n");
      out.write("						<div class=\"screen-view\">SCREEN</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/seat.js\"></script>\r\n");
      out.write("\r\n");
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
