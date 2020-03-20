package exLaboratorio;

public class Esfera extends Circulo {

	public Esfera(double r) {
		super(r);
		// TODO Auto-generated constructor stub
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
		 return ((4/3) *Math.PI * Math.pow(r , 3));
	}

}
