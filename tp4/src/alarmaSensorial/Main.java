package alarmaSensorial;

public class Main {
	
	public static void main (String [] args) {
		AlarmaSensorial alarmasensorial= new AlarmaSensorial();
		Sensor s1= new Sensor("habitacion");
		
		alarmasensorial.addSensor(s1);
		alarmasensorial.corroborarEstado();
	
		
		alarmasensorial.activarSensor(s1);
		
		alarmasensorial.corroborarEstado();
	}

}
