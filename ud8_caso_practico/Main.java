package ud8_caso_practico;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		
		
		//-------------------------CREAR CLASE MAIN (apartado 4 del caso práctico)-----------------------------------
		/*Crea una clase a que contenga un método main() y desde la cual se realicen instanciaciones de objetos de tipo
		 *  Coche, Empleado y Cliente y se llame a los métodos de las clases DAO.  */
		
		
		  try {
		            // Obtener una conexión usando el método getConnection de la clase ConexionBD
		            Connection conexion = ConexionBD.getConnection();
		            
	
		//---------------------------------- INSERTAR CLIENTES (apartado 5 del caso práctico)------------
		
        //1. Creamos instancias de ClienteDAO
        ClienteDAO cliente1 = new ClienteDAO();
        ClienteDAO cliente2 = new ClienteDAO();
        ClienteDAO cliente3 = new ClienteDAO();
        //2. Insertamos clientes llamando al método insertarCliente de la clase ClienteDAO con los valores del cliente que deseemos 
        cliente1.insertarCliente(conexion,"00000000A", "Laura", "Sanchez", "González", "Madrid", "675456777", "lauris@mail.com");
        cliente2.insertarCliente(conexion,"11111111B", "Juan", "Prats", "García", "Almería", "987654321", "juan@mail.com");
        cliente3.insertarCliente(conexion,"22222222C", "Sergio", "Vázquez", "Martín", "Valencia", "673321212", "sergio@mail.com");

       
    	
		//---------------------------------- INSERTAR EMPLEADOS (apartado 5 del caso práctico)------------
        
        //1. Creamos instancias de EmpleadoDAO
        EmpleadoDAO empleado1 = new EmpleadoDAO();
        EmpleadoDAO empleado2 = new EmpleadoDAO();
        EmpleadoDAO empleado3 = new EmpleadoDAO();
        //2. Insertamos empleadosllamando al método insertarEmpleado de la clase EmpleadoDAO con los valores del empleado que deseemos 
        empleado1.insertarEmpleado(conexion,"12345678G", "Maria", "Ferrán", "González", "Almería", "656349999", "maria@mail.com", 1500);
        empleado2.insertarEmpleado(conexion,"87654321H", "Lidia", "García", "García", "Asturias", "657833451", "lidia@mail.com", 2000);
        empleado3.insertarEmpleado(conexion,"44444444J", "Antonio", "López", "Jimenez", "Barcelona", "672227703", "tony@mail.com", 1800);
      
      
      
        //---------------------------------- INSERTAR COCHES (apartado 5 del caso práctico)------------
		
        //1. Creamos instancias de CocheDAO
        CocheDAO coche1 = new CocheDAO();
        CocheDAO coche2 = new CocheDAO();
        CocheDAO coche3 = new CocheDAO();
        //2. Insertamos coches llamando al método insertarCoche de la clase CocheDAO con los valores del cliente que deseemos 
        coche1.insertarCoche(conexion,"1111-MMM", "Opel", "nuevo", 15000, "rojo", 6000, "5 años", "Pepe Fernandez");
        coche2.insertarCoche(conexion,"2222-HHH", "Mercedes", "km0", 9000, "blanco", 70000, "1 años", "David Pérez");
        coche3.insertarCoche(conexion,"3333-BBB", "Renault", "segunda mano", 3000, "negro", 170000, "6 meses", "Iván Fernandez");
        
        
        //----------------------------------- CONSULTAS (apartado 6 del caso práctico)----------------------------
        
        //-----------------------------------APARTADO 6.1 : Obtén los empleados de Almería.
        System.out.println("----------- CONSULTA EMPLEADOS DE ALMERÍA --------");
        EmpleadoDAO consultaEmpleadosAlmeria = new EmpleadoDAO();
        consultaEmpleadosAlmeria.consultarEmpleados(conexion,"SELECT * FROM empleados WHERE direccion = 'Almeria'", "NIF","nombre", "apellido1", 
        		"apellido2", "direccion","telefono","mail","sueldo");
    
        
        //-----------------------------------APARTADO 6.2 : Obtén el modelo de un coche dada una matrícula XXXXX.
        //-----------------------------------EXTRA --> nos devolverá también el precio gracias al metodo getInt()
        System.out.println("----------- CONSULTA COCHE ----------------");
        CocheDAO consultaCoche = new CocheDAO();
        consultaCoche.consultarCoche(conexion);


        //-----------------------------------APARTADO 6.3 : Selecciona todos los empleados y su sueldo. 
        System.out.println("----------- CONSULTA EMPLEADOS Y SUELDO: ------------");
        EmpleadoDAO consultaEmpleadosySueldo = new EmpleadoDAO();
        consultaEmpleadosySueldo.consultarEmpleados(conexion,"SELECT * FROM empleados", "nombre", "apellido1", "apellido2", "sueldo");
        
        //----------------------------------- ACTUALIZACIÓN SUELDOS EMPLEADOS (apartado 7 del caso práctico)------------------
        
        /*Debido al nuevo año, debes actualizar el sueldo de los empleados un 5%, para ello crea un Statement en el que se 
         * permita el movimiento en cualquier dirección, y en el que las actualizaciones se reflejen en cuanto se produzcan; 
         * además, el resultado debe ser actualizable(prepareStatement). Recorre el ResultSet obtenido mostrando el nombre
			del empleado y el sueldo actualizado. */
        
        System.out.println("AUMENTAR SUELDOS EMPLEADOS UN 5%");
        EmpleadoDAO actualizarSueldos = new EmpleadoDAO();
        actualizarSueldos.actualizarSueldo(conexion);
        System.out.println("----------------");
        
        
        //------------------------EXTRA TAREA----------------------------------------
        
        
        //-------------USANDO MÉTODOS ACTUALIZAR-------------------
        
        System.out.println("USANDO MÉTODO ACTUALIZAR EN COCHE Y CLIENTE");
        CocheDAO actualizarCoche = new CocheDAO();
        actualizarCoche.actualizarCoche(conexion,"precio = 2500 WHERE modelo = 'Renault'");
        System.out.println("----------------");
         
        ClienteDAO actualizarCliente = new ClienteDAO();
        actualizarCliente.actualizarCliente(conexion,"direccion = 'Zaragoza' WHERE  NIF = '00000000A'");
        System.out.println("----------------");
        
        
        //-------------USANDO MÉTODOS ELIMINAR-------------------
        
        System.out.println("ELIMINANDO REGISTROS");
        CocheDAO eliminarCoche = new CocheDAO();
        eliminarCoche.eliminarCoche(conexion,"modelo = 'Mercedes'");
        
        EmpleadoDAO eliminarEmpleado = new EmpleadoDAO();
        eliminarEmpleado.eliminarEmpleado(conexion,"nombre = 'Maria'");
        
        ClienteDAO eliminarCliente = new ClienteDAO();
        eliminarCliente.eliminarCliente(conexion,"nombre = 'Laura'");
		 
		  
		  } catch (SQLException e) {
	            // Manejar cualquier excepción relacionada con la conexión a la base de datos
	        	 System.out.println("Error al establecer la conexión con la base de datos.");
	            e.printStackTrace();
	            return; // Terminar el programa
	        }

	   
}

}
