package exLaboratorio;

public abstract class Poligono extends Figura {
	
		
		//atributos
		private double base;
		private double altura;
		
		//construtores
		public Poligono(double base, double altura) {
			this.base = base;
			this.altura = altura;
		}
		 
		public Poligono() {}
		
		//metodos de acesso
		public double getBase() {
			return base;
		}
		public double getAltura() {
			return altura;
		}
		
		//metodos de modificadores
		
		public void setBase(double base) {
			this.base = base;
		}
		public void setAltura(double altura) {
			this.altura = altura;
		}
		
		//coloca-se aqui p/ sobreescrevê-lo nas classes
		public double Area() {
			return 0;
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
