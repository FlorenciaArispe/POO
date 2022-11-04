package escuelaHogwarts;

import java.util.ArrayList;

public class Alumno {
	private String nombre;
	private ArrayList<String> cualidades;
	private ArrayList <Alumno> familiares;
	
	public Alumno(String nombre) {
		this.nombre=nombre;
		this.cualidades= new ArrayList<>();
		this.familiares= new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}
	
	public void addCualidad(String cualidad) {
		if (!cualidad.contains(cualidad))
			cualidades.add(cualidad);
	}
	
	public void addFamiliar(Alumno a) {
		if (!familiares.contains(a))
			familiares.add(a);
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<String> getCualidades(){
		ArrayList<String> copia= new ArrayList<>();
		copia= cualidades;
		return copia;
	}
	
	public ArrayList<Alumno> getFamiliares(){
		ArrayList<Alumno> copia= new ArrayList<>();
		copia= familiares;
		return copia;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre;
	}
	

}
