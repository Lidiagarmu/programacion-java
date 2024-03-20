package ud6_1_arrays_y_stringclass;

import java.util.Scanner;

public class EjercicioPropuesto1 {

	public static void main(String[] args) {
		
		/* Escribe un programa en Java que solicite al usuario ingresar un correo electrónico por consola y verifique
		 * si el correo electrónico es válido. Para considerarse válido, el correo electrónico debe cumplir
		 * con los siguientes requisitos:
		 * 
		 * 1.Debe contener una @
		 * 2.Debe terminar en ".es" o ".com"
		 * 3.La longitud del correo electrónico debe ser de al menos 15 caracteres*/
		
		Scanner sc = new Scanner(System.in);
		String correo;
		
		
		
		//con do-while repetirá la peticion al usuario de ingresar correo mientras validaciónCorreo() sea false 
		do {
			System.out.println("Ingrese su correo electrónico que contenga al menos 15 caracteres, @ y .es o .com");
			correo = sc.nextLine();
		} while (!validacionCorreo(correo)) ;
			

		
	System.out.println("Gracias has ingresado una cuenta de correo válida"); 
			
}

	public static boolean validacionCorreo(String correo) {
		
		boolean contieneArroba = false;
		boolean contieneEsCom = false;
		boolean contiene15 = false;
		
		
		 	int arrobaUnico = correo.indexOf('@');
	        int esFin = correo.lastIndexOf(".es");
	        int comFin = correo.lastIndexOf(".com");
	        
	 
	
	        /*	if (correo.contains("@")) {
				contieneArroba = true;
			}  else
				
				System.out.println("Su correo no contiene una única arroba"); */
	        
	        
	        	
	        /* arrobaIndex != -1: Esto verifica si se encontró al menos una '@' en el correo electrónico.
	          Si indexOf('@') devuelve -1, significa que no se encontró ninguna '@'. Entonces, arrobaIndex != -1 
	         asegura que se haya encontrado al menos una '@'.

			arrobaIndex == correo.lastIndexOf('@'): Esto compara la posición de la primera aparición de '@' con 
			la posición de la última aparición. Si estas posiciones son las mismas, significa que solo hay una aparición 
			de '@' en el correo electrónico. Esto se hace para evitar que el usuario ingrese múltiples '@' en el correo
		 electrónico.
	         * */
				
	        
	        if (arrobaUnico != -1 && arrobaUnico == correo.lastIndexOf('@')) {
	            contieneArroba = true;
	        } else
	            System.out.println("Su correo no contiene una única arroba");
	        
	        
				
				/*if (correo.endsWith(".es") || correo.endsWith(".com")) {
				contieneEsCom = true;
			} else
				
				System.out.println("La dirección de correo debe acabar en .com o .es"); */
	        
	        
	        
	        if ((esFin != -1 && esFin == correo.lastIndexOf(".es") && !correo.endsWith(".es.es")) || 
	        		(comFin != -1 && comFin== correo.lastIndexOf(".com")&& !correo.endsWith(".com.com"))) {
	                contieneEsCom = true;
	            } else
	                System.out.println("La dirección de correo debe acabar en .com o .es");
				
				
				
			 
				if (correo.length() >= 15) {
				contiene15 = true;
			}else
				
				System.out.println("El correo debe tener una longitud mayor o igual a 15 carácteres");
					
			
			
		
		if (contieneArroba && contieneEsCom && contiene15) {
			return true;
			} else {
				return false;
			}
		
		}
}