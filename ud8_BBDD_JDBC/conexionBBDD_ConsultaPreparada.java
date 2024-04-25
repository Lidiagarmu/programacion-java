package ud8_BBDD_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class conexionBBDD_ConsultaPreparada {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 1. CREAR EL OBJETO CONEXION
		
		// SHOW VARIABLES WHERE Variable_name = 'port' --> para ver el puerto en phpmyadmin de nuestra base de datos
		
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/NorthwindNEW", "root", "");
			
			
			// 2. CREAMOS LA CONSULTA PREPARADA 
			
			PreparedStatement ps = conexion.prepareStatement("SELECT CODIGO, NOMBRE, PRECIO FROM PRODUCTOS WHERE CODIGO = ?");
			
			System.out.println("Introduce el codigo del articulo");
			String codigo = scanner.nextLine();
			
			ps.setString(1, codigo);
			// ps.setString(2, codigo); si hubiera mas ?
			
			// 3. OBTENER EL RESULTSET
			ResultSet rs = ps.executeQuery();
			
			//4. LEER EL RESULTSET Y MOSTRARLO POR CONSOLA
			
			while (rs.next()) {
				System.out.println(rs.getString("CODIGO") + " - " + rs.getString("Nombre") + " - " + rs.getDouble("Precio"));
			
					
				// PARA LIBERAR RECURSOS
		
				// Cerrar ResultSet primero
				rs.close();
				// Luego cerrar PreparedStatement
				ps.close();
				
				
		} }catch (SQLException e) {
			System.out.println("No se ha podido conectar con la base de datos.");
			e.printStackTrace();
		}

	
	}
	

}
