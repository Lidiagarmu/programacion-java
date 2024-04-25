package ud8_BBDD_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class conexionBBDD_InsertarRegistro {

	public static void main(String[] args) {
		
		// 1. CREAR EL OBJETO CONEXION
		
		// SHOW VARIABLES WHERE Variable_name = 'port' --> para ver el puerto en phpmyadmin de nuestra base de datos
		
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/NorthwindNEW", "root", "");
			
			
			
		
			//2. CREAR OBJETO STATEMENT para poder despues ejecutar una consulta SQL
			
			Statement st = conexion.createStatement();
		
			
		
			//3. INSERTAMOS UN REGISTRO EN UNA TABLA
			
			String insercion = "INSERT INTO PRODUCTOS (Nombre, ID_Proveedor, PrecioUnitario) VALUES ('Zanahoria', 7, 13)";
					
					
			//4. EJECUTAR LA SENTENCIA SQL
					
					st.executeUpdate(insercion);
					System.out.println("Datos insertados correctamente"); 
			
			
			
			
		} catch (SQLException e) {
			System.out.println("No se ha podido conectar con la base de datos.");
			e.printStackTrace();
		}

	}

	}


