package exLaboratorio;

public class Circulo extends Figura {
	
	double r ;
	
public Circulo(double r) {
		
		
		
		this.r = r;
		
	}
	
	//modificadores
	
	public void setR(double r) {
		this.r = r;

	}
	
	//acesso
	
	public double getR() {
		return r;
	}

	@Override
	public double area() {

		
		return  Math.PI * Math.pow(r , 2) ;
		
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return  2 * Math.PI * r;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}

}
