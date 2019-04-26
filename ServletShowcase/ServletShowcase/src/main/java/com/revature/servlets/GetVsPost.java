package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetVsPost extends HttpServlet{
	

	//doGet is called whenever a GET request is made on the frontend. 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
	}
	
	//doPost is called whenever a POST request is made on the frontend.
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
	}
	
	/*
	 * GET vs POST
	 * There are two primary differences between GET and POST requests.
	 * -GET will post parameters to the URL of a request whereas POST will post the parameters to the body
	 * of an HTTP request
	 * -GET has a character limit of about 2,000 characters while POST is near limitless
	 */
}
