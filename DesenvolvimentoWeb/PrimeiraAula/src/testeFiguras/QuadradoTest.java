package testeFiguras;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exLaboratorio.Quadrado;

class QuadradoTest {
	
	Quadrado quadrado;

	@BeforeEach
	void test_retang(){
	
	 quadrado = new Quadrado(2 , 2);
	
	}

	@Test
	void test_area_qdd() {
		double area = quadrado.area();
		assertTrue(area == 4);
	}
	
	@Test
	void test_area_qddx() {
		double area = quadrado.area();
		assertTrue(area != 4);
	}
	@Test
	void test_perimetro_qdd() {
		double perimetro = quadrado.perimetro();
		assertTrue(perimetro == 8);
	}
	
	@Test
	void test_perimetro_qddx() {
		double perimetro = quadrado.perimetro();
		assertTrue(perimetro != 8);
	}
	
	@AfterEach
	void esvazia_objetos() {
		quadrado = null;
	}

}
