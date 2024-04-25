package ud8_BBDD_JDBC;
import java.sql.*;

public class Conecta_BD {

	public static void main(String[] args) {
		
		
		
		try {
			 /* Cargar el controlador JDBC de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver"); --> En principio no es necesario para ver en consola*/
            
            
			//1. CREAR LA CONEXIÓN
			//para establecer la conexión vamos a necesitar un objeto de tipo Conexión
			// y además vamos a necesitar la clase Driver Manager
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/NorthwindNEW", "root", "");
			
			//2. CREAR OBJETO STATEMENT para poder despues ejecutar una consulta SQL
			Statement miStatement = miConexion.createStatement();
			
			//3. EJECUTAR LA INSTRUCCIOÓN SQL. Para ello necesitamos el objeto de tipo Statement
			/*gracias al objeto de tipo Statement podemos usar su método executeQuery (String sql) el cual devuelve un ResultSet. Por
			 * parámetro como String le pasaremos la sentencia SQL*/
			
			ResultSet miResultSet = miStatement.executeQuery("SELECT * FROM PRODUCTOS"); //es una especie de tabla vistual el ResultSet donde se almacenan los resultados
			
			//4. RECORRER o LEER el ResultSet
			//la condicion del while (miResultSet quiere decir que mientras haya un siguiente recorre la tabla virtual...)
			while (miResultSet.next()) {
				System.out.println(miResultSet.getString("Nombre") + " " + miResultSet.getString("ID_Proveedor") + " " + miResultSet.getString("PrecioUnitario"));
			}
			
			
		} catch (Exception e) {
			System.out.println("¡No conecta!");
			e.printStackTrace(); //imprimimos también la pila para que en caso de que haya error nos de una pista 
		
		}

	}

}
