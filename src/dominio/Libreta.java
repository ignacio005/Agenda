package dominio;
import java.util.ArrayList;

public class Libreta {
	
	private ArrayList <Contacto> lista= new ArrayList <Contacto> ();
	
	public ArrayList <Contacto> getLista() {
		
		return lista;
	}
	
	public void addContacto (Contacto c) {
		
		lista.add(c);
	}
	
	public void removeContacto (int posicion) {
		
		lista.remove(posicion);
		
	}
	
	@Override
	
	public String toString() {
		
		return "El contenido de la libreta es : " + lista;
	}

}
