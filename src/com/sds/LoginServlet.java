package com.sds;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/LoginServlet", "/login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd"); 
		response.setCharacterEncoding("EUC-KR");
		PrintWriter out = response.getWriter();
		out.println(id+"�� GET ��� �α���");
	}	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd"); 
		response.setCharacterEncoding("EUC-KR");
		PrintWriter out = response.getWriter();
		if(id.equals("namyeah1004") && pwd.equals("111")){
			out.println(id+"�� �α��� ����");
			out.println("namyeah1004"+"�� ȯ�� �մϴ٢�");
		}else {
			out.println(id+"�� �α��� ����");
		}
		
		out.close();
	}

}
