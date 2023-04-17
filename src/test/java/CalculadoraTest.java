import org.junit.jupiter.api.Test;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.io.CharArrayReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void testSumaDos() {
        assertEquals(3, Calculadora.SumaDos(3,0));
        assertEquals(100, Calculadora.SumaDos(256,-156));
        assertEquals(250000,Calculadora.SumaDos(300000,-50000));
    }

    @Test
    void testRestaDos() {
        assertEquals(10,Calculadora.RestaDos(10,0));
        assertEquals(-20, Calculadora.RestaDos(25,45));
        assertEquals(50450, Calculadora.RestaDos(20000,-30450));
    }

    @Test
    void testDividirDos() {
        double division = Calculadora.DividirDos(500,0);
        assertEquals(30, Calculadora.DividirDos(60,2));

        assertFalse(("Infinity").equals(division));

        assertEquals(8, Calculadora.DividirDos(50+30,6+4));
    }

    @Test
    void testMultiplicarDos() {
        assertEquals(100, Calculadora.MultiplicarDos(25,4));
        assertEquals(-200, Calculadora.MultiplicarDos(-20,10));
        assertEquals(1000, Calculadora.MultiplicarDos(-50,-20));
    }

    @Test
    void testmayorDos() {
        assertEquals(500, Calculadora.MayorDos(500,5));
        assertEquals(-20, Calculadora.MayorDos(-200,-20));
        assertEquals(1, Calculadora.MayorDos(-1,1));
    }

    @Test
    void testmenorDos() {
        assertEquals(5, Calculadora.MenorDos(500,5));
        assertEquals(-200, Calculadora.MenorDos(-200,-20));
        assertEquals(-1, Calculadora.MenorDos(-1,1));
    }

    @Test
    void testELevarNumero() {
        assertEquals(8,Calculadora.ELevarNumero(2,3));
        assertEquals(19683, Calculadora.ELevarNumero(3,9));
        assertEquals(1, Calculadora.ELevarNumero(2000,0));
    }

    @Test
    void testPorcentajeNumero() {
        assertEquals(10, Calculadora.PorcentajeNumero(200,5));
        assertEquals(0.001, Calculadora.PorcentajeNumero(1,0.1));
        assertEquals(2, Calculadora.PorcentajeNumero(1,200));
    }

    @Test
    void testCuadratica() {
        double delta = 0.05;

        //Primer assert
        List<Double> lista = new ArrayList<Double>();
        lista.add(1.0);
        lista.add(2.0);
        lista.add(-8.0);

        List<Double> resultado = Calculadora.Cuadratica(lista);

        assertEquals(2.0, resultado.get(0), delta);
        assertEquals(-4.0, resultado.get(1), delta);

        //Segundo assert
        List<Double> lis = new ArrayList<Double>();
        lis.add(2.0);
        lis.add(0.0);
        lis.add(-4.0);

        List<Double> resultadoo = Calculadora.Cuadratica(lis);

        assertEquals(1.41421, resultadoo.get(0), delta);
        assertEquals(-1.41421,resultadoo.get(1), delta);

    }

    @Test
    void testCalcPerCuadrado() {
    }

    @Test
    void testCalcPerRectangulo() {
    }

    @Test
    void tstCalcPerCirculo() {
    }

    @Test
    void testCalcAreaEsfera() {
    }

    @Test
    void testCalcPerCubo() {
    }

    @Test
    void testCalcAreaCono() {
    }

    @Test
    void testCalcAreaCuadrado() {
    }

    @Test
    void testCalcAreaRectangulo() {
    }

    @Test
    void testCalcAreaCirculo() {
    }

    @Test
    void testCalcVolumenEsfera() {
    }

    @Test
    void testCalcAreaCubo() {
    }

    @Test
    void testCalcVolumenCubo() {
    }

    @Test
    void testCalcVolCono() {
    }

    @Test
    void testCalcSistemaDe2Ecuaciones() {
    }
}