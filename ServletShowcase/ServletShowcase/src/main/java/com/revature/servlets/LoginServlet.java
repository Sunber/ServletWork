package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {

	private static final Logger log = Logger.getLogger(LoginServlet.class);
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Getting the form parameters from the client
		String username = request.getParameter("username");
		String password1 = request.getParameter("password1");
		String password2 = request.getParameter("password2");
		
		//We need to do some error checking; we need to check that our strings aren't null
		//or empty strings
		
		if(username == null || username.equals("") || password1 == null || password1.equals("")
				|| password2 == null || password2.equals("")) {
			
			//Once again, setting the content type we want to send back to the client
			response.setContentType("text/plain");
			//Once again, creating a print writer object to write back to the client
			PrintWriter writing = response.getWriter();
			//Call the PrintWriter's write method
			writing.write("Yeah, right. You tried it. But nah.");
		}
		
		else if(!password1.equals(password2)){
			response.setContentType("text/html");
			PrintWriter writeMe = response.getWriter();
			writeMe.write("<table><thead><tr><td>You</td><td>Are</td></tr></thead><tbody>"
					+ "<tr><td>Very</td><td>Annoying</td></tr></tbody></table>");
		}
		
		//sendRedirect vs Forward
		
		/*
		 * sendRedirect and forward are both methods that you can use to direct the flow
		 * of traffic on your website. There is, however, a few differences between these
		 * two methods.
		 * 
		 * 	1. sendRedirect comes from the response object whereas forward comes from the 
		 *     request object (via the RequestDispatcher)
		 *     
		 *  2. sendRedirect sends a response back to the client and creates a new request that
		 *  is then sent back to the server while forward simply forwards the request to the
		 *  requested resource without leaving the server
		 *  
		 *  3. sendRedirect shows the client the name of the requested resource (via the URL)
		 *  whereas forward masks the name of the resource
		 */
		
		//This is a request dispatcher object. You get it from the request object. As its
		//name suggests, it dispatches requests to some other resource.
//		RequestDispatcher dispatchy = request.getRequestDispatcher("/Users/userhome.html");
//		dispatchy.forward(request, response);
		
		//Now let's try to use the sendRedirect method instead. This method comes from the
		//response object.
		else {
			response.sendRedirect("./Users/userhome.html");
		}
		
			log.info("The context param is: " + request.getServletContext().getInitParameter("someName"));
		}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
