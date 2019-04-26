package com.revature.dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.sql.*;

import com.revature.beans.employees;
import com.revature.servlets.JdbcConnection;

public class EmployeeDAO {
	
	public List<employees> getAllEmployees(){
		
		List<employees> completeEmpList = new ArrayList<employees>();
		
		try(Connection conn = JdbcConnection.getConnection())
		{
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM project_1.employee");
			
			while(rs.next())
			{
				completeEmpList.add(new employees(rs.getInt("empId"), rs.getString("firstName"), rs.getString("lastName"), rs.getString("userName"),rs.getString("ePassword"),rs.getInt("manId")));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return completeEmpList;
		
	}
	
	public static boolean validate(String userNme, String ePass){
		
		try(Connection conn = JdbcConnection.getConnection()){
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM project_1.employee WHERE userName = ? AND ePassword = ?");
			stmt.setString(1, userNme);
			stmt.setString(2, ePass);
			ResultSet rs = stmt.executeQuery();
			
			return rs.next();
			
		}catch(SQLException e)
		{
			
		}
		
		return false;
		
	}

}
