package ud4_caso_practico;

import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		
		// Instanciando objetos usando el constructor con parámetros
	
		Administrativo adm1 = new Administrativo("Pepe", 25, 1300, 3, 1582);
		Contable cont1 = new Contable("Laura", 35, 1700, 6, -75000);
		Informatico inf1 = new Informatico("Lidia", 30, 2000, 5, 4);
		
		
		
		// Vamos a llamar a sus métodos plus y ver cómo funciona con cada clase según los parámetros dados
		
		
		adm1.plus();
		cont1.plus();
		inf1.plus();
		
		// No sería necesario escribir la sentencia "System.out.println(inf1);" puesto que los propios métodos plus() llevan incorporado que imprima en consola
		// dados estos objetos y llamando a sus respectivos métodos plus(), vemos que sólo a uno de ellos, no se le ha sumado el plus de 500 al no cumplir con la condición dada en su método (balanceAnual > 0)
		
		
		//---------------------------
		
		// Podemos también agregar skills desde fuera de la clase informático. Por ello hicimos accesible ese método al declarlo public. Además, este método nos muestra las skills de dicho empleado que tiene agregados hasta el momento
		// Algo que hubiera sido también lógico, sería haber creado el método addSkill con un modo de acceso private para sólo ser modificado desde la misma clase y que nadie más pueda hacerlo 
		
		inf1.addSkill("Java"); // imprime habilidades: [Java]
		inf1.addSkill("SQL"); // imprime habilidades: [Java, SQL]
		
		
		
		// Usando toString() para imprimir toda la info del toString de la clase padre añadiendo la info especifica para cada clase
		adm1.toString(); // imprime nombre= Pepe, edad= 25, salario= 1800.0, experiencia= 3, horas trabajadas= 1582
		
		
		// Instanciamos objetos usando el constructor por defecto sin parámetros. 
		// Después usamos el método setter para añadir valores a los atributos del objeto creado
		// Por último mediante elmétodo toString() podremos ver en consola los datos agregados
		
		Administrativo adm2 = new Administrativo();
		adm2.setNombre("Ana");
		adm2.setEdad(50);
		
		
		adm2.toString(); // imprime nombre= Ana, edad= 50, salario= 0.0, experiencia= 0, horas trabajadas= 0. Los demás atributos no inicializados los pone por defecto
		
		
		Contable cont2 = new Contable();
		cont2.setExperiencia(10);
		cont2.setSalario(2200);
		cont2.setNombre("Francisco");
		
		cont2.toString(); // imprime nombre= Francisco, edad= 0, salario= 2200.0, experiencia= 10, balance anual= 0.0
		
		
		Informatico inf2 = new Informatico();
		inf2.setEdad(21);
		inf2.setExperiencia(1);
		inf2.setNombre("Elena");
		inf2.setProyectosFinalizados(1);
		inf2.setSalario(1550);
		
		inf2.toString(); // imprime nombre= Elena, edad= 21, salario= 1550.0, experiencia= 1,  proyectos finalizados= 1
		
		
		
		}

}



