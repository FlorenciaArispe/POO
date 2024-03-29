package sistemaGastosPublicos;

public class Ciudad {
	private double imp1;
	private double imp2;
	private double imp3;
	private double imp4;
	private double imp5;
	private double gastos;
	private int tamanio;
	
	public Ciudad( double gastos, int tamanio, double imp1, double imp2, double imp3, double imp4, double imp5) {
		
		this.gastos=gastos;
		this.tamanio=tamanio;
		this.imp1=imp1;
		this.imp2=imp2;
		this.imp3=imp3;
		this.imp4=imp4;
		this.imp5=imp5;
	}
	
	public double getRecaudos() {
		return (imp1 + imp2 + imp3 + imp4 + imp5);
	}

	

	public double getImp1() {
		return imp1;
	}



	public void setImp1(double imp1) {
		this.imp1 = imp1;
	}



	public double getImp2() {
		return imp2;
	}



	public void setImp2(double imp2) {
		this.imp2 = imp2;
	}



	public double getImp3() {
		return imp3;
	}



	public void setImp3(double imp3) {
		this.imp3 = imp3;
	}



	public double getImp4() {
		return imp4;
	}



	public void setImp4(double imp4) {
		this.imp4 = imp4;
	}



	public double getImp5() {
		return imp5;
	}



	public void setImp5(double imp5) {
		this.imp5 = imp5;
	}



	public double getGastos() {
		return gastos;
	}

	public void setGastos(double gastos) {
		this.gastos = gastos;
	}

	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}
	
	public boolean enDeficit(Ciudad c1) {
		if (c1.getGastos()> c1.getRecaudos()) 
			return true;
		else
			return false;
	}

}
