import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(2);
        lista.add(-8);

        List<Double> resultado = Calculadora.Cuadratica(lista);

        assertEquals(2, resultado.get(0), delta);
        assertEquals(-4, resultado.get(1), delta);

        //Segundo assert
        List<Integer> lis = new ArrayList<Integer>();
        lis.add(2);
        lis.add(0);
        lis.add(-4);

        List<Double> resultadoo = Calculadora.Cuadratica(lis);

        assertEquals(1.41421, resultadoo.get(0), delta);
        assertEquals(-1.41421,resultadoo.get(1), delta);

    }

    @Test
    void testCalcPerCuadrado() {
        assertEquals(16, Calculadora.CalcPerCuadrado(4));

        assertEquals(4, Calculadora.CalcPerCuadrado(1));
    }

    @Test
    void testCalcPerRectangulo() {
        assertEquals(14, Calculadora.CalcPerRectangulo(3,4));

        assertEquals(240, Calculadora.CalcPerRectangulo(40,80));
    }

    @Test
    void tstCalcPerCirculo() {
        double delta = 0.10;

        assertEquals(25.1, Calculadora.CalcPerCirculo(4), delta);

        assertEquals(6.2, Calculadora.CalcPerCirculo(1), delta);
    }

    @Test
    void testCalcAreaEsfera() {
        double delta = 0.05;

        assertEquals(314.16, Calculadora.CalcAreaEsfera(5), delta);

        assertEquals(5026.54, Calculadora.CalcAreaEsfera(20),delta);
    }

    @Test
    void testCalcPerCubo() {
        assertEquals(24, Calculadora.CalcPerCubo(2));

        assertEquals(276, Calculadora.CalcPerCubo(23));
    }

    @Test
    void testCalcAreaCono() {
        double delta = 0.05;

        assertEquals(213.66, Calculadora.CalcAreaCono(5, 7), delta);

        assertEquals(1160.1, Calculadora.CalcAreaCono(10,25), delta);
    }

    @Test
    void testCalcAreaCuadrado() {

        assertEquals(25, Calculadora.CalcAreaCuadrado(5));

        assertEquals(90000, Calculadora.CalcAreaCuadrado(300));
    }

    @Test
    void testCalcAreaRectangulo() {

        assertEquals(1200, Calculadora.CalcAreaRectangulo(30,40));

        assertEquals(24000000, Calculadora.CalcAreaRectangulo(8000,3000));
    }

    @Test
    void testCalcAreaCirculo() {
        double delta = 0.05;

        assertEquals(19.73, Calculadora.CalcAreaCirculo(2),delta);

        assertEquals(838.92, Calculadora.CalcAreaCirculo(85), delta);
    }

    @Test
    void testCalcVolumenEsfera() {
        double delta = 0.05;

        assertEquals(523.6, Calculadora.CalcVolumenEsfera(5), delta);

        assertEquals(33510.32, Calculadora.CalcVolumenEsfera(20), delta);
    }

    @Test
    void testCalcAreaCubo() {
        assertEquals(150, Calculadora.CalcAreaCubo(5));

        assertEquals(38400, Calculadora.CalcAreaCubo(80));
    }

    @Test
    void testCalcVolumenCubo() {
        assertEquals(8, Calculadora.CalcVolumenCubo(2));

        assertEquals(12977875, Calculadora.CalcVolumenCubo(235));
    }

    @Test
    void testCalcVolCono() {
        double delta = 0.05;

        assertEquals(20.94, Calculadora.CalcVolCono(2,5), delta);

        assertEquals(22252.94, Calculadora.CalcVolCono(25, 34), delta);
    }

    @Test
    void testCalcSistemaDe2Ecuaciones() {
        double delta = 0.05;

        //Primer assert
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(6);
        lista.add(27);
        lista.add(7);
        lista.add(-3);
        lista.add(9);

        List<Double> resultado = Calculadora.CalcSistemaDe2Ecuaciones(lista);

        assertEquals(4, resultado.get(0), delta);
        assertEquals(3, resultado.get(1), delta);

        //Segundo assert
        List<Integer> lis = new ArrayList<Integer>();
        lis.add(4);
        lis.add(3);
        lis.add(18);
        lis.add(5);
        lis.add(-6);
        lis.add(3);

        List<Double> resultadoo = Calculadora.CalcSistemaDe2Ecuaciones(lis);

        assertEquals(2, resultadoo.get(0), delta);
        assertEquals(3, resultadoo.get(1), delta);
    }
    @Test
    void testCalcEcuacionDeLaRecta(){
        assertEquals("y = 2.0x + 1.0", Calculadora.CalcEcuacionDeLaRecta(1,3,2,5));
        assertEquals("y = 0.0x + 3.0", Calculadora.CalcEcuacionDeLaRecta(1,3,2,3));
    }
}