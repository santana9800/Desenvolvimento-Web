package exLaboratorio;

public class Piramide extends Poligono {
	Piramide(double base, double altura){
		super(base, altura);
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
		return  (0.33 * super.getBase() * getAltura());
	}

}
