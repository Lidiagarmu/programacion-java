package ud7_composicion_biblioteca;

import java.util.ArrayList;

import javax.sound.midi.VoiceStatus;

public class Usuario {
	
	private String nombre;
	private ArrayList<Libro> librosPrestadosAUsuario = new ArrayList<Libro>();
	
	//constructor
	
	public Usuario(String nombre) {
		this.nombre = nombre;
	}

	//getter and setter

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public ArrayList<Libro> getLibrosPrestadosAUsuario() {
		return librosPrestadosAUsuario;
	}


	public void setLibrosPrestadosAUsuario(ArrayList<Libro> librosPrestadosAUsuario) {
		this.librosPrestadosAUsuario = librosPrestadosAUsuario;
	}


	//metodos propios de la clase
	
	
	//METODO ASIGNAR LIBRO A USUARIO
	
	public void asignarLibro(Libro libroAPrestar) {
		//si no está prestado se puede asignar y cambiamos prestado a true
			if(!libroAPrestar.isPrestado() ) {
				libroAPrestar.prestarLibro();
				
				//añadimos el libro a la lista de libros
				librosPrestadosAUsuario.add(libroAPrestar);
				//añadimos la lista de libros actualizada al usuario
				setLibrosPrestadosAUsuario(librosPrestadosAUsuario);
				System.out.println("\nEl libro '" + libroAPrestar.getTitulo() +"' se ha prestado a " + this.getNombre() );
				
			} else {
				//el libro ya está prestado no se puede asignar a usuario
				System.out.println("\nEl libro '" + libroAPrestar.getTitulo() + "' no está disponible");
			}
	}
	
	
	//METODO DEVOLVER LIBRO
	
	public void devolverLibro(Libro libroAprestar) {
		//si no está prestado no se puede devolver
			if(!libroAprestar.isPrestado()) {
				System.out.println("\nEl libro '" + libroAprestar.getTitulo() + "' no ha sido prestado ");
				
		} else {
			//si prestado es true, se podria devolver pero antes se comprueba si el libro ha sido prestado al usuario que quiere devolerlo
			if(this.librosPrestadosAUsuario.contains(libroAprestar)) {
				//si esta prestado a este usuario, cambiamos el valor de prestado de nuevo a false para qye se pueda volver a prestar a otro usuario
				libroAprestar.devolverLibro();
				//eliminamos el libro de la lista de libros de dicho usuario
				librosPrestadosAUsuario.remove(libroAprestar);
				
			    System.out.println("\nEl libro '" + libroAprestar.getTitulo() + "' ha sido devuelto por " + this.getNombre());
			    
			} else {
				//el usuario no puede devolver un libro que no se le ha prestado
				  System.out.println("\n" + this.getNombre() + " no puede devolver el libro '" +  libroAprestar.getTitulo() + "'" );
				
			}
		}
	}
	
	
	//METODO LISTAR LIBROS DEL USUARIO
	
	public void listarLibrosUsuario() {
		
        System.out.println("\n" + this.nombre);
        
        	// se pinta un subrayado
	        for (int i = 0; i < this.nombre.length(); i++) {
	            System.out.print("-");
	        }
	        
		        if (this.librosPrestadosAUsuario.isEmpty()) {
		            System.out.println("\nNo tiene libros prestados");
		            
		        } else {
		        	// si tiene libros prestados, se muestran
		            //Se puede utilizar otro tipo de estructura	‘for’ 
		        	
						for (Libro libro : librosPrestadosAUsuario) {
					
							System.out.println(" \nTítulo: " + libro.getTitulo());
						            }
        }
    }
}


	


