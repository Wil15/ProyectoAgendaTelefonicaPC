package clase_conexion;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Wilkince Mauricio
 */
public class Conexion {
    
    //declaracion de variables
    private String nombreBd = "agenda";
    private String usuario = "root";
    private String password = "12345";
    private String url = "jdbc:mysql://127.0.0.1/"+nombreBd;
    
    private static Connection conn = null;
    
    //metodo que retorna la conexion
    public Connection getConnection(){
        if(conn == null){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(url,usuario,password);
                JOptionPane.showMessageDialog(null, "Conection succesfull");
            }catch(ClassNotFoundException e){
                e.printStackTrace();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        return conn;
    }
    //metodo encargado de desconectar la base de datos
    public void desconectar(){
        try{
            conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
