package tp4;

public class Alarma {
	private boolean vidrioRoto;
	private boolean puerVenAbierta;
	private boolean movimiento;
	
	public Alarma() {
		this.vidrioRoto=false;
		this.puerVenAbierta=false;
		this.movimiento=false;
	}
	
	
	public void setVidrioRoto() {
		this.vidrioRoto = true;
	}


	public void setPuerVenAbierta() {
		this.puerVenAbierta = true;
	}


	public void setMovimiento() {
		this.movimiento = true;
	}

	public void comprobar() {
		if(this.movimiento|| this.puerVenAbierta || this.vidrioRoto) {
			this.hacerSonar();
		}
		else {
			System.out.println("Todo en orden");
		}
	}
	
	public void hacerSonar() {
		System.out.println("UOUOUOUOUOUOUOUOUOUOUOUOU");
	}

}
