package exLaboratorio;

public class Cubo extends Poligono {

	
public Cubo(double base, double altura) {
		
		super(base,altura);
		
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return Math.pow(super.getBase() , 3) ;
	}

}
