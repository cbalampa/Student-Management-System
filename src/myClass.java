
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class myClass {
    private int number_of_Students = 0;
    
    public myClass(){};
    
    public myClass(int n){
        this.number_of_Students = n;
    }
    
    public int getNumberOfStudents(){return number_of_Students;}
    
    String classList[] = new String[20];
    
    // Fill JComboBox with all available classes
    public void classList(JComboBox combobox){
        int i = 0;
        try {                      
                prstmt = conn.dbConnection.prepareStatement("SELECT return_all_classes() ");
                rs = prstmt.executeQuery();

                while (rs.next()) {
                    classList[i] = rs.getString(1);
                    i++;
                }
                
                prstmt.close();
            } catch (SQLException ex) {
                System.out.println("\n -- Class List SQL Exception --- \n");
                while (ex != null) {
                    System.out.println("Message: " + ex.getMessage());
                    ex = ex.getNextException();
                }
            }
        combobox.addItem("");
        for(int y=0;y<i;y++){combobox.addItem(classList[y]);}
    }    
    
    // Populate classTable
    public void classTable(JTable table, String search) {
        try {                      
            prstmt = conn.dbConnection.prepareStatement("SELECT * FROM get_class(?) ");
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
            
            prstmt = conn.dbConnection.prepareStatement("SELECT COUNT(*) FROM get_class(?) ");
            prstmt.setString(1, search);
            
            rs = prstmt.executeQuery();
                       
            while (rs.next()) {
                number_of_Students = rs.getInt(1);
            }
            
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
    public void manageClass(String operation, JComboBox cname, Integer student) {
        try {
            prstmt = conn.dbConnection.prepareStatement("SELECT manage_class(?,?,?) ");

            prstmt.setString(1, operation);
            prstmt.setString(2, String.valueOf(cname.getSelectedItem()));   
            prstmt.setInt(3, student);
            prstmt.execute();
            
            prstmt.close();
        }catch (SQLException ex) {
            System.out.println("\n -- Manage Class SQL Exception --- \n");
            while (ex != null) {
                System.out.println("Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }  
    }
    
    // Check if Student exists in class
    public boolean student_in_class(Integer am){
        boolean exists = false;
        try{
            String select = "SELECT * FROM check_student_class(?) ";
            prstmt = conn.dbConnection.prepareStatement(select);
            prstmt.setInt(1, am);
            
            rs = prstmt.executeQuery();
            
            while(rs.next()){
                exists = true;
            }
            
            prstmt.close();
        } catch (SQLException ex) {
            System.out.println("\n -- Student in class SQL Exception --- \n");
            while (ex != null) {
                System.out.println("Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
        return exists;
    }
    
    public boolean checkDelete(Integer am, String room){
        boolean exists = false;
        try{
            String select = "SELECT * FROM check_delete_student_class(?,?) ";
            prstmt = conn.dbConnection.prepareStatement(select);
            prstmt.setInt(1, am);
            prstmt.setString(2, room);
            
            rs = prstmt.executeQuery();

            while(rs.next()){
                exists = true;
            }
            
            prstmt.close();
        } catch (SQLException ex) {
            System.out.println("\n -- Check Delete SQL Exception --- \n");
            while (ex != null) {
                System.out.println("Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
        return exists;
    }
    
    // Check if Classroom exists
    public boolean classroomExists(String cname){
        boolean exists = false;
        try{
            String select = "SELECT * FROM check_classroom(?) ";
            prstmt = conn.dbConnection.prepareStatement(select);
            prstmt.setString(1, cname);
            
            rs = prstmt.executeQuery();

            if(rs.next()){
                System.out.print("DEBUG: Classroom exists.");
                exists = true;
            }
            
            prstmt.close();
        } catch (SQLException ex) {
            System.out.println("\n -- Classroom Exists SQL Exception --- \n");
            while (ex != null) {
                System.out.println("Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
        return exists;
    }
    
    // INSERT, DELETE OR UPDATE actions for CLASSROOM
    public void manage_classroom(String operation, String classroom_name){
        try{
            String select = "SELECT * FROM manage_classroom(?, ?) ";
            prstmt = conn.dbConnection.prepareStatement(select);
            prstmt.setString(1, operation);
            prstmt.setString(2, classroom_name);
            
            rs = prstmt.executeQuery();

            prstmt.close();
        } catch (SQLException ex) {
            System.out.println("\n -- Manage Classroom SQL Exception --- \n");
            while (ex != null) {
                System.out.println("Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
    }
    
    static PreparedStatement prstmt = null;    
    static ResultSet rs = null;   
}
