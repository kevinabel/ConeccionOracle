package coneccion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public static Connection conectar(){
    Connection conexion = null;
        try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        conexion=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","prueba1","Kevin1234");
        } catch (Exception e) {
            e.printStackTrace();
        }
    return conexion;
    }
}
