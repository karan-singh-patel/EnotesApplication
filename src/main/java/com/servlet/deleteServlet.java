package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.PostDAO;
import com.db.DBConnect;


@WebServlet("/deleteServlet")
public class deleteServlet extends HttpServlet {
	
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer noteid=Integer.parseInt(request.getParameter("note_id"));
		try {
			PostDAO  dao=new PostDAO(DBConnect.getConn());
			boolean f=dao.deleteNotes(noteid);
			HttpSession session=null;
			if(f) {
				session=request.getSession();
				session.setAttribute("updateMsg", "Notes Delete Successfully");
				response.sendRedirect("showNotes.jsp");
			}else {
				session=request.getSession();
				session.setAttribute("wrongMsg", "Something went wrong on server");
				response.sendRedirect("showNotes.jsp");
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

	

}
