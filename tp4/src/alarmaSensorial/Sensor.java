package alarmaSensorial;

public class Sensor {
	private String zonaControlada;
	private boolean estado;
	
	public Sensor(String zona) {
		this.zonaControlada=zona;
		this.estado= false;
	}

	public String getZonaControlada() {
		return zonaControlada;
	}

	public void setZonaControlada(String zonaControlada) {
		this.zonaControlada = zonaControlada;
	}

	public boolean getEstado() {
		return this.estado;
	}

	public void activar() {
		estado=true;
	}
	

	
	
}
