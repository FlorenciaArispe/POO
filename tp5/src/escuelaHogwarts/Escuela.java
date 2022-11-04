package escuelaHogwarts;

import java.util.ArrayList;

public class Escuela {
	private ArrayList<Casa> casas;
	
	public Escuela() {
		this.casas= new ArrayList<>();
	}
	
	public void addCasa(Casa c) {
		if (!casas.contains(c))
			casas.add(c);
	}
	


}
