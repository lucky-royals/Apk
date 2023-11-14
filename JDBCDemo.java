import java.sql.*;
class JDBCDemo
{
	public static void main(String args[]) throws ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","");
		
			Statement stmt = con.createStatement();
			String query = "select * from Slucky" ;
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next())
			{
				System.out.println(rs.getString(1) + "\t" + rs.getString(2));
			}		
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
