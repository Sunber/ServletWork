package com.revature.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BurnCookies
 */
public class BurnCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BurnCookies() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//We can use the request to get all of the cookies sent to us by the client
		Cookie cookies[] = request.getCookies();
		
		//You must do error checking when you fetch cookies from the client. In other words,
		//you'll want to iterate through the array of cookies to find a specific cookie.
		for(Cookie c : cookies) {
			if(c.getName().equals("Whatever Cookie I'm Looking For")) {
				c.setMaxAge(0);
				response.addCookie(c);
			}
		}
		
		//The GENERIC, NOT ADVISED WAY:
//		//If you want to delete a cookie, you have to set its max age to 0
//		cookies[0].setMaxAge(0);
//		
//		//Annoyingly enough, you have to add the cookie to the response after you set its
//		//max age to 0
//		response.addCookie(cookies[0]);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
