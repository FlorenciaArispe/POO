package ElementosGeometricos;

public class ElementoGeometrico {
	double x;
	double y;
	
	public ElementoGeometrico() {
		this.x=0;
		this.y=0;
	}
		
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public void desplazarPunto(double x, double y) {
		this.x=x;
		this.y=y;
	}
	
	public double calcularDistanciaE(double x, double y) {
		return (Math.sqrt((Math.sqrt(this.x- x))+ (Math.sqrt(this.y-y))));
		
	}

}
