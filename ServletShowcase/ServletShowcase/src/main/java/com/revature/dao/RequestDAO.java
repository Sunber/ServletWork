package com.revature.dao;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.util.ArrayList;

import com.revature.beans.requests;
import com.revature.servlets.JdbcConnection;

public class RequestDAO {
	
	public static long submitReq(requests request){
		
		try(Connection conn = JdbcConnection.getConnection()){
			String sql = "INSERT INTO PROJECT_1.REQUESTS(requestId, workerId, request) VALUES(?,?,?)";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1,request.getRequestId());
			stmt.setInt(2, request.getWorkerId());
			stmt.setString(3, request.getReq());
			
			stmt.executeUpdate();
			System.out.println("Passing");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
		
	}
	public static List<requests> displayRequests()
	{
		List<requests> req = new ArrayList<>();
		try(Connection conn = JdbcConnection.getConnection()){
			PreparedStatement stmt = conn.prepareStatement("SELECT* FROM project_1.requests");
			ResultSet rs = stmt.executeQuery();
			while (rs.next())
			{
				req.add(new requests(rs.getInt("requestId"), rs.getInt("workerId"), rs.getString("request")));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("SQL State: " + e.getSQLState());
			System.err.println("Error Code: " + e.getErrorCode());
			throw new RuntimeException("Failed to compile");
			//e.printStackTrace();
		}
		return req;
		
		
		
	}
	

}
