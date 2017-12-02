package com.journaldev.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hv.db.HealthDTO;
import com.hv.db.StudentDBMS;


/**
 * Servlet implementation class Login
 */

public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
			RequestDispatcher rd =  request.getRequestDispatcher("/index.jsp");
			rd.forward(request, response);	
		
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("login controller");
		// TODO Auto-generated method stub
		String st="";
	String name = (String)request.getParameter("username");
	String password = (String)request.getParameter("password");
	System.out.println(name);
	System.out.println(password);
	HealthDTO dto = new HealthDTO();
	StudentDBMS studentDAO = new StudentDBMS();
	dto.setUsername(name.trim());
	dto.setPassword(password.trim());
	try {
		dto = StudentDBMS.getStudentByIdandPassword(dto);
		if("Successfully saved".equals(dto.getMessage())){
			HttpSession session = request.getSession();
			//Cookie cookie = new Cookie("username",dto.getFirst_name());
			session.setAttribute("name",dto.getUsername());
			request.setAttribute("name", dto.getUsername());
			//request.setAttribute("mycookie", cookie);
			RequestDispatcher rd =  request.getRequestDispatcher("/profile.jsp");
			rd.forward(request, response);
		}else{
			RequestDispatcher rd =  request.getRequestDispatcher("/index.jsp");
			request.setAttribute("msg", "username or password is incorrect!");
			rd.forward(request, response);
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}
