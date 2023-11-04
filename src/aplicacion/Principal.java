package aplicacion;
import interfaz.Interfaz;
import dominio.*;

public class Principal {

	public static void main(String[] args) {
		
		String p;
		Libreta libreta=new Libreta();
		Boolean seguir;
		do {
			p=Interfaz.leerPeticion();
			seguir=Interfaz.procesarPeticion(p, libreta);
			Interfaz.crearHojaCalculo(libreta);
		}
		while(seguir);

	}

}
