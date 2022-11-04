package sistemaGastosPublicos;

import java.util.ArrayList;

public class Sistema {
	private ArrayList<Provincia> provincias;
	
	public Sistema() {
		this.provincias= new ArrayList<>();
	}
	
	public void addProvincia(Provincia p1) {
		if (!provincias.contains(p1)) {
			this.provincias.add(p1);
		}
	}
	
	public ArrayList<Provincia> provinciasEndeficit(){
		ArrayList<Provincia> provinciasEnDeficit= new ArrayList<>();
		for (Provincia p: this.provincias) {
			if(p.ciudadesEnDeficit().size() > (provincias.size()/2)) {
				provinciasEnDeficit.add(p);
			}
		}
		return provinciasEnDeficit;
	}
	
	public ArrayList<Ciudad> ciudadesEnDeficit(){
		ArrayList<Ciudad> ciudadesEnDeficit= new ArrayList<>();
		for(Provincia p: this.provincias) {
			ciudadesEnDeficit.addAll(p.ciudadesEnDeficit());
		}
		return ciudadesEnDeficit;
	}
	
	
	

}
