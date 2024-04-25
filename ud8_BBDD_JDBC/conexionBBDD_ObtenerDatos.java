package ud8_BBDD_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.exceptions.RSAException;

public class conexionBBDD_ObtenerDatos {

	public static void main(String[] args) {
		
		
		// 1. CREAR EL OBJETO CONEXION
		
		// SHOW VARIABLES WHERE Variable_name = 'port' --> para ver el puerto en phpmyadmin de nuestra base de datos
		
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/NorthwindNEW", "root", "");
			
			
			
			//2. CREAR OBJETO STATEMENT para poder despues ejecutar una consulta SQL
			Statement st = conexion.createStatement();
			
			
			
			//3. OBTENER EL RESULTSET (EJECUTAR LA INSTRUCCIOÓN SQL). 
			
			ResultSet rs = st.executeQuery("SELECT * FROM PRODUCTOS"); //es una especie de tabla vistual el ResultSet donde se almacenan los resultados
			
			//4. RECORRER o LEER el ResultSet Y MOSTRARLO POR CONSOLA
			//la condicion del while (miResultSet quiere decir que mientras haya un siguiente recorre la tabla virtual...)
			
			while (rs.next()) {
				System.out.println(rs.getString("Nombre") + " - " + rs.getString("ID_Proveedor") + " - " + rs.getString("PrecioUnitario") + " euros ");
			}
			
			
			
		} catch (SQLException e) {
			System.out.println("No se ha podido conectar con la base de datos.");
			e.printStackTrace();
		}

	}

}
