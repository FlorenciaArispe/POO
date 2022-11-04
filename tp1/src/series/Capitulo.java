package series;

public class Capitulo {
	private String titulo;
	private String descripcion;
	private int calificacion;
	private boolean visto;
	
	public Capitulo(String titulo, String descripcion) {
		this.titulo=titulo;
		this.descripcion=descripcion;
		this.visto=false;
		this.calificacion=-1;
	}
	
	public boolean getSeVio() {
		return this.visto;
	}
	
	public void setSeVio(boolean visto) {
		this.visto=visto;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public boolean setCalificacion(int calificacion) {
		if((calificacion>=0)&&(calificacion<=5)) {
			this.calificacion = calificacion;
			this.setSeVio(true);
			return true;
		}
		else {
			return false;
		}		
	}
	
	public int getSevio() {
		if(getCalificacion()>=0) {
			return 1;
		}
		else {
			return 0;
		}			
	}
	
	
	
}

