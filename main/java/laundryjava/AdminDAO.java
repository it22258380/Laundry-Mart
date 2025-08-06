package laundryjava;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdminDAO {
    public static List<Admin> getAlladmins() {
        List<Admin> admins = new ArrayList<>();
        Connection conn = dbconnect.getConnection();
        if (conn != null) {
            try {
                String query = "SELECT * FROM admin"; 
                PreparedStatement preparedStatement = conn.prepareStatement(query);
                ResultSet RS = preparedStatement.executeQuery();
                while (RS.next()) {
                	int adminID=RS.getInt(1);
    				String adminName =RS.getString(2);
    				String Username =RS.getString(3);
    				String apassword =RS.getString(4);
    				String email=RS.getNString(5);
    				String phonenumber=RS.getNString(6);
    				
    				admins.add(new Admin(adminID,adminName,Username,apassword,email,phonenumber));
    				

                    
                }
                RS.close();
                preparedStatement.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return admins;
    }
}
