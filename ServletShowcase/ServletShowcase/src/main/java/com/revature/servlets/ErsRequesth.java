 package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;



import com.revature.beans.requests;

//import dao.AdminDAO;
import com.revature.dao.RequestDAO;

/**
 * Servlet implementation class ErsRequesth
 */
public class ErsRequesth extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger(ErsRequesth.class);

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ErsRequesth() {
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
		//response.setContentType("text/plain");
		String userId = request.getParameter("userId");
		String requestId = request.getParameter("re");
		String reimburse = request.getParameter("req");
		int userid = 0;
		int requestid = 0;
		userid = Integer.parseInt(userId);
		requestid = Integer.parseInt(requestId);
		requests request1 = new requests(userid, requestid, reimburse);
		System.out.println("Ready to go");
		RequestDAO.submitReq(request1);
		response.sendRedirect("Users/requestProcess.html");
		
		//HttpSession session = request.getSession();
		//session.setAttribute("userId", request);
		//session.setAttribute()
		
		//if(!username.equals("") && !password.equals(""))
		//{
			
			//if(AdminDAO.validate(username, password)){// Change this
			//	HttpSession session = request.getSession();
				//session.setAttribute("userId", userId);
			//	session.setAttribute("userType", "requests");
				//session.setAttribute("",);
				//response.sendRedirect("Users/ErsAdmin.html");
				
			//}
			
		//	else
			//	response.sendRedirect("./index.html");
				
			//response.setContentType("text/plain");
			//PrintWriter writing = response.getWriter();
			//Call the PrintWriter's write method
			//writing.write("The user name that you entered is: " + username + " and the password is " + password);
		}
		//else {
			
			//response.sendRedirect("./index.html");
		//}
	}

//}
