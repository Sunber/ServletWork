package com.revature.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.beans.Move;
import com.revature.beans.Polkaman;

/**
 * Servlet implementation class JSession
 */
/*
 * Session management entails managing a client's session by tracking their interactions
 * with your web application. There are several ways of managing a client's session, but we
 * will primarily use two:
 * -Cookies
 * -JSession
 * 
 * A cookie is stored on the client as a key value pair. A JSession is a specialized cookie
 * that is accompanied by a session id on the server side.
 */

public class JSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JSession() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//We can use the request object to create sessions
		HttpSession mySession = request.getSession();
		
//		Polkaman pekachu = new Polkaman(1, "Pekachu", 13, 23, new Move(1, "myMove"));
		
		//We can also set session attributes to store certain information. For instance:
		mySession.setAttribute("username", "Johnny Cash");
		mySession.setAttribute("userId", 2);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
