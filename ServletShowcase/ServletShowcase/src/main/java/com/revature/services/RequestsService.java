package com.revature.services;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.beans.requests;
import com.revature.dao.RequestDAO;

public class RequestsService {
	
	RequestDAO reque = new RequestDAO();
	ObjectMapper om = new ObjectMapper();
	
	public List<requests> omList(HttpServletRequest request, HttpServletResponse response){
		return reque.displayRequests();
		
	}

}
