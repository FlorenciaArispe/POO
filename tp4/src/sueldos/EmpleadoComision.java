package sueldos;

public class EmpleadoComision extends Empleado {
	private int ventas;
	private int porcentaje;
	
	public EmpleadoComision(double sueldo, int ventas, int porcentaje) {
		super(sueldo);
		this.ventas= ventas;
		this.porcentaje = porcentaje;
	}
	
	@Override
	public double getSueldo() {
		return super.getSueldo() + (super.getSueldo() * this.porcentaje/100 * this.ventas);
	}

}
