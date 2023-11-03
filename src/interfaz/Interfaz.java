package interfaz;
import dominio.*;
import java.util.*;

public class Interfaz {
	
	private static Scanner sc = new Scanner (System.in);
	
	public static boolean procesarPeticion(String peticion, Libreta l) {
		
		if (peticion==null) {
			
			System.out.println("Consulta ayuda.");
			return true;
			
		}
		
		String[]p =peticion.split(": ");
		
		if (p.length>2) {
			
			System.out.println("Petición erronea.");
			return true;
		}
		
		else if (p.length==1) {
			
			if (p[0].equals("Agregar contacto")) {
				
				addContacto(p[1], l);
			}
			
			if (p[0].equals("Ayuda")) {
				
				System.out.println("Introduzca las siguientes peticiones: "
				+ "\n Agregar contacto: (escribir nombre y numero de teléfono)"
				+ "\n Lista: (listar el contenido) "
				+ "\n Eliminar contacto: (elimina contacto)"
				+ "\n Salir: (escribe salir)");
			}
			
			else if (p[0].equals("Lista")) {
				
				System.out.println(l);
				
			}
			
			else if (p[0].equals("Eliminar contacto")) {
				
				removeContacto(l);
			}
			
			else if (p[0].equals("Salir")) {
				
				return false;
			}
			
			else {
				
				System.out.println("Petición erronea.");
				return true;
			}
		}
		
			if (p[0].equals("Agregar contacto")) {
			
				addContacto(p[1], l);
			}
			

		return true;
	}
	
	public static void addContacto(String nombreTelefono , Libreta l) {
		
		String[]j=nombreTelefono.split(" ");
		String nombre=j[0];
		int numeroDetelefono=Integer.parseInt(j[1]);
		Contacto contacto = new Contacto (nombre,numeroDetelefono);
		l.addContacto(contacto);
		
	}
	
	public static void removeContacto(Libreta l) {
		
		ArrayList<Contacto> contactos= l.getLista();
		for(int i=0; i<l.getLista().size(); i++) {
			
				System.out.println(i+":"+ contactos.get(i).getNombre() + " " + contactos.get(i).getNumeroDetelefono() );
			
		}
		
		System.out.println("Introduzca posición del contacto: ");
		int i = Integer.parseInt(sc.nextLine());
		l.removeContacto(i);
		
	}
	
	public static String leerPeticion() {
		
		System.out.print("?>");
		String cadena=sc.nextLine();
		return cadena;
		
	}

}
