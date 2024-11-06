package es.santander.ascender.proyecto03;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        long resultadoSuma = calculadora.sumar(4, 5);
        System.out.println(resultadoSuma);
        long resultadoResta = calculadora.restar(10, 2);
        System.out.println(resultadoResta);
        long resultadoProducto = calculadora.multiplicar(4, 5);
        System.out.println(resultadoProducto);
        double resultadoDivision = calculadora.dividir(10, 2);
        System.out.println(resultadoDivision);
    }
}
