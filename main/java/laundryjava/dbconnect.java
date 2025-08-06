package laundryjava;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbconnect {
	
	private static String url= "jdbc:mysql://localhost:3306/laundrydb";
	private static String user="root";
	private static String Password="1qaz@Wsx";
	private static  Connection con; 
	
	public static Connection getConnection() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con= DriverManager.getConnection(url, user, Password);
			
			
			
		}
		catch(Exception e){
			System.out.println("Data base connected successfuly");
		}
		return con; 
	}
}
