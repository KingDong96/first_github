/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.37
 * Generated at: 2021-04-25 12:06:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class createUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("// opener관련 오류가 발생하는 경우 아래 주석을 해지하고, 사용자의 도메인정보를 입력합니다. (\"팝업API 호출 소스\"도 동일하게 적용시켜야 합니다.)\r\n");
      out.write("//document.domain = \"abc.go.kr\";\r\n");
      out.write("\r\n");
      out.write("function goPopup(){\r\n");
      out.write("\t// 주소검색을 수행할 팝업 페이지를 호출합니다.\r\n");
      out.write("\t// 호출된 페이지(jusopopup.jsp)에서 실제 주소검색URL(https://www.juso.go.kr/addrlink/addrLinkUrl.do)를 호출하게 됩니다.\r\n");
      out.write("\tvar pop = window.open(\"/jusoPopup.jsp\",\"pop\",\"width=570,height=420, scrollbars=yes, resizable=yes\"); \r\n");
      out.write("\t\r\n");
      out.write("\t// 모바일 웹인 경우, 호출된 페이지(jusopopup.jsp)에서 실제 주소검색URL(https://www.juso.go.kr/addrlink/addrMobileLinkUrl.do)를 호출하게 됩니다.\r\n");
      out.write("    //var pop = window.open(\"/popup/jusoPopup.jsp\",\"pop\",\"scrollbars=yes, resizable=yes\"); \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function jusoCallBack(roadFullAddr,roadAddrPart1,addrDetail,roadAddrPart2,engAddr, jibunAddr, zipNo, admCd, rnMgtSn, bdMgtSn,detBdNmList,bdNm,bdKdcd,siNm,sggNm,emdNm,liNm,rn,udrtYn,buldMnnm,buldSlno,mtYn,lnbrMnnm,lnbrSlno,emdNo){\r\n");
      out.write("\t\t// 팝업페이지에서 주소입력한 정보를 받아서, 현 페이지에 정보를 등록합니다.\r\n");
      out.write("\t\tdocument.form.roadFullAddr.value = roadFullAddr;\r\n");
      out.write("\r\n");
      out.write("\t\tdocument.form.zipNo.value = zipNo;\r\n");
      out.write("\t\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function idchk(){\r\n");
      out.write("\tvar id = document.getElementById(\"id\").value;\r\n");
      out.write("\twindow.open(\"/idChk.do?id=\"+id,\"pop\",\"width=400,height=300, scrollbars=no, resizable=no\"); \r\n");
      out.write("}\r\n");
      out.write("// 아이디 입력창에 값 입력시 hidden에 idUncheck를 세팅한다.\r\n");
      out.write("// 이렇게 하는 이유는 중복체크 후 다시 아이디 창이 새로운 아이디를 입력했을 때\r\n");
      out.write("// 다시 중복체크를 하도록 한다.\r\n");
      out.write("function inputIdChk(){\r\n");
      out.write("\tdocument.userInfo.idDuplication.value =\"uncheck\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function checkValue(){\r\n");
      out.write("\tvar form = document.userInfo;\r\n");
      out.write("\tif(!form.id.value){\r\n");
      out.write("\t\talert(\"아이디을 입력해주세요\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\t\t\r\n");
      out.write("\tif(form.idDuplication.value != \"idCheck\"){\r\n");
      out.write("\t\talert(\"아이디 중복체크를 해주세요.\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(!form.pw.value){\r\n");
      out.write("\t\talert(\"비번을 입력해주세요\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<title>회원가입</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form action=\"createUser.do\" name=\"userInfo\" method=\"post\" onsubmit=\"return checkValue()\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr><td>아이디</td><td><input type=\"text\"  style=\"width:100px;\" name=\"id\" id=\"id\" onkeydown=\"inputIdChk()\" /><input type=\"button\" onClick=\"idchk();\" value=\"중복체크\"/></td></tr>\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"idDuplication\" value=\"uncheck\" >\r\n");
      out.write("\t\t\t<tr><td>비밀번호</td><td><input type=\"text\"  style=\"width:100px;\" name=\"pw\" /></td></tr>\r\n");
      out.write("\t\t\t<tr><td>이름</td><td><input type=\"text\"  style=\"width:50px;\" name=\"name\" /></td></tr>\r\n");
      out.write("\t\t\t<tr><td>생일</td><td><input type=\"text\" name=\"birth\"/></td></tr>\r\n");
      out.write("\t\t\t<tr><td>이메일</td><td><input type=\"text\"  style=\"width:200px;\" name=\"email\" /></td></tr>\r\n");
      out.write("\t\t\t<tr><td>번호</td><td><select name=\"phoneCd\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"01\">01</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"02\">02</option>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t<input type=\"text\"  style=\"width:100px;\" name=\"phoneNum\" /></td></tr>\r\n");
      out.write("\t\t\t<tr><td>우편번호 </td><td><input type=\"text\"  style=\"width:100px;\" id=\"zipNo\"  name=\"postNum\" /><input type=\"button\" onClick=\"goPopup();\" value=\"주소검색\"/></td>\r\n");
      out.write("\t\t\t<tr><td>도로명주소</td><td><input type=\"text\"  style=\"width:500px;\" id=\"roadFullAddr\"  name=\"address\" /></td></tr>\r\n");
      out.write("\t\t\t<tr><td>이미지</td><td><input type=\"text\"  style=\"width:200px;\" name=\"userImage\" /></td></tr>\r\n");
      out.write("\t\t\t<tr><td><input type=\"submit\" value=\"가입하기 \" /></td></tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
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