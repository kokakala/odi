/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.43
 * Generated at: 2019-09-24 19:11:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.owner;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ownerPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/views/owner/../common/header.jsp", Long.valueOf(1569351837523L));
  }

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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>대여점 페이지</title>\r\n");
      out.write("<style>\r\n");
      out.write("        @font-face {\r\n");
      out.write("            font-family: 'ON-IGothic'; \r\n");
      out.write("            src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_eleven@1.0/ON-IGothic.woff') format('woff'); \r\n");
      out.write("            font-weight: normal;\r\n");
      out.write("            font-style: normal;\r\n");
      out.write("        }\r\n");
      out.write("        *{\r\n");
      out.write("            font-family: 'ON-IGothic';\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        body{\r\n");
      out.write("            width:1200px;\r\n");
      out.write("            height:850px;\r\n");
      out.write("            margin:auto;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        header, section, footer{\r\n");
      out.write("            border:1px solid black;\r\n");
      out.write("            width:100%;\r\n");
      out.write("            box-sizing:border-box;\r\n");
      out.write("            display:block;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        header{height:15%;}\r\n");
      out.write("        section{height:75%;}\r\n");
      out.write("        footer{\r\n");
      out.write("            height:10%;\r\n");
      out.write("            position:relative;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* header */\r\n");
      out.write("        #logo{\r\n");
      out.write("            font-size:30px;\r\n");
      out.write("            font-weight:bold;\r\n");
      out.write("            text-align:center;\r\n");
      out.write("            color:navy;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .loginArea{\r\n");
      out.write("            float:right;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        /* section */\r\n");
      out.write("\r\n");
      out.write("        #content1, #content2{height:100%; float:left;}\r\n");
      out.write("\r\n");
      out.write("        /* section > menu */\r\n");
      out.write("\r\n");
      out.write("        #content1{\r\n");
      out.write("            width:20%;\r\n");
      out.write("            border:1px solid black;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        div{\r\n");
      out.write("            box-sizing:border-box;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #menu-outer{\r\n");
      out.write("            width:200px;\r\n");
      out.write("            height:500px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #menu{\r\n");
      out.write("            width:100%;\r\n");
      out.write("            list-style-type:none;\r\n");
      out.write("            padding:0;\r\n");
      out.write("            margin:0;\r\n");
      out.write("        }\r\n");
      out.write("        #menu>li{\r\n");
      out.write("            width:100%;\r\n");
      out.write("            height:40%;\r\n");
      out.write("            text-align:center;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #menu li a{\r\n");
      out.write("            text-decoration:none;\r\n");
      out.write("            font-size:17px;\r\n");
      out.write("            font-weight:800;\r\n");
      out.write("            color:skyblue;\r\n");
      out.write("            padding-top:20px;\r\n");
      out.write("            display:block;\r\n");
      out.write("            height:20%;\r\n");
      out.write("            line-height:30px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #menu li a:hover{\r\n");
      out.write("            background-color:lightgray;\r\n");
      out.write("            color:black;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #menu li>ul{\r\n");
      out.write("            list-style-type:none;\r\n");
      out.write("            padding:0;\r\n");
      out.write("            display:none;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        #menu li>a:hover+ul{\r\n");
      out.write("            display:block;\r\n");
      out.write("            background-color:red;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #menu li ul:hover{\r\n");
      out.write("            display:block;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #menu>li>ul>li>a{\r\n");
      out.write("            font-size:15px;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        /* section > content2 */\r\n");
      out.write("        #content2{\r\n");
      out.write("            width:80%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write('\r');
      out.write('\n');

	String message = (String)session.getAttribute("msg");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath() );
      out.write("/resources/css/odi-theme.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- common/HEADER -->\r\n");
      out.write("    <header>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"header-top-nav\">\r\n");
      out.write("            <ul class=\"header-top-right\">\r\n");
      out.write("                <li>고객센터</li>\r\n");
      out.write("                <li>로그인</li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"header-main\">\r\n");
      out.write("            <div class=\"header-logo\">\r\n");
      out.write("                <img src=\"");
      out.print( request.getContextPath() );
      out.write("/resources/images/header-logo.png\" alt=\"\" onclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("'\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"nav\">\r\n");
      out.write("            <ul class=\"nav-bar\">\r\n");
      out.write("                <li>정장대여</li>\r\n");
      out.write("                <li>커뮤니티</li>\r\n");
      out.write("                <li>마이페이지</li>\r\n");
      out.write("                <li>매장찾기</li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"line-notice-wrap\">\r\n");
      out.write("            <a href=\"#\">[공지] 추석 연휴 기간 사이트 점검</a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("        var flag = 0;\r\n");
      out.write("\r\n");
      out.write("        $(window).scroll(function(){\r\n");
      out.write("            if ($(this).scrollTop() >= 150 && flag == 0) {\r\n");
      out.write("                flag = 1;\r\n");
      out.write("                $(\"header\").stop().animate({'height':'86.8px'},{queue:false, duration:300});\r\n");
      out.write("                $(\".header-top-nav\").stop().animate({'height':'0px'},{queue:false, duration:300});\r\n");
      out.write("                $(\".line-notice-wrap\").stop().animate({'height':'0px','display':'none'},{queue:false, duration:300});\r\n");
      out.write("            } else if ($(this).scrollTop() < 150 && flag == 1) {\r\n");
      out.write("                flag = 0;\r\n");
      out.write("                $(\"header\").stop().animate({'height':'140px'},{queue:false, duration:300});\r\n");
      out.write("                $(\".header-top-nav\").stop().animate({'height':'20%'},{queue:false, duration:300});\r\n");
      out.write("                $(\".line-notice-wrap\").stop().animate({'height':'18%'},{queue:false, duration:300});\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("    <div style=\"height: 140px;\"></div>\r\n");
      out.write("\r\n");
      out.write("    <!-- section -->\r\n");
      out.write("    <section>\r\n");
      out.write("        <!-- 좌측 메뉴바 -->\r\n");
      out.write("        <section id=\"content1\">\r\n");
      out.write("            <div id=\"menu-outer\">\r\n");
      out.write("                <ul id=\"menu\">\r\n");
      out.write("                    <li><a href=\"\">대여점 옷장</a>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a>우리 대여점 옷장</a></li>\r\n");
      out.write("                            <li><a>입고/출고</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <li><a href=\"\">예약 관리</a>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"\">예약 내역</a></li>\r\n");
      out.write("                            <li><a>예약 변경/취소</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <li><a href=\"\">게시판</a>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"\">공지사항</a></li>\r\n");
      out.write("                            <li><a href=\"\">리뷰 관리</a></li>\r\n");
      out.write("                            <li><a href=\"\">문의내역</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("        <!-- 내용 -->\r\n");
      out.write("        <section id=\"content2\">\r\n");
      out.write("\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <footer></footer>\r\n");
      out.write("    \r\n");
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