package ud8_caso_practico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
	
		//-------------------------CREAR CLASE ConexionDB (apartado 2.c del caso práctico)-----------------------------------
	
		/*Clase ConexionBD: Con los atributos de la conexión y un método getConnection que establecerá la conexión
		 *  a la base de datos.  */
		
	
		    private static final String URL = "jdbc:mysql://localhost:3306/concesionario";
		    private static final String USUARIO = "root";
		    private static final String CONTRASENA = "";

		    public static Connection getConnection() throws SQLException {
		        return DriverManager.getConnection(URL, USUARIO, CONTRASENA);
		    }
		    
}
	

