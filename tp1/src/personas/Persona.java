package personas;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	private String nombre;
	private LocalDate nacimiento;
	private int dni;
	private String sexo;
	private double altura;
	private double peso;
	
	public static final double MINIMC= 18.5;
	public static final double MAXIMC=25;
	
	public Persona(int dni) {
		this("NN",  LocalDate.of(2000,1,1), dni, "Femenino", 1, 1);
	}
	
	 public Persona(String nombre, LocalDate localDate ,int dni ,String sexo , double altura,double peso) {
		 this.nombre= nombre;
		 this.nacimiento= localDate;
		 this.dni=dni;
		 this.sexo=sexo;
		 this.altura=altura;
		 this.peso=peso;		 
	 }
	 
	 public int getDni() {
		 return this.dni;
	 }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(LocalDate nacimiento) {
		this.nacimiento = nacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public boolean cumpleAños() {
		LocalDate actual= LocalDate.now();
		if ((this.nacimiento.getMonth()==actual.getMonth())&&(this.nacimiento.getDayOfMonth()==actual.getDayOfMonth())){
			return true;
		}
		return false;
	}
	
	public double calcularMasaCorporal() {
		return this.peso/ Math.pow(this.altura,2);
	}
	
	public boolean estaEnforma() {
		double masaCorporal= calcularMasaCorporal();
		return ((masaCorporal>MINIMC)&& (masaCorporal<MAXIMC));
	}
	
	public int getEdad() {
		LocalDate actual= LocalDate.now();
		Period periodo= Period.between ( nacimiento, actual);
		return periodo.getYears();		
	}
	
	public boolean mayorEdad() {
		return (this.getEdad()>= 18);
	}
	
	public boolean puedeVotar() {
		return (this.getEdad()>=16);
	}
	
	public String toString() {
		return ("Nombre: " + nombre + "- Edad: " + getEdad() + "- Genero: " + sexo);
	}
}
