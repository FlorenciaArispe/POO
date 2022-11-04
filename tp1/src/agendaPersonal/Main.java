package agendaPersonal;

import java.time.LocalTime;

public class Main {
	public static void main(String[] args) {
		Participante p1 = new Participante ("Juan",444444, "juan@gmail.com");
		Participante p2 = new Participante ("Florencia", 2222, "Florenciaarispe98@gmail.com");
		Participante p3 = new Participante ("Pedro",3333, "pepe@gmail.com");
		
		Reunion reunion1 = new Reunion ("Estudiar Prog", "Casa Flor", LocalTime.of(16, 00),LocalTime.of(17,00));
		Reunion reunion2 = new Reunion ("Estudiar Web", "Casa Flor", LocalTime.of(18, 30), LocalTime.of(19, 30));
		Reunion reunion3 = new Reunion ("Estudiar tio", "Casa Flor", LocalTime.of(21,00), LocalTime.of(23, 00));
		
		Agenda agenda = new Agenda ();
		

		reunion1.addParticipante(p1);
		reunion1.addParticipante(p2);
		reunion1.addParticipante(p3);
		
		reunion2.addParticipante(p1);
		reunion2.addParticipante(p2);
		reunion2.addParticipante(p3);
		
		
		reunion3.addParticipante(p2);
		reunion3.addParticipante(p3);
		
		
		agenda.addReunion(reunion1);
		agenda.addReunion(reunion2);
		agenda.addReunion(reunion3);
		
		System.out.println(agenda.cantidadDeReuniones());
		System.out.println(p1);
		System.out.println(reunion1);
		System.out.println(reunion3);
	}
}
