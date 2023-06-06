
package CLASES;

import java.sql.Connection;
import java.sql.SQLException;

public class Inicio {
    public static void main(String[] args){
        Conexion con = new Conexion();
        
        try(Connection cnx = con.getConexion() ){
           
        }catch(SQLException ex){
            System.out.println(ex);
        }
        
    }
}