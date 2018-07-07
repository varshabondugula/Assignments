package com.postdb.postdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetExample {

	
	public static void main(String args[]) throws SQLException {
		
		
		JdbcRowSet rs=RowSetProvider.newFactory().createJdbcRowSet();
		rs.setUrl("jdbc:postgresql://localhost:5432/medcare");
		rs.setUsername("postgres");
		rs.setPassword("rama441");
		
		String query = "update student set name='Naveen' where name='naveen'";
		
		Connection con=DriverManager.getConnection(rs.getUrl(),rs.getUsername(),rs.getPassword());
		PreparedStatement ps=con.prepareStatement(query);
		ps.executeUpdate();
		
		String query2="select * from student";
		
		rs.setCommand(query2);
		rs.execute();
		while (rs.next()) {  
            // Generating cursor Moved event  
            System.out.println("Id: " + rs.getInt(1));  
            System.out.println("Name: " + rs.getString(2));  
            System.out.println("Salary: " + rs.getString(3));  
    }  
		
		
	}
}
