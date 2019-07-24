
package controlador;

import clase_conexion.Conexion;
import entidades.Persona;
import entidades.Telefono;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CrudTelefono {
    Conexion conector = new Conexion();
    Connection conn = conector.getConnection();
    
    //metodo encargado de registrar lo datos en nuesta BD
    public void insertarDatosTelefono (String telefono, String tipo, int idPersona){
        try{
            String insert = "INSERT INTO telefono (numero, tipo, PERSONA_idPersona) VALUES (?,?,?)";
     
            PreparedStatement preparado = conn.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            preparado.setString(1, telefono);
            preparado.setString(2, tipo);
            preparado.setInt(3, idPersona);
            preparado.executeUpdate();
            preparado.close();
            Verificador.setError(false);
        }catch(SQLException e){
            Verificador.setError(true);
            JOptionPane.showMessageDialog(null, e.getMessage());
        }  
    }

    /*Metodo encargado de extraer todos los datos 
      de la tabla Telefono de la base de datos*/
    public ArrayList<Telefono> buscarTelefonos(Persona persona){
        ArrayList<Telefono> arreglo = null;
        ResultSet rs = null;
        String consultaGeneral = " SELECT * FROM telefono WHERE PERSONA_idPersona = ? ";
        try{
            PreparedStatement preparado = conn.prepareStatement(consultaGeneral);
            preparado.setInt(1, persona.getIdPersona());
            rs = preparado.executeQuery();
            if(rs.next()){
                arreglo = new ArrayList<Telefono>();
                Telefono telefono = new Telefono();
                telefono.setNumero(rs.getLong("numero"));
                telefono.setTipo(rs.getString("tipo"));
                arreglo.add(telefono);
            }
            while(rs.next()){
                Telefono telefono = new Telefono();
                telefono.setNumero(rs.getLong("numero"));
                telefono.setTipo(rs.getString("tipo"));
                arreglo.add(telefono);
            }
            preparado.close();
            
        }catch(SQLException e){
            Verificador.setError(true);
            e.getStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
        return arreglo;
    }

}
