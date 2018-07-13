import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ForeignKeyExample {
	public static void main(String[] args) throws SQLException, IOException {

		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/medcare", "postgres", "rama441");
/*
		String str = "select * from bankcustomer,banktransactions where bankcustomer.accountno=banktransactions.actnum and bankcustomer.accountno='2' order by banktransactions.tdate asc";

		PreparedStatement ps = con.prepareStatement(str);

		ResultSet rs = ps.executeQuery();
		System.out.println("the details requested are: ");

		while (rs.next()) {

			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3)+" "+rs.getInt(4)+" "+rs.getInt(5)+" "+rs.getInt(6)+" "+rs.getDate(7));
		}*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  System.out.println("enter the acount number you want details for:");
		  
		  int reqAct = Integer.parseInt(br.readLine()); 
		 
		  String str1="select * from bankcustomer,banktransactions where bankcustomer.accountno=banktransactions.actnum and bankcustomer.accountno=? order by banktransactions.tdate asc"; 
		  
		  PreparedStatement ps1=con.prepareStatement(str1);
		
		  ps1.setInt(1, reqAct);
		
		  ResultSet rs1=ps1.executeQuery();
	
		  System.out.println("done!");
		
		  while (rs1.next()) {

				System.out.println(rs1.getInt(1) + " " + rs1.getString(2) + " " + rs1.getString(3)+" "+rs1.getInt(4)+" "+rs1.getInt(5)+" "+rs1.getInt(6)+" "+rs1.getDate(7));
			}
		  }
		 
	}


