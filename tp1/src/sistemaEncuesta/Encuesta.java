package sistemaEncuesta;

import java.util.ArrayList;

public class Encuesta {
	private ArrayList<EncuestaRespondida> encuestasRespondidas;
	
	public Encuesta() {
		this.encuestasRespondidas= new ArrayList<>();
	}
	
	
	public boolean yaLaHizo(Empleado e1) {
		for(EncuestaRespondida e:this.encuestasRespondidas) {
			if(e.getEmpleado().equals(e1)) {
				return true;
			}
		}
		return false;
	}

}
