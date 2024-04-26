package ud8_caso_practico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class EmpleadoDAO {
	
	//-------------------------CREAR EmpleadoDAO (apartado 3 del caso práctico)-----------------------------------
	
	/*Sigue una estructura DAO para implementar las operaciones CRUD (Crear, Leer, Actualizar y Eliminar) sobre tus
	 *  tablas de la base de datos, es decir, crea una clase ClienteDAO, CocheDAO y EmpleadoDAO, cada una contendrá 
	 *  los métodos para crear, leer, actualizar y eliminar en cada tabla. */
	

	// Constructor vacío
    public EmpleadoDAO() {
        
    }

    // Método para insertar un empleado en la base de datos
    public void insertarEmpleado(Connection conexion, String NIF, String nombre, String apellido1, String apellido2, String direccion, 
    		String telefono, String mail, double sueldo) {
    	
        String query = "INSERT INTO empleados (NIF, nombre, apellido1, apellido2, direccion, telefono, mail, sueldo) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement statement = conexion.prepareStatement(query);
            statement.setString(1, NIF);
            statement.setString(2, nombre);
            statement.setString(3, apellido1);
            statement.setString(4, apellido2);
            statement.setString(5, direccion);
            statement.setString(6, telefono);
            statement.setString(7, mail);
            statement.setDouble(8, sueldo);

            int filasAfectadas = statement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Empleado insertado correctamente.");
            } else {
                System.out.println("No se pudo insertar el empleado.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para consultar empleados en la base de datos
    public void consultarEmpleados(Connection conexion, String consulta, String... campos) {
        try (Statement st = conexion.createStatement();
             ResultSet rs = st.executeQuery(consulta)) {

            while (rs.next()) {
                System.out.println("INFO EMPLEADO:");
                for (String campo : campos) {
                    System.out.println(campo + ": " + rs.getString(campo));
                }
                System.out.println("----------------------------------");
            }
        } catch (SQLException e) {
            System.out.println("No se ha podido realizar la consulta de empleados.");
            e.printStackTrace();
        }
    }

    // Método para actualizar el sueldo de los empleados en la base de datos
    public void actualizarSueldo(Connection conexion) {
        try {
            //consulta para obtener todos los empleados
            String consulta = "SELECT NIF, nombre, apellido1, sueldo FROM empleados";

            //ejecutamos la consulta y obtenemos un resultado
            PreparedStatement ps = conexion.prepareStatement(consulta, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = ps.executeQuery();

            //recorremos el resultado y actualizamos sueldos
            while (rs.next()) {
                double sueldoActual = rs.getDouble("sueldo");
                double nuevoSueldo = sueldoActual * 1.05; //incremento del 5%

                //actualizamos el sueldo en el ResultSet y en la base de datos
                rs.updateDouble("sueldo", nuevoSueldo);
                rs.updateRow(); //guardamos el cambio en la base de datos

                //mostramos el nombre del empleado y su sueldo actualizado
                String nombre = rs.getString("nombre");
                System.out.println("Empleado: " + nombre + "\nSueldo actualizado: " + nuevoSueldo);

            }
            //cerramos recursos
            ps.close();
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    // Método para eliminar empleados de la base de datos
    public void eliminarEmpleado(Connection conexion, String condicion) {
        try {
            String consultaBase = "DELETE FROM empleados";
            String consultaCompleta = consultaBase + " WHERE " + condicion;

            Statement st = conexion.createStatement();
            int filasEliminadas = st.executeUpdate(consultaCompleta);
            System.out.println("Se han eliminado " + filasEliminadas + " filas correctamente de la tabla empleados");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
			 

}
