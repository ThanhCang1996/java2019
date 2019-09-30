package information;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class ConnectionUtils {
	
	public static  Connection getMyConnection () throws SQLException, ClassNotFoundException
	{
		String hostName = "localhost";
		String dbName = "information";
		String user = "root";
		String password = "2503";
		String connectionURL = "jdbc:mysql://"+hostName + ":3306/"+dbName;
		Connection conn = DriverManager.getConnection(connectionURL,user,password);
		return conn;		
	}
	public static void main(String[] args)
	{
		try {
			Connection abc = getMyConnection();
			System.out.println(abc);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
