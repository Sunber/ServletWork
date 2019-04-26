package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.beans.PolkamanMaster;

/**
 * Servlet implementation class GetPolkamans
 */
public class GetPolkamans extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetPolkamans() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<PolkamanMaster> masters = new ArrayList<PolkamanMaster>();
		
		PolkamanMaster bash = new PolkamanMaster(1, "Bash", "pass");
		PolkamanMaster crock = new PolkamanMaster(2, "Crock", "pass");
		PolkamanMaster nisty = new PolkamanMaster(3, "Nisty", "pass");
		
		masters.add(bash);
		masters.add(crock);
		masters.add(nisty);
		
		response.setContentType("application/json");
		PrintWriter imOut = response.getWriter();
		
		//We use an object mapper to map java objects as javascript objects
		ObjectMapper imTheMap = new ObjectMapper();
		
		imOut.write(imTheMap.writeValueAsString(masters));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
