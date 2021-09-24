
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Grades {
    GUI g = new GUI();
    private Object[] row; 
    private String cname;
    private String semester;
    private int grades;
    private int sid;
    
    // Getters
    public String getCourseName() { return cname; }
    public String getSemester() { return semester; }
    public int getGrades() { return grades; }
    public int getStudentID() { return sid; }
    
    // Setters
    public void setCourseName(String cname) { this.cname = cname; }
    public void setSemester(String semester) { this.semester = semester; }
    public void setGrades(int grades) { this.grades = grades; }
    public void setStudentID(int sid) { this.sid = sid; }
    
    // Populate gradesTable
    public void gradesTable(JTable table, Integer search) {
        try {                      
            prstmt = conn.dbConnection.prepareStatement("SELECT * FROM get_grades(?) ");
            prstmt.setInt(1, search);
            
            rs = prstmt.executeQuery();
 
            DefaultTableModel model = (DefaultTableModel) table.getModel();
        
            // Change column size
            g.colSize(table, 0, 120);
            g.colSize(table, 1, 30);
            g.colSize(table, 2, 30);
            g.colSize(table, 3, 30);
            
            g.colHide(table, 4);
            
            while (rs.next()) {
                row = new Object[4];
                row[0] = rs.getString(1); // Course Name
                row[1] = rs.getString(2); // A old was Integer.valueOf(rs.getString(2));
                row[2] = rs.getString(3); // B old was Integer.valueOf(rs.getString(3));
                row[3] = rs.getString(4); // C old was Integer.valueOf(rs.getString(4));
                model.addRow(row);   
            }
            
            prstmt.close();
        } catch (SQLException ex) {
            System.out.println("\n -- Grades Table SQL Exception --- \n");
            while (ex != null) {
                System.out.println("Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
    }
    
    public void manage_grades(){
        try {                      
            prstmt = conn.dbConnection.prepareStatement("SELECT * FROM manage_grades(?,?,?,?) ");
            prstmt.setString(1, cname);
            prstmt.setInt(2, sid);
            prstmt.setString(3, semester);
            prstmt.setInt(4, grades);
            
            rs = prstmt.executeQuery();
          
            prstmt.close();
        } catch (SQLException ex) {
            System.out.println("\n -- Manage Grades SQL Exception --- \n");
            while (ex != null) {
                System.out.println("Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
    }
    
    // Get the average grade of the Student
    public void avg_grade(Integer sid, JLabel avg){
        try {                      
            prstmt = conn.dbConnection.prepareStatement("SELECT * FROM avg_grade(?) ");
            prstmt.setInt(1, sid);
            rs = prstmt.executeQuery();
 
            while(rs.next()){
                avg.setText(String.valueOf(rs.getFloat(1)));
            }
            
            prstmt.close();
        } catch (SQLException ex) {
            System.out.println("\n -- AVG Grade SQL Exception --- \n");
            while (ex != null) {
                System.out.println("Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
    }
    
    // Get best student in School
    public void top_student(JLabel avg){
        try {                      
            prstmt = conn.dbConnection.prepareStatement("SELECT * FROM highest_grade() ");
            rs = prstmt.executeQuery();

            while(rs.next())
                avg.setText(rs.getString(2) + " " + rs.getString(3) + " with " + rs.getString(4));
          
            prstmt.close();
        } catch (SQLException ex) {
            System.out.println("\n -- AVG Grade SQL Exception --- \n");
            while (ex != null) {
                System.out.println("Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
    }
    
    // Get the top five students based on average grade
    public void top_five_students(JTable table){
    try {                      
            prstmt = conn.dbConnection.prepareStatement("SELECT * FROM top_five() ");            
            rs = prstmt.executeQuery();
 
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            
            // Change column size
            g.colSize(table, 0, 10);
            g.colSize(table, 1, 30);
            g.colSize(table, 2, 80);
            g.colSize(table, 3, 10);
            
            g.colHide(table, 4);
            
            while (rs.next()) {
                row = new Object[4];
                row[0] = Integer.valueOf(rs.getString(1)); // Student AM
                row[1] = rs.getString(2); // First Name
                row[2] = rs.getString(3); // Last Name
                row[3] = rs.getString(4); // Grade
                model.addRow(row);   
            }
            
            prstmt.close();
        } catch (SQLException ex) {
            System.out.println("\n -- Grades Table SQL Exception --- \n");
            while (ex != null) {
                System.out.println("Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
    }
    
    static PreparedStatement prstmt = null;     
    static ResultSet rs = null;      
}
