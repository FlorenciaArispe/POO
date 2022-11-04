package sistemaEncuesta;

public class EncuestaRespondida{
	private String preguntas;
	private Empleado empleado;
	private Persona persona;
	
	public EncuestaRespondida(String preguntas, Empleado e1, Persona p1) {
		
		this.preguntas=preguntas;
		this.empleado= e1;
		this.persona=p1;		
	}


	public String getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(String preguntas) {
		this.preguntas = preguntas;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	
	
	

}