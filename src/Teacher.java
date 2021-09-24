import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Teacher { 
    static PreparedStatement prstmt = null;    
    static ResultSet rs = null;

    private String operation;
    private int id;
    private String fname;
    private String lname;
    private String user;
    private String passwd;
    private String add;
    private String phone;
    private String email;
    
    // Setters
    public void setOperation(String operation){this.operation = operation;}
    public void setID(int id){this.id = id;}
    public void setFName(String fname){this.fname = fname;}
    public void setLName(String lname){this.lname = lname;}
    public void setUsername(String username){this.user = username;}
    public void setPassword(String password){this.passwd = password;}
    public void setAddress(String address){this.add = address;}
    public void setPhone(String phone){this.phone = phone;}
    public void setEmail(String email){this.email = email;}
    
    // Getters
    public String getOperation(){return operation;}
    public int getID(){return id;}
    public String getFName(){return fname;}
    public String getLName(){return lname;}
    public String getUsername(){return user;}
    public String getPassword(){return passwd;}
    public String getAddress(){return add;}
    public String getPhone(){return phone;}
    public String getEmail(){return email;}
    
    // INSERT, UPDATE OR DELETE actions
    public void manageTeacher(String operation) {
        try {
            prstmt = conn.dbConnection.prepareStatement("SELECT manage_teacher(?,?,?,?,?,?,?,?,?) ");

            prstmt.setString(1, operation);
            prstmt.setInt(2, id);
            prstmt.setString(3, fname);
            prstmt.setString(4, lname);
            prstmt.setString(5, user);
            prstmt.setString(6, passwd);
            prstmt.setString(7, add);
            prstmt.setString(8, phone);
            prstmt.setString(9, email);
            prstmt.execute();

            JOptionPane.showMessageDialog(null, prstmt.getWarnings().getMessage());
            System.err.println(prstmt.getWarnings().getMessage());
            
            prstmt.close();
        } catch (SQLException ex) {
            System.out.println("\n -- Manage Teacher SQL Exception --- \n");
            while (ex != null) {
                System.out.println("Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
    }
    
    // Check if Teacher exists in database
    public boolean contains(Integer am){
        int counter = 0;
        try{
            String select = "SELECT * FROM contains_teacher(?) ";
            prstmt = conn.dbConnection.prepareStatement(select);
            prstmt.setInt(1, am);
            
            rs = prstmt.executeQuery();   
            while(rs.next())
                counter = rs.getInt(1);
            
            prstmt.close();
        } catch (SQLException ex) {
            System.out.println("\n -- Check Teacher SQL Exception --- \n");
            while (ex != null) {
                System.out.println("Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
        return counter > 0;
    }
    
    // Populate teacherTable
    public void teacherTable(JTable table, String search) {
        try {                      
            prstmt = conn.dbConnection.prepareStatement("SELECT * FROM search_teacher(?) ");
            prstmt.setString(1,search);
            
            rs = prstmt.executeQuery();
 
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row; 
            
            // Change column size
            GUI g = new GUI();
            
            g.colSize(table, 1, 10);
            g.colSize(table, 2, 40);
            g.colSize(table, 6, 50);
            g.colSize(table, 7, 100);
            
            g.colHide(table, 3); 
            g.colHide(table, 4); 
            
            while (rs.next()) {
                row = new Object[9];
                row[0] = Integer.valueOf(rs.getString(1)); // ID
                row[1] = rs.getString(2); // First Name
                row[2] = rs.getString(3); // Last Name
                row[3] = rs.getString(4); // Username
                row[4] = rs.getString(5); // Password
                row[5] = rs.getString(6); // Address
                row[6] = rs.getString(7); // Phone
                row[7] = rs.getString(8); // Email
                model.addRow(row);    
            }
            prstmt.close();
        } catch (SQLException ex) {
            System.out.println("\n -- Search Teacher SQL Exception --- \n");
            while (ex != null) {
                System.out.println("Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
    }
}
