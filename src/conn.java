import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conn {

    // Database connection code
//      ELEPHATSQL
//    static String driverClassName = "org.postgresql.Driver";
//    static String url = "jdbc:postgresql://rogue.db.elephantsql.com/eyfcutuu";
//    static Connection dbConnection = null;
//    static String usernamedb = "eyfcutuu";
//    static String password = "MNFVKzmcSliC3kX4bXacaVuQ3AQ4GPar";
    
    static String driverClassName = "org.postgresql.Driver";
    static String url = "jdbc:postgresql://ec2-54-216-185-51.eu-west-1.compute.amazonaws.com/d9sae8vrob845j";
    static Connection dbConnection = null;
    static String usernamedb = "fsqhklacokjouf";
    static String password = "bbcb9e58df704b11c016afbd3b1513f4a193e8b7eb7a7872fdd7e732fcbbc360";
    
    public static void myconnection () {
        try {
            Class.forName (driverClassName);
        } catch (ClassNotFoundException ex) {}
            
        try {    
            dbConnection = DriverManager.getConnection (url, usernamedb, password);     
        } catch(SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while(ex != null) {
		System.out.println("Message: " + ex.getMessage());
		ex = ex.getNextException();
            }
        }
    }

    static void dbConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
}
