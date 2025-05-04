package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Cilindro;

class testCilindro {

	

		@Test
		void testSuperficie() {
			Cilindro c = new Cilindro();
			double valorEsperado = 12.56;
			double valoObtenido = c.superficie();
			assertEquals(valorEsperado, valoObtenido);
		}

		@Test
		void testVolumen() {
			Cilindro c = new Cilindro();
			double valorEsperado = 3.14;
			double valoObtenido = c.volumen();
			assertEquals(valorEsperado, valoObtenido);	
		}
		
		@Test
		void testConstructor_altura_negativa() {
			try {
				new Cilindro(-1, 0);
				fail("Se esperaba error");
			} catch (IllegalArgumentException e) {
				assertEquals("Error, altura o radio negativo", e.getMessage());
			}
		}
		
		@Test
		void testConstructor_radio_negativo() {
			try {
				new Cilindro(2, -5);
				fail("Se esperaba error");
			} catch (IllegalArgumentException e) {
				assertEquals("Error, altura o radio negativo", e.getMessage());
			}
		}

	}

		

	
	


