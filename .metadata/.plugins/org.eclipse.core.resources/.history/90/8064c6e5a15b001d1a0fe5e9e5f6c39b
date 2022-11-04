package sueldos;

public class Main {
	
	public static void main (String [] args) {
		Empresa empresa= new Empresa();
		
		Empleado e1= new Empleado(400);
		Empleado e2= new EmpleadoHextra(400,100,3);
		Empleado e3= new EmpleadoComision(400, 5, 1);
		
		empresa.addEmpleado(e2);
		empresa.addEmpleado(e1);
		empresa.addEmpleado(e3);
		
		System.out.println(empresa.getSueldo(e3));
	}

}
