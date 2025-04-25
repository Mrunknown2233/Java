import java.sql.*;


class DBConnection
{
	private static final String DB_NAME = "db/sample.db";
	private static final String TABLE_NAME = "students";
	private static final String CONNECTION_STRING = "jdbc:sqlite:" + DB_NAME;


	public static void main(String[] args) 
	{
		try
		{
			Connection conn = DriverManager.getConnection(CONNECTION_STRING);
			Statement statement = conn.createStatement();

			String sqlQuery = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT, EMAIL Text, PHONE TEXT)";

			statement.execute(sqlQuery);

			sqlQuery = "Insert into " + TABLE_NAME + "(name,email,phone) values ('Soumya','soumya.dedhia@gmail.com','7020144565'),"
			+ "('Mahatre','mahatre@gmail.com','1234567890'),"
			+ "('Ruturaj','ruturaj@gmail.com','09876654321')";

			// statement.execute(sqlQuery);

			sqlQuery = "Update " + TABLE_NAME + " set NAME = 'ruter' where id = 3";
			statement.execute(sqlQuery);

			sqlQuery = "Delete from " + TABLE_NAME + " where id = 3 or id = 2";
			statement.execute(sqlQuery);


			sqlQuery = "Select * from " + TABLE_NAME;

			ResultSet rs = statement.executeQuery(sqlQuery);


			while(rs.next())
			{
				System.out.println("ID : " + rs.getInt("id"));
				System.out.println("ID : " + rs.getInt(1));
				System.out.println("Name : " + rs.getString("name"));
				System.out.println("Phone : " + rs.getString("phone"));
				System.out.println("Email : " + rs.getString("email"));

			}
		}	
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}