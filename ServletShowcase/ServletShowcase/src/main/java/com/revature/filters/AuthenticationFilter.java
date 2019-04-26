package com.revature.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

/**
 * Servlet Filter implementation class AuthenticationFilter
 */

/*
 * A filter is just a servlet, but a servlet that has a special job. A filter's
 * job is to intercept requests before they reach their destination and do some
 * sort of authentication.
 *
 * Hence the name "filter".
 */

public class AuthenticationFilter implements Filter {
	
	private static Logger log = Logger.getLogger(AuthenticationFilter.class);

	/**
	 * Default constructor.
	 */
	public AuthenticationFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		//This log allows us to print this message to the console. It provides a way
		//of tracking what is happening in our application.
		
		log.info("My authentication filter is working.");
		// TODO Auto-generated method stub
		// place your code here

		// We must cast the ServletRequest and ServletResponse objects into
		// HttpServletRequest
		// and HttpServletResponse objects
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;

		// Let's get a user's session
		HttpSession session = req.getSession(false);

		if (session != null) {
			
			log.info("My session wasn't null.");
			if (session.getAttribute("userId").equals(1)) {
				// send the user to the appropriate web page
				RequestDispatcher dispat = request.getRequestDispatcher("/Users/index.html");
				dispat.forward(request, response);
				
				//You can send error codes back to the client side using your response
				//object using the sendError() method
//				resp.sendError(404);
			}
			//else if(session.getAttribute("managerId").equals(1)){
				//RequestDispatcher dispat = request.getRequestDispatcher("/Users/index.html");
				//dispat.forward(request, response);
			//}
		} 
		
		else {

			log.info("My session is null.");
			resp.sendRedirect("../index.html");
		}

		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
