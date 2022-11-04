package sueldos;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<Empleado> empleados;
	
	public Empresa() {
		this.empleados= new ArrayList<>();
	}
	
	public void addEmpleado(Empleado e) {
		if(!empleados.contains(e)) {
			this.empleados.add(e);
		}
	}
	
	public double getSueldo(Empleado e1) {
		return e1.getSueldo();
	}

}
