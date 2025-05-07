import java.sql.*;
import java.io.*;

class PreparedStatementDemo
{
	private static final String DB_NAME = "db/sample.db";
	//assuming a table names user is created with data in it
	private static final String TABLE_NAME = "user";
	private static final String CONNECTION_STRING = "jdbc:sqlite:" + DB_NAME;

	public static void main(String[] args) 
	{
		try
		{
			Connection conn = DriverManager.getConnection(CONNECTION_STRING);
			BufferedReader consoleBr = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter your userName and password: ");
			String userName = consoleBr.readLine();
			String password = consoleBr.readLine();

			String sqlQuery = "Select * from " + TABLE_NAME + " where username = ? and password = ?";
			PreparedStatement ps = conn.prepareStatement(sqlQuery);

			ps.setString(1,userName);
			ps.setString(2,password);

			ResultSet rs = ps.executeQuery();

			if(rs.next())
				System.out.println("You are authenticated..");
			else
				System.out.println("You aren't authenticated...");
		}	
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
}