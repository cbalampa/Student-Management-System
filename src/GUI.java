import java.awt.Color;
import java.awt.Font;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableColumn;

public class GUI {
    // Change Label and Text color to red
    public void errorColors(JLabel label){
        label.setForeground(Color.red);
        label.setFont(new Font("Segoe UI", Font.ITALIC, 12));
    }    
    public void errorColors(JLabel label, JTextField textfield){
        label.setForeground(Color.red);
        label.setFont(new Font("Segoe UI", Font.ITALIC, 12));
        textfield.setBorder(BorderFactory.createEtchedBorder(null, Color.red));
    }
    
    // Reset Label and Text to their original color
    public void resetColors(JLabel label){
        label.setForeground(Color.black);
        label.setFont(new Font("Segoe UI", Font.PLAIN, 12));
    }
    public void resetColors(JLabel label, JTextField textfield){
        label.setForeground(Color.black);
        label.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        textfield.setBorder(BorderFactory.createEtchedBorder(null, new Color(204,204,204)));
    }
 
    // Clear Text
    public void clearTextField(Vector v){
        for(int i=0; i<v.size(); i++)
            ((JTextField) v.elementAt(i)).setText("");
    }
    
       
    public void colSize(JTable table, int colnumber, int size){     
        TableColumn col = table.getColumnModel().getColumn(colnumber);
        col.setPreferredWidth(size);
    }
    // Hide columns
    public void colHide(JTable table, int colnumber){  
        table.getColumnModel().getColumn(colnumber).setMinWidth(0);
        table.getColumnModel().getColumn(colnumber).setMaxWidth(0);
    }    
}
