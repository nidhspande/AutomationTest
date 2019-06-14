package javaexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {

	public static void main(String[] args) {

		String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=Northwind;user=adminuser;password=123";

		try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
			String SQL = "SELECT TOP (1) ContactName\r\n" + 
					"  FROM [Northwind].[dbo].[Customers]\r\n" + 
					"  where City ='London'";
			ResultSet rs = stmt.executeQuery(SQL);
			while (rs.next()) {
				System.out.println(rs.getString("ContactName"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
