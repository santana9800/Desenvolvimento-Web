package testeFiguras;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exLaboratorio.Losango;

public class LosangoTest {
	
	
	
	
Losango losango;
	
	@BeforeEach
	void test_losan(){
	
	 losango = new Losango(4 , 5);
	
	}

	@Test
	void test_area_los() {
		double area = losango.area();
		assertTrue(area == 20);
	}
	
	@Test
	void test_area_losX() {
		double area = losango.area();
		assertTrue(area != 20);
	}
	@Test
	void test_perimetro_los() {
		double perimetro = losango.perimetro();
		assertTrue(perimetro == 16);
	}
	
	@Test
	void test_perimetro_losx() {
		double perimetro = losango.perimetro();
		assertTrue(perimetro != 16);
	}
	
	@AfterEach
	void esvazia_objetos() {
		losango = null;
	}

}
