package exLaboratorio;

public class Triangulo extends Poligono {
	
	
	

public Triangulo( double base, double altura) {
		
		super(base,altura);
		}


	@Override
	public double area() {
		return ( super.getBase() * getAltura()/ 2);	}
	
	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return super.getBase() * 3;
	}


	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
