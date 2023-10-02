package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDAO;
import com.db.DBConnect;
import com.user.UserDetails;
@WebServlet("/LoginServlet")

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("uemail");
		String password = request.getParameter("upassword");
       
		UserDetails us = new UserDetails();
		us.setEmail(email);
		us.setPassword(password);
		
		try {
			UserDAO dao = new UserDAO(DBConnect.getConn());
			UserDetails user=dao.loginUser(us);
			HttpSession session;
			if(user !=null) {
				session=request.getSession();
				session.setAttribute("userD",user);
				response.sendRedirect("home.jsp");
			}else {
				session=request.getSession();
				session.setAttribute("login-failed","Invalid Email and Password");
				response.sendRedirect("login.jsp");
			}
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
