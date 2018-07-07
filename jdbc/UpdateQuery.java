package com.postdb.postdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class UpdateQuery {

	public static void main(String args[]) throws SQLException {

		String query = "update student set name='Aishwarya' where name='aishu'";

		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/medcare", "postgres",
				"rama441");
		PreparedStatement ps = conn.prepareStatement(query);
		ps.executeUpdate();

	/*Statement ps1 = conn.createStatement();
	ResultSet rs = ps1.executeQuery("select * from student");*/
		
		
		JdbcRowSet rs= RowSetProvider.newFactory().createJdbcRowSet();
		
		rs.setCommand("select * from student");
		rs.execute();
		

		while (rs.next()) {
			
			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
		}

	}
}
