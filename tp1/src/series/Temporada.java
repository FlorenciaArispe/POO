package series;

import java.util.ArrayList;

public class Temporada {
	private int numTemp;
	private ArrayList<Capitulo> capitulos;
	
	public Temporada(int numero) {
		this.numTemp=numero;
		capitulos= new ArrayList<>();
	}
	

	public int getnumTemp() {
		return this.numTemp;
	}
	
	public void addCapitulo(Capitulo c) {
		capitulos.add(c);
	}
	
	public int capitulosVistosTemp() {
		int contador=0;
		for(int i=0; i<= capitulos.size();i++) {
			contador+=(capitulos.get(i)).getSevio();
		}
		return contador;
	}
	
	public double promedioCalificacionTemp() {
		int contador=0;
		for(int i=0; i<=capitulos.size();i++) {
			contador+=(capitulos.get(i)).getCalificacion();
		}
		return contador/capitulos.size();
	}
	
	public boolean seVieronTodos() {
		return (capitulosVistosTemp()==capitulos.size());
	}

	public Capitulo getCapitulo(int i) {
		return capitulos.get(i);
	}
	

}
