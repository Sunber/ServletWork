package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.revature.dao.RequestDAO;
import com.revature.services.RequestsService;

/**
 * Servlet implementation class FrontControllerServlet
 */
public class FrontControllerServlet extends HttpServlet {
	private static final RequestDAO requestdao = new RequestDAO();
	private static final RequestsService requestserv = new RequestsService();
	private static final Logger loge = Logger.getLogger(FrontControllerServlet.class);
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Let's use our logger to find out whether or not our front controller is live
		loge.info("Our Front Controller is working properly.");
		
		//The getRequestURI returns the URI which this request is looking for
		String uri = request.getRequestURI();
		
		//The split method is a string method which allows you to split a string into several
		//pieces; it returns an array of those pieces
		String[] uriPieces = uri.split("/");
		
		//We're retrieving the very last part of the URI, which looks something like "something.do"
		String lastPiece = uriPieces[uriPieces.length -1];
		
		//Now we'll take that last piece and chop off the .do
		String servletName = lastPiece.substring(0, lastPiece.length() -3).toLowerCase(); //this looks like "something" - .do
		
		switch(servletName) {
		
		case "erslogin":
			request.getRequestDispatcher("ErsLogin").forward(request, response);
			break;
			
		case "ersmanlogin":
			request.getRequestDispatcher("ErsManLogin").forward(request, response);
			break;
			
		case "ersrequesth":
			request.getRequestDispatcher("ErsRequesth").forward(request, response);
			break;
			
		case "tabledisplay":
			request.getRequestDispatcher("tableDisplay").forward(request, response);
			break;
			
		case "reimbursements":
			request.getRequestDispatcher("RequestsService").forward(request, response);
			break;
				
			
		default:
			
			response.setContentType("text/plain");
			PrintWriter out = response.getWriter();
			out.write("The servlet you have requested doesn't exist");
//			response.sendError(404);
			break;
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
