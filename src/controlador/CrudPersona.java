package controlador;

import clase_conexion.Conexion;
import entidades.Persona;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CrudPersona {
    Conexion conector = new Conexion();
    Connection conn = conector.getConnection();
    
    //metodo encargado de registrar lo datos en nuesta BD
    public int insertarDatosPersona (String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String direccion){
        int idPersona = 0;
        try{
            String insert = "INSERT INTO persona(primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, direccion) VALUES(?,?,?,?,?)";
            ResultSet rs = null;
            PreparedStatement preparado = conn.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            preparado.setString(1, primerNombre);
            preparado.setString(2, segundoNombre);
            preparado.setString(3, primerApellido);
            preparado.setString(4, segundoApellido);
            preparado.setString(5, direccion);
            preparado.executeUpdate();
            rs = preparado.getGeneratedKeys();
            if(rs.next())
            {
                idPersona=rs.getInt(1);
                Verificador.setError(false);
            }else{
                Verificador.setError(true);
            }
            preparado.close();
            //Verificador.setError(false);
            
        }catch(SQLException e){
            Verificador.setError(true);
            e.getStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return idPersona;
    }
     
    /*Metodo encargado de extraer todos los datos 
      de la tabla Persona de la base de datos*/
    public ArrayList<Persona> buscarPersonas(){
        ArrayList<Persona> arreglo = null;
        ResultSet rs = null;
        String consultaGeneral = "SELECT * FROM persona";
        try{
            PreparedStatement preparado = conn.prepareStatement(consultaGeneral);
            rs = preparado.executeQuery(consultaGeneral);
            if(rs.next()){
                arreglo = new ArrayList<Persona>();
                Persona persona = new Persona();
                persona.setIdPersona(rs.getInt("id_persona"));
                persona.setPrimerNombre(rs.getString("primer_nombre"));
                persona.setSegundoNombre(rs.getString("segundo_nombre"));
                persona.setPrimerApellido(rs.getString("primer_apellido"));
                persona.setSegundoApellido(rs.getString("segundo_apellido"));
                persona.setDireccion(rs.getString("direccion"));
                arreglo.add(persona);
            }
            while(rs.next()){
                Persona persona = new Persona();
                persona.setIdPersona(rs.getInt("id_persona"));
                persona.setPrimerNombre(rs.getString("primer_nombre"));
                persona.setSegundoNombre(rs.getString("segundo_nombre"));
                persona.setPrimerApellido(rs.getString("primer_apellido"));
                persona.setSegundoApellido(rs.getString("segundo_apellido"));
                persona.setDireccion(rs.getString("direccion"));
                arreglo.add(persona);
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
