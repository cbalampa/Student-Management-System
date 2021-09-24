
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Classroom {
    private int number_of_Students = 0;
    private static PreparedStatement prstmt = null;    
    private static ResultSet rs = null; 
    
    private String classList[] = new String[20];
    private String cname;
    private int sid;
    
    public Classroom(){}
            
    public Classroom(int n){
        this.number_of_Students = n;
    }
    
    // Getters
    public String getClassroomName() {return cname;}
    public int getStudentID() {return sid;}
    
    public int getNumberOfStudents(){return number_of_Students;}
    
    // Setters
    public void setClassroomName(String cname) {this.cname = cname;}
    public void setStudentID(int id) {this.sid = id;}

    // Fill JComboBox with all available classes
    public void classList(JComboBox combobox){
        int i = 0;
        try {                      
            prstmt = conn.dbConnection.prepareStatement("SELECT return_all_classes() ");
            rs = prstmt.executeQuery();

            while (rs.next()) 
                classList[i++] = rs.getString(1);
              
            prstmt.close();
        } catch (SQLException ex) {
            System.out.println("\n -- Class List SQL Exception --- \n");
            while (ex != null) {
                System.out.println("Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
        combobox.addItem("");
        for(int y=0; y<i; y++){combobox.addItem(classList[y]);}
    }   
    
    // Populate classTable
    public void classTable(JTable table, String search) {
        try {                      
            prstmt = conn.dbConnection.prepareStatement("SELECT * FROM get_classroom(?) ");
            prstmt.setString(1, search);       
            rs = prstmt.executeQuery();
 
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row; 
            
            // Change column size
            GUI g = new GUI();
            g.colSize(table, 0, 30);
            g.colSize(table, 1, 30);
            g.colSize(table, 4, 30);
            
            while (rs.next()) {
                row = new Object[9];
                row[0] = Integer.valueOf(rs.getString(1)); // Class ID
                row[1] = rs.getString(2); // Class Name
                row[2] = rs.getString(3); // First Name
                row[3] = rs.getString(4); // Last Name
                row[4] = Integer.valueOf(rs.getString(5)); // Student AM
                model.addRow(row);   
            }
            
            prstmt = conn.dbConnection.prepareStatement("SELECT COUNT(*) FROM get_classroom(?) ");
            prstmt.setString(1, search);
            
            rs = prstmt.executeQuery();
                       
            while (rs.next())
                number_of_Students = rs.getInt(1);
            
            prstmt.close();
        } catch (SQLException ex) {
            System.out.println("\n -- Class Table SQL Exception --- \n");
            while (ex != null) {
                System.out.println("Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
    }
    
    // INSERT, DELETE OR UPDATE actions
    public void manageClass(String operation) {
        try {
            prstmt = conn.dbConnection.prepareStatement("SELECT manage_class(?,?,?) ");

            prstmt.setString(1, operation);
            prstmt.setString(2, cname);   
            prstmt.setInt(3, sid);
            prstmt.execute();
            
            JOptionPane.showMessageDialog(null, prstmt.getWarnings().getMessage());
            System.err.println(prstmt.getWarnings().getMessage());
            
            prstmt.close();
        }catch (SQLException ex) {
            System.out.println("\n -- Manage Class SQL Exception --- \n");
            while (ex != null) {
                System.out.println("Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }  
    }
    
    // INSERT, DELETE OR UPDATE actions for CLASSROOM
    public void manageClassroom(String operation){
        try{
            String select = "SELECT * FROM manage_classroom(?, ?) ";
            prstmt = conn.dbConnection.prepareStatement(select);
            prstmt.setString(1, operation);
            prstmt.setString(2, cname);
            
            rs = prstmt.executeQuery();

            JOptionPane.showMessageDialog(null, prstmt.getWarnings().getMessage());
            System.err.println(prstmt.getWarnings().getMessage());
            
            prstmt.close();
        } catch (SQLException ex) {
            System.out.println("\n -- Manage Classroom SQL Exception --- \n");
            while (ex != null) {
                System.out.println("Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
    }  
}
