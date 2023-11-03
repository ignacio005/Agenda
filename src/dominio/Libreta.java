package dominio;
import java.util.ArrayList;

public class Libreta {
	
	private ArrayList <Contacto> lista= new ArrayList <Contacto> ();
	
	public void addContacto (Contacto c) {
		
		lista.add(c);
	}
	
	@Override
	
	public String toString() {
		
		return "El contenido de la libreta es : " + lista;
	}

}
