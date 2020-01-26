
package appPack;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DbFunction {
    
    DB db = new DB();
    
    /**
     * Admin Login
     * @param userName
     * @param userPass
     * @return boolean
     */
    public boolean adminLogin( String userName, String userPass ) {
        boolean statu = false;
        try {
            String query = "SELECT * FROM `admin` WHERE `username` = ? AND `userpass` = ? ";
            PreparedStatement pre = db.pre(query);
            pre.setString(1, userName);
            pre.setString(2, userPass);
            ResultSet rs = pre.executeQuery();
            statu = rs.next();
            System.out.println(pre);
        } catch (Exception e) {
            System.err.println("Admin Login Error: " + e);
            statu = false;
        }
        return statu;
    }
    
    
}
