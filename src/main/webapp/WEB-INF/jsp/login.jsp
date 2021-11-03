<%@ page language="java" pageEncoding="GBK"
         import="java.util.*,Entity.*"%>
<%@ page import="Entity.Administrator" %>
<%@ page import="Entity.User" %>
<%@ page import="Servlet.LoginServlet" %>
<%
    request.setCharacterEncoding("GBK");

    User loginUser = new User();
    Administrator loginAdmin = new Administrator();
    //LoginServlet loginServlet =new LoginServlet();
    String SIGN;
    SIGN=request.getParameter("sign");
    if (SIGN=="user") {
        loginUser.setAccount(request.getParameter("account"));
        loginUser.setPassword(request.getParameter("password"));
        if(loginServlet.checkLogin(loginUser))
        session.setAttribute("loginUser", loginUser);
    }else{
        loginAdmin.setAccount(request.getParameter("account"));
        loginAdmin.setPassword(request.getParameter("password"));
        if(loginServlet.checkLogin(loginAdmin))
        session.setAttribute("loginAdmin", loginAdmin);
    }
    response.sendRedirect("index.jsp");
%>