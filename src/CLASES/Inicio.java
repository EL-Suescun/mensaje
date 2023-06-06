
package CLASES;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Inicio {
    //Metodo principal del programa
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        Conexion con = new Conexion();
        
        try(Connection cnx = con.getConexion() ){
           
        }catch(SQLException ex){
            System.out.println(ex);
        }        
    }//Cierre del metodo
}