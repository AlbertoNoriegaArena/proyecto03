package es.santander.ascender.proyecto03;


public class Calculadora {
    public long sumar(long sumando1, long sumando2) {
        return sumando1 + sumando2;
    }

    public long restar(long substraendo, long minuendo) {
        return substraendo - minuendo;
    }

    public long multiplicar(long factor1, long factor2) {
        return factor1 * factor2;
    }

    public double dividir(long dividendo, long divisor) {
        return dividendo / divisor;
    }

    public void generarTablaDeMultiplicar(int numero){

        for(int i=0; i<11; i++){
            System.out.println(numero +" x " + i + " = " + numero * i);
        }
    }
    

    public int[] calcularTablaDeMultiplicar(int numero){

        int[] resultados = new int[11];

        for(int i=0; i<resultados.length; i++){
            resultados[i] = numero * i;
        }

        return resultados;
        
    }


    public int[] calcularTablaDeMultiplicarWhile(int numero){

        int i=0;
        int[] tablaDeMultiplicar = new int[11];

        while (i<tablaDeMultiplicar.length) {
            tablaDeMultiplicar[i] = numero * i;
            i++;
        }

        return tablaDeMultiplicar;
        
    }

    public int[] calcularTablaDeMultiplicarDoWhile(int numero){

        int i=0;
        int[] tablaDeMultiplicar = new int[11];

        do {
            tablaDeMultiplicar[i] = numero * i;
            i++;
        } while (i<tablaDeMultiplicar.length);

        return tablaDeMultiplicar;
        
    }
}
