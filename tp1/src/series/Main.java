package series;

public class Main {

	public static void main(String[] args) {
		
		Serie s = new Serie("ALF","Un extraterrestre llega a vivir con una familia en la tierra", "Willy", "Comedia");
		
		Temporada t1 = new Temporada(1);
		t1.addCapitulo(new Capitulo("S1E1","Alf llega a la tierra"));
		t1.addCapitulo(new Capitulo("S1E2","Alf corre"));
		t1.addCapitulo(new Capitulo("S1E3","Alf canta"));
		t1.addCapitulo(new Capitulo("S1E4","Alf baila"));
		t1.addCapitulo(new Capitulo("S1E5","Alf se va"));
		s.addTemporada(t1);
		Temporada t2 = new Temporada(2);
		t2.addCapitulo(new Capitulo("S2E1","Alf llega a la tierra"));
		t2.addCapitulo(new Capitulo("S2E2","Alf corre"));
		t2.addCapitulo(new Capitulo("S2E3","Alf canta"));
		t2.addCapitulo(new Capitulo("S2E4","Alf baila"));
		t2.addCapitulo(new Capitulo("S2E5","Alf se va"));
		s.addTemporada(t2);
		
		if (!s.setCalificacion(1,1,5)) {
			System.out.println("Tu calificacion es incorrecta");
		} else {
			System.out.println("Calificacion cargada correctamente");
		}
		
	}

}