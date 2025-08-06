package laundryjava;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;

public class adminDBUtil {
	
	private static Connection con= null;
	private static Statement stmt= null;
	private static ResultSet rs=null;
	private static boolean isSuccess;
	private static Object request;
	
	public static List<Admin> validate(String username, String password){
		 
		ArrayList<Admin> admin=new ArrayList<>();
		
		try {
			
			con=dbconnect.getConnection();
			stmt=con.createStatement();
			String sql="select * from admin where username='"+username+"'and password '"+password+"'";
			rs=stmt.executeQuery(sql);
			
			if(rs.next()) {
				int adminID=rs.getInt(1);
				String adminName =rs.getString(2);
				String Username =rs.getString(3);
				String apassword =rs.getString(4);
				String email=rs.getNString(5);
				String phonenumber=rs.getNString(6);
				
				Admin a=new Admin(adminID,adminName,Username,apassword,email,phonenumber);
				admin.add(a);
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return admin;
	}
	
	//add new  admin
	
	public static boolean newadmin(String name,String username,String password,String email,String phonenumber) {
		
		boolean isSuccess=false;
		
				
				try {
					
					con=dbconnect.getConnection();
					stmt=con.createStatement();
					String sql="insert into admin values(0,'"+name+"','"+username+"','"+password+"','"+email+"','"+phonenumber+"')";
					int rs=stmt.executeUpdate(sql);
					
					if(rs>0) {
						isSuccess=true;
					}
					else {
						isSuccess=false;
					}
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
		return isSuccess;
		
	}
	
	//update admin
	public static boolean updateadmin(String id,String name,String username,String password,String email,String phonenumber) {
		
		try {
			con=dbconnect.getConnection();
			stmt=con.createStatement();
			String sql="update admin set name='"+name+"',username='"+username+"',password='"+password+"',email='"+email+"',phonenumber='"+phonenumber+"'"
					+ "where adminID='"+id+"'";
			int rs=stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess=true;
			}else {
				isSuccess=false;
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		
		
		return isSuccess;
	}
	
	public static List<Admin> getAdminDetails(String Id) {
	 	
	 	int convertedID = Integer.parseInt(Id);
	 	
	 	ArrayList<Admin> admin = new ArrayList<>();
	 	
	 	try {
	 		
	 		con=dbconnect.getConnection();
			stmt=con.createStatement();
	 		String sql = "select * from customer where adminID='"+convertedID+"'";
	 		ResultSet rs = stmt.executeQuery(sql);
	 		
	 		while(rs.next()) {
	 			int adminID=rs.getInt(1);
				String adminName =rs.getString(2);
				String Username =rs.getString(3);
				String apassword =rs.getString(4);
				String email=rs.getNString(5);
				String phonenumber=rs.getNString(6);
				
				Admin a=new Admin(adminID,adminName,Username,apassword,email,phonenumber);
				admin.add(a);
				
	 		}
	 		
	 		
	 	}
	 	catch(Exception e) {
	 		e.printStackTrace();
	 	}	
	 	return admin;	
	 }
	
	public static boolean deleteadmin(String id) {
		int convId = Integer.parseInt(id);
	 	
	 	boolean isSuccess = false;
	 	try {
	 		
	 		con=dbconnect.getConnection();
			stmt=con.createStatement();
	 		String sql = "delete from admin where adminID='"+convId+"'";
	 		int r = stmt.executeUpdate(sql);
	 		
	 		if (r > 0) {
	 			isSuccess = true;
	 		}
	 		else {
	 			isSuccess = false;
	 		}
	 		
	 	}
	 	catch (Exception e) {
	 		e.printStackTrace();
	 	}
	 	
	 	return isSuccess;
	 }
	}
	

	
	
























