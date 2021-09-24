
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Course {
    private static PreparedStatement prstmt = null;    
    private static ResultSet rs = null;    
    
    private String courseList[] = new String[20];
    private String cname;
    private int teachers = 0;
    private int tid;

    // Getters
    public int getNumberOfTeachers(){return teachers;}
    public String getCourseName() { return cname; }
    public int getTeacherID() { return tid; }
    
    // Setters
    public void setCourseName(String course) { this.cname = course; }
    public void setTeacherID(int tid) { this.tid = tid; }  
    public void setNumberOfTeachers(int newCAP){this.teachers = newCAP;}
    
    // Fill ComboBox with every course in database
    public void courseList(JComboBox combobox){
        int i = 0;
        try {                      
            prstmt = conn.dbConnection.prepareStatement("SELECT course_list() ");
            rs = prstmt.executeQuery();

            while (rs.next())
                courseList[i++] = rs.getString(1);
                
            prstmt.close();
        } catch (SQLException ex) {
            System.out.println("\n -- Course List SQL Exception --- \n");
            while (ex != null) {
                System.out.println("Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
        combobox.addItem("");
        for(int y=0; y<i; y++){combobox.addItem(courseList[y]);}
    }    
    
    // Fill the JTable with every teacher who has been assigned to a course
    public void courseTable(JTable table, String search) {
        try {                      
            prstmt = conn.dbConnection.prepareStatement("SELECT * FROM get_course(?) ");
            prstmt.setString(1, search);
            
            rs = prstmt.executeQuery();
 
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row; 
            
            // Change column size
            GUI g = new GUI();

            g.colSize(table, 0, 30);
            g.colSize(table, 1, 100);
            g.colSize(table, 2, 40);
            g.colSize(table, 4, 30);
            
            while (rs.next()) {
                row = new Object[9];
                row[0] = Integer.valueOf(rs.getString(1)); // Course ID
                row[1] = rs.getString(2); // Course Name
                row[2] = rs.getString(3); // First Name
                row[3] = rs.getString(4); // Last Name
                row[4] = Integer.valueOf(rs.getString(5)); // Teacher ID
                model.addRow(row);   
            }
            
            prstmt = conn.dbConnection.prepareStatement("SELECT COUNT(*) FROM get_course(?) ");
            prstmt.setString(1, search);
            
            rs = prstmt.executeQuery();
            
            while (rs.next()) {
                teachers = rs.getInt(1);
            }
            
            prstmt.close();
        } catch (SQLException ex) {
            System.out.println("\n -- Course Table SQL Exception --- \n");
            while (ex != null) {
                System.out.println("Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
    }
    
    // Edit relationship between Teachers and Courses   
    public void manageAssignments(String operation) {
        try {
            prstmt = conn.dbConnection.prepareStatement("SELECT manage_assignments(?,?,?) ");

            prstmt.setString(1, operation);
            prstmt.setString(2, cname);   
            prstmt.setInt(3, tid);
            prstmt.execute();
            
            JOptionPane.showMessageDialog(null, prstmt.getWarnings().getMessage());
            System.err.println(prstmt.getWarnings().getMessage());
            
            prstmt.close();
        }catch (SQLException ex) {
            System.out.println("\n -- Manage Course Teacher SQL Exception --- \n");
            while (ex != null) {
                System.out.println("Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }  
    }   
    
    public void manageCourses(String operation){
        try{
            String select = "SELECT * FROM manage_courses(?, ?) ";
            prstmt = conn.dbConnection.prepareStatement(select);
            prstmt.setString(1, operation);
            prstmt.setString(2, cname);
            
            rs = prstmt.executeQuery();

            JOptionPane.showMessageDialog(null, prstmt.getWarnings().getMessage());
            System.err.println(prstmt.getWarnings().getMessage());
            
            prstmt.close();
        } catch (SQLException ex) {
            System.out.println("\n -- Manage Courses SQL Exception --- \n");
            while (ex != null) {
                System.out.println("Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
    }  
}
