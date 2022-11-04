package tp4;

public class AlarmaLuminosa extends Alarma{
	public AlarmaLuminosa() {
		super();
	}
	
	public void hacerSonar() {
		super.hacerSonar();
		System.out.println("Se encendio la luz");
	}

}
