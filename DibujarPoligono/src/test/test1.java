package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import base.FiguraGeometrica;
import base.Poligono;

class test1 {

	@Test
	void testHexagono() {
		Poligono p = new Poligono("hexagono");
		p.setLongitudLado(10);
		p.setLados(6);
		System.out.print(p.getLados());
		System.out.print(p.getLongitudLado());
		p.setDibujo(null);
		System.out.print(p.getDibujo());
		double resultado = p.calcularPerimetro();
		assertEquals(60, resultado);
	}

}
