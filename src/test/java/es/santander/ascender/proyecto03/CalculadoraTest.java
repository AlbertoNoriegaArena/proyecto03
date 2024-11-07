package es.santander.ascender.proyecto03;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test

    public void testSumar() {

        Calculadora calculadora = new Calculadora();
        long resultado = calculadora.sumar(10, 15);

        assertEquals(25, resultado, "10+15 debería ser 25");
    }

    @Test
    public void testRestar() {

        Calculadora calculadora = new Calculadora();
        long resultado = calculadora.restar(15, 10);

        assertEquals(5, resultado, "15-10 debería ser 5");
    }

    @Test
    public void testMultiplicar() {

        Calculadora calculadora = new Calculadora();
        long resultado = calculadora.multiplicar(2, 5);

        assertEquals(10, resultado, "2 * 5 debería ser 10");
    }

    @Test
    public void testDividir() {

        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.dividir(10, 5);

        assertEquals(2, resultado, "10 / 5 debería ser 2");
    }

    @Test
    public void testDivisionPorCero() {

        Calculadora calculadora = new Calculadora();

        try{

            double resultado = calculadora.dividir(10, 0);

            fail("Debería haber lanzado un error de división por 0");
        } catch (Exception e){

            System.out.println(e);
            }
    }

    @Test
    public void testGenerarTablaDeMultiplicar(){

        Calculadora calculadora= new Calculadora();

        calculadora.generarTablaDeMultiplicar(7);

    }

    @Test
    public void testGenerarTablaDeMultiplicarWhile(){

        Calculadora calculadora= new Calculadora();

        calculadora.calcularTablaDeMultiplicarWhile(7);

    }

    @Test
    public void testGenerarTablaDeMultiplicarDoWhile(){

        Calculadora calculadora= new Calculadora();

        calculadora.calcularTablaDeMultiplicarDoWhile(7);

    }

     @Test
    public void testCalcularTablaDeMultiplicar() {
                
        Calculadora calculadora= new Calculadora();
        
        // Probar con el número 5
        int numero = 5;
        int[] valores = calculadora.calcularTablaDeMultiplicar(numero);
                
        // Esperamos que la tabla de multiplicar del 5 sea:
        int[] resultadoEsperado = new int[]{0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        
        assertArrayEquals(resultadoEsperado, valores, "La tabla de multiplicar del 5 no es correcta.");
        

    }

}
