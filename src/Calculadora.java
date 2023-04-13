import javax.xml.crypto.dom.DOMCryptoContext;

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
    public static void Cuadratica(int n1, int n2, int n3) {
        n2 = -n2;
        double calcRaiz = Math.pow(n2, 2) - (4 * n1 * n3);
        calcRaiz = Math.pow(calcRaiz, 1 / 2);

        double sol1 = (n2 + calcRaiz) / n1;
        double sol2 = (n2 - calcRaiz) / n2;
        System.out.println(sol1);
        System.out.println(sol2);
    }
    public static void CalcPerCuadrado(int n1){
        System.out.println(4*n1);
    }
    public static void CalcPerRectangulo(int n1, int n2){
        int n3 = (n1*2) + (n2*2);
        System.out.println(n3);
    }
    public static void CalcPerCirculo(int n1){
        double n2 = n1*(2*Math.PI);
        System.out.println(n2);
    }
    public static void CalcAreaEsfera(int n1){
        double n2 = (2*Math.PI)*n1;
        System.out.println(n2);
    }
    public static void CalcPerCubo(int n1){
        double n2 = 12*n1;
        System.out.println(n2);
    }
    public static void CalcAreaCono(int n1, int n2){
        double g = Math.pow(n1, 2) + Math.pow(n2, 2);
        g = Math.pow(g, 1/2);

        double n3 = (Math.PI*n1*g) + (Math.PI*Math.pow(n1,2));
        System.out.println(n3);
    }
    public static void CalcAreaCuadrado(int n1){
       int n2 = n1*n1;
        System.out.println(n2);
    }
    public static void CalcAreaRectangulo(int n1, int n2){
        int n3 = n1*n2;
        System.out.println(n3);
    }
    public static void CalcAreaCirculo(int n1){
        double n2 = n1 * Math.pow(Math.PI, 2);
        System.out.println(n2);
    }
    public static void CalcVolumenEsfera(int n1){
        double n2 = (4*Math.PI*Math.pow(n1, 3))/3;
        System.out.println(n2);
    }
    public static void CalcAreaCubo(int n1){
        double n2 = 6*Math.pow(n1,2);
        System.out.println(n2);
    }
    public static void CalcVolumenCubo(int n1){
        double n2  = Math.pow(n1,3);
        System.out.println(n2);
    }
    public static void CalcVolCono(int n1, int n2){
        double n3 = (Math.PI * Math.pow(n1, 2) * n2)/3;
        System.out.println(n3);
    }
    public static void CalcSistemaDe2Ecuaciones(int n1, int n2, int n3, int n4, int n5, int n6){
        n1 = n1*n3;
        n2 = n2*n3;
        n5 = n5*n3;

        n3 = -(n3*n1);
        n4 = -(n4*n1);
        n6 = -(n6*n1);

        double var1 = (n5+n6)/(n2+n4);

        double var2 = (n5 - n2*var1)/n1;
    }
}
