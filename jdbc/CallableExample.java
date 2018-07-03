package com.postdb.postdb;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableExample {

	
	
	public static void main(String[] args) throws SQLException {
		
	Connection con =DriverManager.getConnection("jdbc:postgresql://localhost:5432/medcare","postgres","rama441");
	
	String str="{call insertquery(?,?,?)}";
	CallableStatement cs=con.prepareCall(str);
	cs.setInt(1, 111);
	cs.setString(2, "naveen reddy bojja");
	cs.setString(3, "MBA");
	
	cs.execute();
	con.close();
		
		System.out.println("Done!");
	}
	
	
}
