package exLaboratorio;
import java.util.ArrayList;
public class Geometria {
	
	

			public static void main(String args[]) {

				Quadrado quadrado = new Quadrado(2, 2);
				
				
				
				Losango losango = new Losango(3, 3);
				
				
				
				Triangulo triangulo = new Triangulo(4, 4);
				Retangulo retangulo = new Retangulo(5, 5);
				Circulo circulo = new Circulo(6);
				
				Cilindro cilindro = new Cilindro(5, 2);
				Piramide piramide = new Piramide(5,6);
				Cubo cubo = new Cubo(7, 8);
				Esfera esfera = new Esfera( 10);

				ArrayList<Figura> lista = new ArrayList<>();

				lista.add(quadrado);
				lista.add(retangulo);
				lista.add(losango);
				lista.add(triangulo);
				lista.add(circulo);
				
				lista.add(cilindro);
				lista.add(piramide);
				lista.add(cubo);
				lista.add(esfera);
				
				
				
				for (Figura e : lista) {
					System.out.println("Area: " + e.area());

				

				}
				

				for (Figura e : lista) {
					System.out.println("Perimetro: " + e.perimetro());

				

				}
				
				
				for (Figura e : lista) {
					System.out.println("Volume: " + e.volume());

				

				}

			}

}
