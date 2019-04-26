package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.revature.dao.AdminDAO;

/**
 * Servlet implementation class ErsManLogin
 */
public class ErsManLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger(ErsManLogin.class);

	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ErsManLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/plain");
		String username = request.getParameter("username");
		String password = request.getParameter("password1");
		
		if(!username.equals("") && !password.equals(""))
		{
			
			if(AdminDAO.validate(username, password)){// Change this
				HttpSession session = request.getSession();
				session.setAttribute("managerId", username);
				session.setAttribute("userType", "manager");
				response.sendRedirect("Users/ErsAdmin.html");
				
			}
			
			else
				response.sendRedirect("./index.html");
				
			//response.setContentType("text/plain");
			//PrintWriter writing = response.getWriter();
			//Call the PrintWriter's write method
			//writing.write("The user name that you entered is: " + username + " and the password is " + password);
		}
		else {
			
			response.sendRedirect("./index.html");
		}
		
		log.info("The context param is: " + request.getServletContext().getInitParameter("someName"));
	}

		
	}


