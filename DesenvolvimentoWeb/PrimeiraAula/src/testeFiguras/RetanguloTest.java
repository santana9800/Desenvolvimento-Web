package testeFiguras;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exLaboratorio.Retangulo;

class RetanguloTest {
	
	Retangulo retangulo;
	
	@BeforeEach
	void test_retang(){
	
	 retangulo = new Retangulo(2 , 5);
	
	}

	@Test
	void test_area_ret() {
		double area = retangulo.area();
		assertTrue(area == 10);
	}
	
	@Test
	void test_area_retX() {
		double area = retangulo.area();
		assertTrue(area != 10);
	}
	@Test
	void test_perimetro_ret() {
		double perimetro = retangulo.perimetro();
		assertTrue(perimetro == 14);
	}
	
	@Test
	void test_perimetro_retx() {
		double perimetro = retangulo.perimetro();
		assertTrue(perimetro != 14);
	}
	
	@AfterEach
	void esvazia_objetos() {
		retangulo = null;
	}

}
