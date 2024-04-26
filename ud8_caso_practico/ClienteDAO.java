package ud8_caso_practico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClienteDAO {
	
	//-------------------------CREAR ClienteDAO (apartado 3 del caso práctico)-----------------------------------
	
	/*Sigue una estructura DAO para implementar las operaciones CRUD (Crear, Leer, Actualizar y Eliminar) sobre tus
	 *  tablas de la base de datos, es decir, crea una clase ClienteDAO, CocheDAO y EmpleadoDAO, cada una contendrá 
	 *  los métodos para crear, leer, actualizar y eliminar en cada tabla. */
	
	// Constructor vacío
    public ClienteDAO() {
        
    }

    // Método para insertar un cliente en la base de datos
    public void insertarCliente(Connection conexion, String NIF, String nombre, String apellido1, String apellido2, String direccion, 
    		String telefono, String mail) {
    	
        String query = "INSERT INTO clientes (NIF, nombre, apellido1, apellido2, direccion, telefono, mail) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement statement = conexion.prepareStatement(query);
            statement.setString(1, NIF);
            statement.setString(2, nombre);
            statement.setString(3, apellido1);
            statement.setString(4, apellido2);
            statement.setString(5, direccion);
            statement.setString(6, telefono);
            statement.setString(7, mail);

            int filasAfectadas = statement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Cliente insertado correctamente.");
            } else {
                System.out.println("No se pudo insertar el cliente.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para consultar clientes en la base de datos
    public void consultarClientes(Connection conexion, String consulta, String... campos) {
        try (Statement st = conexion.createStatement();
             ResultSet rs = st.executeQuery(consulta)) {

            while (rs.next()) {
                System.out.println("INFO CLIENTE:");
                for (String campo : campos) {
                    System.out.println(campo + ": " + rs.getString(campo));
                }
                System.out.println("----------------------------------");
            }
        } catch (SQLException e) {
            System.out.println("No se ha podido realizar la consulta de clientes.");
            e.printStackTrace();
        }
    }

    // Método para actualizar los datos de un cliente en la base de datos
    public void actualizarCliente(Connection conexion, String modificacion) {
        String consulta = "UPDATE clientes SET " + modificacion;
        try {
            Statement st = conexion.createStatement();
            int filasActualizadas = st.executeUpdate(consulta);

            if (filasActualizadas > 0) {
                System.out.println("Cliente actualizado correctamente.");
            } else {
                System.out.println("No se pudo actualizar ningún cliente.");
            }
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para eliminar un cliente de la base de datos
    public void eliminarCliente(Connection conexion, String condicion) {
        try {
            String consultaBase = "DELETE FROM clientes";
            String consultaCompleta = consultaBase + " WHERE " + condicion;

            Statement st = conexion.createStatement();
            int filasEliminadas = st.executeUpdate(consultaCompleta);
            System.out.println("Se han eliminado " + filasEliminadas + " filas correctamente de la tabla clientes");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
}
