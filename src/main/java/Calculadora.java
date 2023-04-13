import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculadora {
    public static int sumaDos(int n1, int n2){
        return n1+n2;
    }
    public static int restaDos(int n1, int n2){
        return n1-n2;
    }
    public static double DividirDos(int n1, int n2){
        return n1/n2;
    }
    public static int MultiplicarDos(int n1, int n2){
        return n1*n2;
    }
    public static int MayorDos(int n1, int n2){
        if (n1 < n2){
            return n2;
        }
        else if(n1> n2){
            return n1;
        }else{
            System.out.println("Son iguales");
        }
        return 0;
    }
    public static int MenorDos(int n1, int n2){
        if (n1 > n2){
            return n2;
        }
        else if(n1 < n2){
            return n1;
        }else{
            System.out.println("Son iguales");
        }
        return 0;
    }
    public static double ELevarNumero(int n1, int n2){
        return Math.pow(n1,n2);
    }

    public static double PorcentajeNumero(int n1, int n2){
        return n1*(n2/100);
    }

    public static List<Double> Cuadratica(ArrayList<Integer> lista) {
        int n1 = lista.get(0);
        int n2 = lista.get(0);
        int n3 = lista.get(0);
        n2 = -n2;
        double calcRaiz = Math.pow(n2, 2) - (4 * n1 * n3);
        calcRaiz = Math.pow(calcRaiz, 1 / 2);

        double sol1 = (n2 + calcRaiz) / n1;
        double sol2 = (n2 - calcRaiz) / n2;

        List<Double> resultado = Arrays.asList(sol1, sol2);
       return resultado;
    }
    public static int CalcPerCuadrado(int n1){
        System.out.println(4*n1);
        return 4*n1;
    }
    public static int CalcPerRectangulo(int n1, int n2){
        int n3 = (n1*2) + (n2*2);
        return n3;
    }
    public static double CalcPerCirculo(int n1){
        double n2 = n1*(2*Math.PI);
        return n2;
    }
    public static double CalcAreaEsfera(int n1){
        double n2 = (2*Math.PI)*n1;
        return n2;
    }
    public static double CalcPerCubo(int n1){
        double n2 = 12*n1;
        return n2;
    }
    public static double CalcAreaCono(int n1, int n2){
        double g = Math.pow(n1, 2) + Math.pow(n2, 2);
        g = Math.pow(g, 1/2);

        double n3 = (Math.PI*n1*g) + (Math.PI*Math.pow(n1,2));
        return n3;
    }
    public static int CalcAreaCuadrado(int n1){
        int n2 = n1*n1;
        return n2;
    }
    public static int CalcAreaRectangulo(int n1, int n2){
        int n3 = n1*n2;
        return n3;
    }
    public static double CalcAreaCirculo(int n1){
        double n2 = n1 * Math.pow(Math.PI, 2);
        return n2;
    }
    public static double CalcVolumenEsfera(int n1){
        double n2 = (4*Math.PI*Math.pow(n1, 3))/3;
        return n2;
    }
    public static double CalcAreaCubo(int n1){
        double n2 = 6*Math.pow(n1,2);
        return n2;
    }
    public static double CalcVolumenCubo(int n1){
        double n2  = Math.pow(n1,3);
        return n2;
    }
    public static double CalcVolCono(int n1, int n2){
        double n3 = (Math.PI * Math.pow(n1, 2) * n2)/3;
        return n3;
    }
    public static List<Double> CalcSistemaDe2Ecuaciones(ArrayList<Integer> lista){
        int n1 = lista.get(0);
        int n2 = lista.get(1);
        int n3 = lista.get(2);
        int n4 = lista.get(3);
        int n5 = lista.get(4);
        int n6 = lista.get(5);

        n1 = n1*n3;
        n2 = n2*n3;
        n5 = n5*n3;

        n3 = -(n3*n1);
        n4 = -(n4*n1);
        n6 = -(n6*n1);

        double var1 = (n5+n6)/(n2+n4);

        double var2 = (n5 - n2*var1)/n1;

        List<Double> resultado = Arrays.asList(var1, var2);
        return resultado;
    }
}