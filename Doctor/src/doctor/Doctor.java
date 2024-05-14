import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


/**
 *
 * @author namoc
 */
public class Doctor extends javax.swing.JFrame {
    
    public Doctor(){
        initComponents();
        Connect();
        AutoId();
        patient_table();
    }
    
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        
        public void Connect(){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/loyalhospital", "root","");
                
            }
                catch (ClassNotFoundException ex){
                   Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
                   
                }
                catch (SQLEXCEPTION ex){
                    Logger.getLogger(User.class.getName().log(Level.SEVERE, null, ex);
                
                }
        }
        
        public void AUTOID(){
            
            try {
                Statement s = con.createStatement();
                rs = s.executeQuery("select Max(doctorno) from doctor");
                rs.next();
                rs.getString("MAX(doctorno)");
                
                if(rs.getString("MAX(doctorno)")== null){
                    
                    lblpno.setText("DSOO1");
                    
                }
                else {  
                    long id = Long.parseLong(rs.("MAX(doctorno)").substring(2,rs.getString("MAX(doctorno)").length()));
                    id++;
                    lblpno.setText("DS"+ String.format("%03d", id));
                }
                
            }
                catch (SQLException ex) {
                    Logger.getLogger()
                }
        }
    
}
