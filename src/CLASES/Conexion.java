package CLASES;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
   //crear la variable de conexion
    Connection con=null;
    
    //Crear las variables para la cadena de conexion    
    private String url="jdbc:sqlserver://localhost:1433;database=MensajesApp;integratedSecurity=true;";   
    private String SQL="";
    
    //Método para establecer la conexion
    public Connection getConexion(){
        try{
            con=DriverManager.getConnection(url);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR: "+ex.getMessage());
        }
        return con;
    }//Cierre del método 
}
