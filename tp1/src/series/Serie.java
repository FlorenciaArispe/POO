package series;

import java.util.ArrayList;

public class Serie {
	private String titulo;
	private String descripcion;
	private String creador;
	private String genero;
	private ArrayList<Temporada> temporadas;
	
	public Serie(String titulo, String descripcion, String creador, String genero) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.creador = creador;
		this.genero = genero;
		this.temporadas= new ArrayList<>();
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

	public String getCreador() {
		return creador;
	}
	
	
	public void setCreador(String creador) {
		this.creador = creador;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void addTemporada (Temporada t) {
		temporadas.add(t);
	}
	
	public int capitulosVistosSerie() {
		int capitulosVistos=0;
		for(int i=0; i<=temporadas.size();i++) {
			capitulosVistos+= (temporadas.get(i)).capitulosVistosTemp();
		}
		return capitulosVistos;
	}
	
	public double promedioCalificacionesSerie() {
		int contador=0;
		int cantidad=0;
		for (int i=0; i<= this.temporadas.size();i++) {
			Temporada t= (Temporada)this.temporadas.get(i);
			contador+=t.promedioCalificacionTemp();
			cantidad++;
		}
		return contador/cantidad;
	}
	
	public boolean seVieronTodos() {
		int i=0;
		while(((temporadas.get(i)).seVieronTodos()==true) && (i<=temporadas.size())){
			i++;
		}
		return (i==temporadas.size());
	}
	
	public boolean setCalificacion(int t, int e, int c){
		return ((Capitulo)(((Temporada)this.temporadas.get(t)).getCapitulo(e))).setCalificacion(c);
	}

}
