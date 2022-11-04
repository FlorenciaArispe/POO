package agendaPersonal;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<Reunion> reuniones;
	private ArrayList<Participante> participantes;
	
	public Agenda () {
		this.reuniones= new ArrayList<>();
		this.participantes= new ArrayList<>();
	}
	
	public void addReunion(Reunion r1) {
		boolean hayConflicto=false;
		if(this.reuniones.isEmpty()) {
			reuniones.add(r1);
		}
		else {
			for (Reunion r: this.reuniones) {
				if (r.tengoConflicto(r1)==true) {
					hayConflicto=true;
				}
			}
			if (!hayConflicto) {
				this.reuniones.add(r1);
			}
		}
		
	}
	
	public int cantidadDeReuniones() {
		return this.reuniones.size();
	}
	
	public void addParticipante(Participante p) {
		this.participantes.add(p);
	}
	

	

}
