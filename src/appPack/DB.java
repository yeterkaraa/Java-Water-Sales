package appPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DB {
    
    final private String driver = "com.mysql.jdbc.Driver";
    final private String url = "jdbc:mysql://localhost/";
    final private String dbName = "drink";
    final private String user = "root";
    final private String pass = "";
    
    
    Connection conn = null;
    PreparedStatement pre = null;
    
    
    public PreparedStatement pre( String query ) {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url+dbName, user, pass);
            pre = conn.prepareStatement(query);
            System.out.println("Baglanti Basarili");
        } catch (Exception e) {
            System.err.println("Baglanti Hatasi : " + e);
        }
        return pre;
    }
    
    
}
