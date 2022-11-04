package ElementosGeometricos;

public class Rectangulo {
	ElementoGeometrico lado1;
	ElementoGeometrico lado2;
	
	public Rectangulo(ElementoGeometrico lado1, ElementoGeometrico lado2) {
		this.lado1=lado1;
		this.lado2= lado2;
	}
	
	
	
	
	public ElementoGeometrico getLado1() {
		return lado1;
	}




	public void setLado1(ElementoGeometrico lado1) {
		if((lado1.getX()>=0)&&(lado1.getY()>=0)) {
			this.lado1 = lado1;			
		}
			
	}




	public ElementoGeometrico getLado2() {
		return lado2;
	}




	public void setLado2(ElementoGeometrico lado2) {
		if((lado2.getX()>=0)&&(lado2.getY()>=0)) {
			this.lado2 = lado2;			
		}
	}




	public void desplazarRectangulo(double x, double y) {
		this.lado1.setX(x);
		this.lado1.setY(y);
		this.lado2.setX(x);
		this.lado2.setY(y);
	}
	
	

}
