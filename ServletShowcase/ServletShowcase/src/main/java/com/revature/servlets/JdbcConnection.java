package com.revature.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcConnection {
	public static void main (String[] args){
		//System.out.println(JdbcConnection.getConnection());
		
		Connection conn1 = null;
		Connection conn2 = null;
		// This is to test the connection to the database.
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url1 = "jdbc:mysql://localhost:3306/project_1";
			String user = "root";
			String password = "Hyperion 98";
			
			conn1 = DriverManager.getConnection(url1, user, password);
			if(conn1!= null){
				System.out.println("Connected to the database successfully!");
			}
			//Connection attempt 2
			
            //String url2 = "jdbc:mysql://localhost:3306/project_1?user=root&password=Hyperion 98";
            //conn2 = DriverManager.getConnection(url2);
            //if(conn2!=null)
            //{
            //	System.out.println("Connected to the database!");
            //}
			
			}catch(SQLException e){// This is to see if the connection failed.
				e.printStackTrace();
				System.out.println("Did not connect to the database");
			}catch(ClassNotFoundException e){
				e.printStackTrace();
			}
				
			
		}
		
		public static Connection getConnection(){
			// This is to test the connection to the database.
			try{
				Class.forName("com.mysql.jdbc.Driver");
				String url1 = "jdbc:mysql://localhost:3306/project_1";
				String user = "root";
				String password = "Hyperion 98";
				
				return DriverManager.getConnection(url1, user, password);
			}catch (SQLException e)
			{
				e.printStackTrace();
				System.out.println("Something broke");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}return null;
		
		}
}
