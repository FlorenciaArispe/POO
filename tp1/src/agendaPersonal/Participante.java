package agendaPersonal;

public class Participante {
	private String nombre;
	private int telefono;
	private String email;
	
	public Participante(String nombre, int telefono, String email) {
		this.nombre=nombre;
		this.telefono=telefono;
		this.email=email;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + "- Telefono: " + telefono + "- Email: " + email;
	}
	
	

}