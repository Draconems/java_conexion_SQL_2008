
package Conexiones;

import java.sql.CallableStatement; //Llamadas
import java.sql.SQLException;  // Errores

public class Procedimientos {
    
    public static void EntradaArticulo(String a, String b, String c)throws SQLException{
    CallableStatement entrada= Conexion.getConexion().prepareCall("{call EntradaArticulo(?,?,?)}");
    entrada.setString(1,a);
    entrada.setString(2,b);
    entrada.setString(3,c);
    entrada.execute();
    }  
    
    public static void EliminarArticulo(int a)throws SQLException{
    CallableStatement entrada= Conexion.getConexion().prepareCall("{call EliminarArticulo(?)}");
    entrada.setInt(1,a);
    entrada.execute();
    } 
    
    public static void BuscarArticulo(int a)throws SQLException{
    CallableStatement entrada= Conexion.getConexion().prepareCall("{call BuscarArticulo(?)}");
    entrada.setInt(1,a);
    entrada.execute();
    }     
    
}
