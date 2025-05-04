package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.cubo;

class testCubo {

	@Test
    void testVolumen() {
        cubo c1 = new cubo();
        int valorEsperado = 1;
        double valorObtenido = c1.volumen();
        assertEquals(valorEsperado,valorObtenido);
    
	}

}
