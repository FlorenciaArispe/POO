package sistemaEncuesta;

import java.util.ArrayList;

public class Compania {
	private ArrayList<EncuestaRespondida> encuestasRespondidas;
	
	
	
	public Compania() {
		this.encuestasRespondidas= new ArrayList<>();

		
	}
	
	public void addEncuesta(EncuestaRespondida e1) {
		if(!encuestasRespondidas.contains(e1)) {
			encuestasRespondidas.add(e1);
		}
	}
	
	public int encuestasPorEmpleado(Empleado e1) {
		int contador=0;
		for (EncuestaRespondida e: this.encuestasRespondidas) {
			if(e.getEmpleado().equals(e1)) {
				contador++;
			}
		}
		return contador;
	}
	
}
