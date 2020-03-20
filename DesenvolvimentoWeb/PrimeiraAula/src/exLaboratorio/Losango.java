package exLaboratorio;

public class Losango extends Poligono {
	
	
public Losango(double base, double altura) {
		
		super(base,altura);
		
	}
	
	
	@Override
	public double area() {
		return super.getBase() * getAltura();
		}


	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return  super.getBase() * 4 ;
	}


	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}



}
