package exLaboratorio;

public class Cilindro extends Circulo {

	 double h;

	public Cilindro(double r, double h) {
		super(r);
		
		this.h = h;
		// TODO Auto-generated constructor stub
	}
	
	//modificadores
	
		public void setH(double h) {
			this.h = h;

		}
		
		//acesso
		
		public double getH() {
			return h;
		}
	
	@Override
	public double area() {

		
		return  0;
		
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double volume() {
		
		// TODO Auto-generated method stub
		return  Math.PI * Math.pow(r , 2) * h;
	}

}
