package escuelaHogwarts;

public class Main {
	
	public static void main (String [] args) {
		
		Escuela escuelaHogwarts= new Escuela();
		
		Casa casa = new Casa(2);
		Casa casaLinaje= new CasaLinaje(3);
		Casa casaEnemiga= new CasaEnemiga(2);
		
		escuelaHogwarts.addCasa(casaEnemiga);
		escuelaHogwarts.addCasa(casa);
		escuelaHogwarts.addCasa(casaLinaje);
		
		Alumno a1= new Alumno("Florencia");
		Alumno a2= new Alumno ("Delfina");
		
		casa.addAlumno(a1);
		casa.addAlumno(a2);
		
		System.out.println(a1);
		
		
	}

}
