package LoginPage;
import java.sql.*;
public class LoginDAO 
{
	Connection Conn;
	public LoginDAO() throws Exception
	{
		Class.forName("org.h2.Driver");
		Conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
	}
public ResultSet getCustomerDetail() throws Exception
{
	Statement stmt = Conn.createStatement();
	ResultSet rs = stmt.executeQuery("Select*from Customer");
	return rs;
}
}
