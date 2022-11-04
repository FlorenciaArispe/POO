package sueldos;

public class EmpleadoHextra extends Empleado{
	private int horasExtras;
	private double valorextra;
	
	public EmpleadoHextra(double sueldo, int horasExtras, double valorExtra) {
		super(sueldo);
		this.horasExtras=horasExtras;
		this.valorextra=valorExtra;
	}
	
	@Override
	public double getSueldo() {
		return super.getSueldo() + valorextra*horasExtras;
	}
}
