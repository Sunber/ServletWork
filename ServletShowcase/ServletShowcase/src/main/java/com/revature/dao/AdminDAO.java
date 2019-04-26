package com.revature.dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.sql.*;

import com.revature.servlets.JdbcConnection;
import com.revature.beans.manager;

public class AdminDAO {
public static boolean validate(String manNme, String manPass){
		
		try(Connection conn = JdbcConnection.getConnection()){
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM project_1.manager WHERE manUserName = ? AND manPassword = ?");
			stmt.setString(1, manNme);
			stmt.setString(2, manPass);
			ResultSet rs = stmt.executeQuery();
			
			return rs.next();
			
		}catch(SQLException e)
		{
			
		}
		
		return false;
		
	}
	//public static boolean validate()

}
