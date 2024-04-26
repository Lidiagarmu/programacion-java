package ud8_caso_practico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class CocheDAO {
	
	//-------------------------CREAR CocheDAO (apartado 3 del caso práctico)-----------------------------------
	
	/*Sigue una estructura DAO para implementar las operaciones CRUD (Crear, Leer, Actualizar y Eliminar) sobre tus
	 *  tablas de la base de datos, es decir, crea una clase ClienteDAO, CocheDAO y EmpleadoDAO, cada una contendrá 
	 *  los métodos para crear, leer, actualizar y eliminar en cada tabla. */
	

    // Método constructor por defecto
    public CocheDAO() {
        
    }

    // Método para insertar un coche en la base de datos
    public void insertarCoche(Connection conexion, String matricula, String modelo, String tipo, int precio, String color, int kms,
    		String garantia, String antiguo_propietario) {
    	
        String query = "INSERT INTO coches (matricula, modelo, tipo, precio, color, kms, garantia, antiguo_propietario) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement statement = conexion.prepareStatement(query);
            statement.setString(1, matricula);
            statement.setString(2, modelo);
            statement.setString(3, tipo);
            statement.setInt(4, precio);
            statement.setString(5, color);
            statement.setInt(6, kms);
            statement.setString(7, garantia);
            statement.setString(8, antiguo_propietario);

            int filasAfectadas = statement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Coche insertado correctamente.");
            } else {
                System.out.println("No se pudo insertar el coche.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para consultar un coche en la base de datos
    public void consultarCoche(Connection conexion) {
        Scanner sc = new Scanner(System.in);
        String modelo = null;
        String precio = null;
        String consulta = "SELECT modelo, precio FROM coches WHERE matricula = ?";

        try (PreparedStatement ps = conexion.prepareStatement(consulta)) {
            System.out.println("Introduce la matrícula del coche");
            String matricula = sc.nextLine();

            ps.setString(1, matricula);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("INFO COCHE:\nModelo: " + rs.getString("modelo") + "\nPrecio: " + rs.getInt("precio") + " €");
                System.out.println("----------------------------------");
            }

        } catch (SQLException e) {
            System.out.println("No se ha podido realizar la consulta");
            e.printStackTrace();
        } finally {
            sc.close(); // Cerrar el Scanner para optimizar los recursos
        }
    }

    // Método para actualizar un coche en la base de datos
    public void actualizarCoche(Connection conexion, String modificacion) {
        String consulta = "UPDATE coches SET " + modificacion;

        try {
            Statement st = conexion.createStatement();
            int filasActualizadas = st.executeUpdate(consulta);

            if (filasActualizadas > 0) {
                System.out.println("Coche actualizado correctamente.");
            } else {
                System.out.println("No se pudo actualizar ningún coche.");
            }

            st.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para eliminar un coche de la base de datos
    public void eliminarCoche(Connection conexion, String condicion) {
        try {
            String consultaBase = "DELETE FROM coches";
            String consultaCompleta = consultaBase + " WHERE " + condicion;

            Statement st = conexion.createStatement();
            int filasEliminadas = st.executeUpdate(consultaCompleta);

            System.out.println("Se han eliminado " + filasEliminadas + " filas correctamente de la tabla coches");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

	
}
