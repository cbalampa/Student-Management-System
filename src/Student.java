
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Student {
    private static PreparedStatement prstmt = null;
    private static ResultSet rs = null;
    
    private String operation;
    private int am;
    private String fname;
    private String lname;
    private String sex;
    private String fatherName;
    private String motherName;
    private String add;
    private String phone;
    private String dob;
    
    // Setters
    public void setOperation(String operation){this.operation = operation;}
    public void setAM(int am){this.am = am;}
    public void setFName(String fname){this.fname = fname;}
    public void setLName(String lname){this.lname = lname;}
    public void setGender(String sex){this.sex = sex;}
    public void setFather(String father){this.fatherName = father;}
    public void setMother(String mother){this.motherName = mother;}
    public void setAddress(String address){this.add = address;}
    public void setPhone(String phone){this.phone = phone;}
    public void setBirthday(String birthday){this.dob = birthday;}
    
    // Getters
    public String getOperation(){return operation;}
    public int getAM(){return am;}
    public String getFName(){return fname;}
    public String getLName(){return lname;}
    public String getGender(){return sex;}
    public String getFather(){return fatherName;}
    public String getMother(){return motherName;}
    public String getAddress(){return add;}
    public String getPhone(){return phone;}
    public String getBirthday(){return dob;}
    
    // INSERT, DELETE OR UPDATE actions
    public void manageStudent(String operation) {
        try {
            prstmt = conn.dbConnection.prepareStatement("SELECT manage_student(?,?,?,?,?,?,?,?,?,?::date) ");

            prstmt.setString(1, operation);
            prstmt.setInt(2, am);
            prstmt.setString(3, fname);
            prstmt.setString(4, lname);
            prstmt.setString(5, sex);
            prstmt.setString(6, fatherName);
            prstmt.setString(7, motherName);
            prstmt.setString(8, add);
            prstmt.setString(9, phone);
            prstmt.setString(10, dob);
            prstmt.execute();
            
            JOptionPane.showMessageDialog(null, prstmt.getWarnings().getMessage());
            System.err.println(prstmt.getWarnings().getMessage());
            
            prstmt.close();
        }catch (SQLException ex) {
            System.out.println("\n -- Manage Student SQL Exception --- \n");
            while (ex != null) {
                System.err.println("Message: " + ex.getMessage());
                ex = ex.getNextException();
            }   
        } 
    }

    // Check if Student exists
    public boolean checkIfExists(Integer am){
        boolean exists = false;
        try{
            String select = "SELECT * FROM checkStudent(?) ";
            prstmt = conn.dbConnection.prepareStatement(select);
            prstmt.setInt(1, am);
            
            rs = prstmt.executeQuery();
            
            exists = rs.next();
            
            prstmt.close();
        } catch (SQLException ex) {
            System.out.println("\n -- Student check if exists SQL Exception --- \n");
            while (ex != null) {
                System.out.println("Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
        return exists;
    }
    
    // Check if Student exists
    public boolean contains(Integer am){
        int counter = 0;
        try{
            String select = "SELECT * FROM contains_student(?) ";
            prstmt = conn.dbConnection.prepareStatement(select);
            prstmt.setInt(1, am);
            
            rs = prstmt.executeQuery();   
            while(rs.next())
                counter = rs.getInt(1);
            
            prstmt.close();
        } catch (SQLException ex) {
            System.out.println("\n -- Student check if exists SQL Exception --- \n");
            while (ex != null) {
                System.out.println("Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
        return counter > 0;
    }
    
    // Populate studentTable
    public void studentTable(JTable table, String search) {
        try {
            prstmt = conn.dbConnection.prepareStatement("SELECT * FROM search_student(?) ");
            prstmt.setString(1, search);

            rs = prstmt.executeQuery();

            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row;
            
            // Change column size
            GUI g = new GUI();

            g.colSize(table, 0, 1);
            g.colSize(table, 1, 30);
            g.colSize(table, 2, 50);
            g.colSize(table, 3, 10);
            g.colSize(table, 4, 45);
            g.colSize(table, 6, 90);
            g.colSize(table, 7, 40);
            
            g.colHide(table, 5); // Mother Column
            g.colHide(table, 8); // Birthdate Column

            while (rs.next()) {
                row = new Object[9];
                row[0] = Integer.valueOf(rs.getString(1)); // AM
                row[1] = rs.getString(2); // First Name
                row[2] = rs.getString(3); // Last Name
                row[3] = rs.getString(4); // Gender
                row[4] = rs.getString(5); // Father Name
                row[5] = rs.getString(6); // Mother Name
                row[6] = rs.getString(7); // Address
                row[7] = rs.getString(8); // Phone
                row[8] = rs.getString(9); // Birthdate
                model.addRow(row);
            }
            
            prstmt.close();
        } catch (SQLException ex) {
            System.out.println("\n -- Student Table SQL Exception --- \n");
            while (ex != null) {
                System.out.println("Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
    }
}
