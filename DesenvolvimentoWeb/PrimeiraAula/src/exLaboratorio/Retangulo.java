package exLaboratorio;

public class Retangulo extends Poligono {
	
	
public Retangulo(double base, double altura) {
		
		super(base,altura);
		
	}

	@Override
	public double area() {
		return super.getBase() * getAltura();	
		}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return (super.getBase() * 2) + (getAltura() * 2);
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}


}
