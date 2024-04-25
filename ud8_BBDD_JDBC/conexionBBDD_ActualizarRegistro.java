package ud8_BBDD_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class conexionBBDD_ActualizarRegistro {

	public static void main(String[] args) {
		
		// 1. CREAR EL OBJETO CONEXION
		
				// SHOW VARIABLES WHERE Variable_name = 'port' --> para ver el puerto en phpmyadmin de nuestra base de datos
				
				try {
					Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/NorthwindNEW", "root", "");
					
					
			
					//2. CREAR OBJETO STATEMENT para poder despues ejecutar una consulta SQL
					
					Statement st = conexion.createStatement();
					
					
			
				
					// 3. ACTUALIZAR UN REGISTRO
					 
				
					String actualizacion = "UPDATE producos SET PrecioUnitario = 10 WHERE codigo = ";
					
					st.executeUpdate(actualizacion);
					System.out.println("Datos actualizados correctamente");
					
					
					

				} catch (SQLException e) {
					System.out.println("No se ha podido conectar con la base de datos.");
					e.printStackTrace();
			
				}
	}
}
