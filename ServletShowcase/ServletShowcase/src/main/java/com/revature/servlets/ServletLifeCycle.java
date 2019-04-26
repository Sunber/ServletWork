package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletLifeCycle extends HttpServlet {
	
	//The service method is invoked after the init method. During the service method,
	//the servlet calls the doGet, doPost, doDelete, etc. HTTP method.
	
	//NOTE: Never override this method. EVER.
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, resp);
	}

	//When destroy is called, the servlet becomes eligible for garbage collection.
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}

	//The init method is invoked by the web container if, and only if, an instance
	//of the servlet does not already exist.
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}

	
}
