package dominio;

public class Contacto {

	private String nombre;
	private int numeroDetelefono;
	
	public String getNombre() {
		
		return nombre;
	}
	
	public int getNumeroDetelefono() {
		return numeroDetelefono;
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}
	
	public void setNumeroDetelefono(int numeroDetelefono) {
		
		this.numeroDetelefono = numeroDetelefono;
	}
	
	public Contacto(String nombre, int numeroDetelefono) {
		
		this.nombre=nombre;
		this.numeroDetelefono=numeroDetelefono;
	}
		
	@Override
	
	public String toString() {
		
		return "El nombre es " + nombre + " y su número de teléfono es " + numeroDetelefono;
	}
	
}
