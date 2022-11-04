package escuelaHogwarts;

public class CasaEnemiga extends Casa{
	public CasaEnemiga(int cantidad) {
		super(cantidad);
	}
	
	@Override
	public boolean alumnoApto(Alumno a1) {
		if (super.alumnoApto(a1))
			return false;
		return true;
	}
}
