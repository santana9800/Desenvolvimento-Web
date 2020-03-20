package testeFiguras;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exLaboratorio.Circulo;

class CirculoTest {

	Circulo circulo;
	
	@BeforeEach
	void test_instancia(){
	
	 circulo = new Circulo(6);
	
	}
	
	@Test
	void test_circulo() {
		double area = circulo.area();
		assertEquals(113.09733552923255, area, 0.001);
	}
	
	@Test
	void test_circuloX() {
		double area = circulo.area();
		assertEquals(112.09733552923255, area, 0.001);
	}
	
	@Test
	void test_circuloY() {
		double perimetro = circulo.perimetro();
		assertEquals(37.699, perimetro, 0.001);
	}
	
	@Test
	void test_circuloZ() {
		double perimetro = circulo.perimetro();
		assertEquals(1, perimetro, 0.001);
	}
	
	
	
	
	

}
