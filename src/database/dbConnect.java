
package database;
import java.sql.*;
import javax.swing.JOptionPane;

public class dbConnect {
  public static Connection c;
  public static Statement stmt;
  static{
      try{
        c =DriverManager.getConnection("jdbc:mysql://localhost:3306/expensetracker"+"?openSSL=false", "root", "Vaivaswat@0047");
        stmt=c.createStatement();
      }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
  }
        

}
