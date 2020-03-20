package testeFiguras;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exLaboratorio.Triangulo;

public class TrianguloTest {

	
	Triangulo triangulo;
	
	@BeforeEach
	void test_triang(){
	
	 triangulo = new Triangulo(2 , 5);
	
	}

	@Test
	void test_area_tri() {
		double area = triangulo.area();
		assertTrue(area == 5);
	}
	
	@Test
	void test_area_triX() {
		double area = triangulo.area();
		assertTrue(area != 5);
	}
	@Test
	void test_perimetro_tri() {
		double perimetro = triangulo.perimetro();
		assertTrue(perimetro == 6);
	}
	
	@Test
	void test_perimetro_trix() {
		double perimetro = triangulo.perimetro();
		assertTrue(perimetro != 6);
	}
	
	@AfterEach
	void esvazia_objetos() {
		triangulo = null;
	}
}
