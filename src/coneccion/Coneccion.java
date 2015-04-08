package coneccion;

import java.sql.ResultSet;
import java.sql.Statement;

public class Coneccion {
    public static void main(String[] args) {
        if (Conexion.conectar() == null) {
            System.out.println("La conexion Fallo!!!.");
        } else {
            System.out.println("La conexion fue Exitosa!!!.");
            try {
               Statement st= Conexion.conectar().createStatement();
                ResultSet rs=st.executeQuery("SELECT * FROM PERSONA");
                while (rs.next()) {                  
                    System.out.println
                    ("ID:"+rs.getInt("ID_PERSONA")
                    +" |NOMBRE Y APELLIDOS: "+rs.getString("NOMBRE")+" "+rs.getString("APELLIDO_PAT")+" "+rs.getString("APELLIDO_MAT")
                    +" |DNI: "+rs.getString("DNI"));
                }
            } catch (Exception e) {
            }
        }
   
    }
}
