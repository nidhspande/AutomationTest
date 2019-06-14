package javaexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {

	public static void main(String[] args) {

		
		// Get Connection String From Developer 
		String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=Northwind;user=adminuser;password=123";

		
		// Open the connection 
		try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
			
			
			//Write the Sql Statement 
			
			String SQL = "SELECT TOP (1) ContactName\r\n" + 
					"  FROM [Northwind].[dbo].[Customers]\r\n" + 
					"  where City ='London'";
			
			// Create a Result set 
			ResultSet rs = stmt.executeQuery(SQL);
			while (rs.next()) {
				
				// Print the result 
				System.out.println(rs.getString("ContactName"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
