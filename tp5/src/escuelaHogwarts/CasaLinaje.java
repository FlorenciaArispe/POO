package escuelaHogwarts;

public class CasaLinaje extends Casa {
	
	public CasaLinaje(int cantidad) {
		super(cantidad);
	}
	
	@Override
	public boolean alumnoApto(Alumno a1) {
		for (Alumno a: this.getAlumnos()) {
			if ((a.getFamiliares().contains(a))&&(super.alumnoApto(a1)))
				return true;
		}
		return false;
	}
}
