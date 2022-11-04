package tp4;

public class Main {
	
	public static void main(String []args) {
		Alarma a1= new Alarma();
		
		AlarmaLuminosa luminosa= new AlarmaLuminosa();
		
		a1.comprobar();
		luminosa.comprobar();
		
		a1.setMovimiento();
		
		a1.comprobar();
		luminosa.comprobar();
		
		


	}

}
