package com.postdb.postdb;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class PostExample {

	public static void main(String[] args) {

		try {

			// select Query
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/medcare", "postgres",
					"rama441");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));

			// Insert Query

			String str = "insert into student values(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(str);

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			do {
				System.out.println("eneter id");

				int id = Integer.parseInt(br.readLine());
				System.out.println("eneter name");

				String name = br.readLine();
				System.out.println("eneter subject");
				String sub = br.readLine();

				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				pstmt.setString(3, sub);

				int i = pstmt.executeUpdate();
				System.out.println(i + "records affected");

				// con.close();

				// For updating
				/*
				 * String str1= "update student set name='naveen' where name='venkatesh'";
				 * PreparedStatement pstmt2= con.prepareStatement(str1);
				 * 
				 * int resultUpdated=pstmt2.executeUpdate();
				 * System.out.println(i+"   Record Upated ");
				 */

			} while (true);

		}

		catch (Exception e) {
			System.out.println(e);
		}

	}
}
