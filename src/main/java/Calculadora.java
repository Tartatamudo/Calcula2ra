import javax.swing.*;
import java.awt.geom.RectangularShape;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Calculadora {
    public static double sumaDos(double n1, double n2) {
        return n1 + n2;
    }

    public static double restaDos(double n1, double n2) {
        return n1 - n2;
    }

    public static double DividirDos(double n1, double n2) {
        double n3;
        try {
            n3 = n1 / n2;
            return n3;
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por 0");
        }
        return 0;
    }

    public static double MultiplicarDos(double n1, double n2){
        return n1*n2;
    }
    public static double MayorDos(double n1, double n2){
        return Math.min(n1, n2);
    }
    public static double MenorDos(double n1, double n2){
        return Math.max(n1, n2);
    }
    public static double ELevarNumero(double n1, double n2){
        return Math.pow(n1,n2);
    }

    public static double PorcentajeNumero(double n1, double n2){
        return n1*(n2/100);
    }

    public static List<Double> Cuadratica(List<Integer> lista) {
        double a = lista.get(0);
        double b = lista.get(1);
        double c = lista.get(2);
        b = -b;
        double calcRaiz = Math.pow(b, 2) - (4 * a * c);

        calcRaiz = Math.sqrt(calcRaiz);

        double sol1 = (b + calcRaiz) / (2*a);
        double sol2 = (b - calcRaiz) / (2*a);

        List<Double> resultado = Arrays.asList(sol1, sol2);
       return resultado;
    }
    public static double CalcPerCuadrado(double n1){
        return 4*n1;
    }
    public static double CalcPerRectangulo(double n1, double n2){
        double n3 = (n1*2) + (n2*2);
        return n3;
    }
    public static double CalcPerCirculo(double n1){
        double n2 = n1*(2*Math.PI);
        return n2;
    }
    public static double CalcAreaEsfera(double n1){
        double n2 = (2*Math.PI)*n1;
        return n2;
    }
    public static double CalcPerCubo(double n1){
        double n2 = 12*n1;
        return n2;
    }
    public static double CalcAreaCono(double n1, double n2){
        double g = Math.pow(n1, 2) + Math.pow(n2, 2);
        g = Math.sqrt(g);

        double n3 = (Math.PI*n1*g) + (Math.PI*Math.pow(n1,2));
        return n3;
    }
    public static double CalcAreaCuadrado(double n1){
        double n2 = n1*n1;
        return n2;
    }
    public static double CalcAreaRectangulo(double n1, double n2){
        double n3 = n1*n2;
        return n3;
    }
    public static double CalcAreaCirculo(double n1){
        double n2 = n1 * Math.pow(Math.PI, 2);
        return n2;
    }
    public static double CalcVolumenEsfera(double n1){
        double n2 = (4*Math.PI*Math.pow(n1, 3))/3;
        return n2;
    }
    public static double CalcAreaCubo(double n1){
        double n2 = 6*Math.pow(n1,2);
        return n2;
    }
    public static double CalcVolumenCubo(double n1){
        double n2  = Math.pow(n1,3);
        return n2;
    }
    public static double CalcVolCono(double n1, double n2){
        double n3 = (Math.PI * Math.pow(n1, 2) * n2)/3;
        return n3;
    }
    public static List<Double> CalcSistemaDe2Ecuaciones(List<Integer> lista){
        int n1 = lista.get(0);
        int nn1 = n1;
        int n2 = lista.get(1);
        int n3 = lista.get(2);
        int n4 = lista.get(3);
        int n5 = lista.get(4);
        int n6 = lista.get(5);

        n1 = n1*n4;
        n2 = n2*n4;
        n3 = n3*n4;

        n4 = -(n4*nn1);
        n5 = -(n5*nn1);
        n6 = -(n6*nn1);

        double var1 = (n1+n4 + n3+n6)/(n2+n5);

        double var2 = (n3 - n2*var1)/n1;

        List<Double> resultado = Arrays.asList(var1, var2);
        return resultado;
    }
    public static void infinito(double num) {
        if (Double.isInfinite(num)) {
            throw new RuntimeException("El número es infinito!");
        }
    }
    public static double validarDoublePositivo(){
        Scanner teclado = new Scanner(System.in);
        double num  = -1;

        while(num < 0){
           num = validarDouble();
           if (num < 0 ){
               System.out.println("Debe escribir un numero positivo");
           }
        }
        return num;
    }
    public static double validarDouble(){
        Scanner teclado = new Scanner(System.in);
        double num = 0;

        try {
            num = teclado.nextDouble();
        }catch (NumberFormatException ex){
            System.out.println("Debe escribir un numero");
        }
        return num;
    }

    public static int validarEntero(){
        Scanner teclado = new Scanner(System.in);
        int num = 0;

        try {
            num = teclado.nextInt();
        }catch (NumberFormatException ex){
            System.out.println("Debe escribir un numero");
        }
        return num;
    }

    public static void menu() {
        double acum = 0;

        System.out.println("Que desea hacer");
        System.out.println(("[1]Calcular cosas basicas"));
        System.out.println("[2]Calcular cosas de geometria");
        System.out.println("[3]Calcular cosas extras");
        System.out.println("[4]Calcular ecuacion cuadratica");
        System.out.println("[5]Calcular sistema de ecuaciones");

        int eleccion = validarEntero();
        switch (eleccion) {
            case 1:
                menuCalculoBasico();
                break;
            case 2:
                menuGeometria();
                break;
            case 3:
                menuCalcularEtc();
            case 4:
                imprimirList(CalcularCuadratica());
                break;
            case 5:
                imprimirList(CalcularSistemaDeEcuaciones());
                break;
        }
    }

    public static void menuCalcularEtc() {
        double resultado = 0;
        System.out.println("ELiga lo que quiere hacer");
        System.out.println("[1]Mayor entre 2 numeros");
        System.out.println("[2]Menor entre 2 numeros");
        System.out.println("[3]Elevar un Numero");
        System.out.println("[4]Porcentaje numero");

        int eleccion = validarEntero();

        switch (eleccion) {
            case 1:
                resultado = menuMayor2();
                imprirDouble(resultado);
                break;
            case 2:
                resultado = menuMenor2();
                imprirDouble(resultado);
                break;
            case 3:
                resultado = menuELevarNumero();
                imprirDouble(resultado);
                break;
            case 4:
                resultado = menuPorcentajeNumero();
                imprirDouble(resultado);
            default:
                imprirDouble(resultado);
        }
    }

    public static double menuPorcentajeNumero() {
        System.out.println("ELiga el numero a sacarle porcentaje");
        double num1 = validarDouble();

        System.out.println("Eliga el porcentaje");
        double num2 = validarDoublePositivo();

        return PorcentajeNumero(num1, num2);
    }

    public static double menuELevarNumero() {
        System.out.println("ELiga el numreo a ser elevado");
        double num1 = validarDoublePositivo();

        System.out.println("Eliga la potencia");
        double num2 = validarDoublePositivo();

        return ELevarNumero(num1, num2);
    }

    public static double menuMenor2() {
        System.out.println("ELiga el primer numero");
        double num1 = validarDouble();

        System.out.println("Eliga el segundo numero");
        double num2 = validarDouble();

        return MenorDos(num1, num2);
    }

    public static double menuMayor2() {
        System.out.println("ELiga el primer numero");
        double num1 = validarDouble();

        System.out.println("Eliga el segundo numero");
        double num2 = validarDouble();

        return MayorDos(num1, num2);
    }
    public static void menuCalculoBasico() {
        double resultado = 0;
        int eleccion = 1;
        while (eleccion >0 && eleccion < 5){
            System.out.println("ELiga lo que quiere hacer");
            System.out.println("[1]Sumar");
            System.out.println("[2]Restar");
            System.out.println("[3]multiplicar");
            System.out.println("[4]Dividir");

            eleccion = validarEntero();

            switch (eleccion) {
                case 1:
                    resultado = menuSumar(resultado);
                    imprirDouble(resultado);
                    break;
                case 2:
                    resultado = menuRestar(resultado);
                    imprirDouble(resultado);
                    break;
                case 3:
                    resultado = menuMultiplicar(resultado);
                    imprirDouble(resultado);
                    break;
                case 4:
                    resultado = menuDividir(resultado);
                    imprirDouble(resultado);
                default:
                    imprirDouble(resultado);
            }
            System.out.println("Si desea seguir operando aqui oprima un numero del 1 al 4");
            eleccion = validarEntero();
        }

    }

    public static double menuDividir(double resultado) {
        double num1 = 0;
        int val = 0;
        if(resultado != 0){
            System.out.println("Si desea usar el numero que le dio antes escriba 1");
            val = validarEntero();
        }

        if (val == 1){
            System.out.println(resultado);
            num1 = resultado;
        }else{
            System.out.println("Eliga el primer numero");
            num1 = validarDouble();
        }

        System.out.println("Elige el segundo numero");
        double num2 = validarDouble();

        return DividirDos(num1,num2);
    }

    public static double menuMultiplicar(double resultado){
        double num1 = 0;
        int val = 0;

        if(resultado != 0){
            System.out.println("Si desea usar el numero que le dio antes escriba 1");
            val = validarEntero();
        }

        if (val == 1){
            System.out.println(resultado);
            num1 = resultado;
        }else{
            System.out.println("Eliga el primer numero");
            num1 = validarDouble();
        }

        System.out.println("Elige el segundo numero");
        double num2 = validarDouble();

        return MultiplicarDos(num1,num2);
    }
    public static double menuRestar(double resultado){
        double num1 = 0;
        int val = 0;

        if(resultado != 0){
            System.out.println("Si desea usar el numero que le dio antes escriba 1");
            val = validarEntero();
        }

        if (val == 1){
            System.out.println(resultado);
            num1 = resultado;
        }else{
            System.out.println("Eliga el primer numero");
            num1 = validarDouble();
        }

        System.out.println("Elige el segundo numero");
        double num2 = validarDouble();
        return restaDos(num1,num2);
    }
    public static double menuSumar(double resultado){
        double num1 = 0;
        int val = 0;

        if(resultado != 0){
            System.out.println("Si desea usar el numero que le dio antes escriba 1");
            val = validarEntero();
        }

        if (val == 1){
            System.out.println(resultado);
            num1 = resultado;
        }else{
            System.out.println("Eliga el primer numero");
            num1 = validarDouble();
        }

        System.out.println("Elige el segundo numero");
        double num2 = validarDouble();

        return sumaDos(num1,num2);
    }

    public static List<Double> CalcularCuadratica(){
        System.out.println("Elige el numero que va a estar con el x^2");
        int a = validarEntero();
        System.out.println("Elige el numero que va a estar con el x");
        int b = validarEntero();
        System.out.println("Elige el numero que va a estar solo");
        int c = validarEntero();

        List<Integer> cuadra = Arrays.asList(a, b, c);
        List<Double> resultado  = Cuadratica(cuadra);
        return resultado;
    }
    public static List<Double> CalcularSistemaDeEcuaciones(){
        System.out.println("Elige los numeros de la primera ecuacion");

        System.out.println("Elige el numero que va a estar con la x");
        int a = validarEntero();
        System.out.println("Elige el numero que va a estar con la y");
        int b = validarEntero();
        System.out.println("Elige el numero que va a estar solo");
        int c = validarEntero();

        System.out.println("Elige los numeros de la segunda ecuacion");

        System.out.println("Elige el numero que va a estar con la x");
        int d = validarEntero();
        System.out.println("Elige el numero que va a estar con la y");
        int e = validarEntero();
        System.out.println("Elige el numero que va a estar solo");
        int f = validarEntero();

        List<Integer> cuadra = Arrays.asList(a, b, c, d, e, f);
        List<Double> resultado = CalcSistemaDe2Ecuaciones(cuadra);
        return resultado;
    }
    public static void imprimirList(List<Double> lista){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
    public static void imprirDouble(double num){
        System.out.println(num);
    }

    public static void menuGeometria(){
        double resultado = 0;

        System.out.println("Que geometria quiere usar:");
        System.out.println(("[1]Cuadrado "));
        System.out.println("[2]Rectangulo");
        System.out.println("[3]Circulo");
        System.out.println("[4]Esfera");
        System.out.println("[5]Cubo");
        System.out.println("[6]Cono");
        int eleccion = validarEntero();
        switch (eleccion) {
            case 1:
                resultado =menuCuadrado();
                imprirDouble(resultado);
                break;
            case 2:
                resultado = menuRectangulo();
                imprirDouble(resultado);
                break;
            case 3:
                resultado = menuCirculo();
                imprirDouble(resultado);
                break;
            case 4:
                resultado = menuEsfera();
                imprirDouble(resultado);
                break;
            case 5:
                resultado = menuCubo();
                imprirDouble(resultado);
                break;
            case 6:
                resultado = menuCono();
                imprirDouble(resultado);
                break;
            default:
                System.out.println(resultado);
        }
    }

    public static double menuCono() {
        double resultado = 0;
        System.out.println("eliga el largo del radio");
        double num1 = validarDouble();

        System.out.println("Eliga el largo del largo");
        double num2 = validarDouble();

        System.out.println("ELiga lo que quiere hacer");
        System.out.println("[1]Diametro");
        System.out.println("[2]Area");

        int eleccion = validarEntero();

        switch (eleccion) {
            case 1:
                resultado = CalcAreaCono(num1, num2);
                break;
            case 2:
                resultado = CalcVolCono(num1, num2);
                break;
        }
        return resultado;
    }

    public static double menuCubo() {
        double resultado = 0;
        System.out.println("eliga el largo de un lado");
        double num = validarDouble();

        System.out.println("ELiga lo que quiere hacer");
        System.out.println("[1]Area");
        System.out.println("[2]Volumen");

        int eleccion = validarEntero();

        switch (eleccion) {
            case 1:
                resultado = CalcAreaCubo(num);
                break;
            case 2:
                resultado = CalcVolumenCubo(num);
                break;
        }
        return resultado;
    }

    public static double menuEsfera() {
        double resultado = 0;
        System.out.println("eliga el radio");
        double num = validarDouble();

        System.out.println("ELiga lo que quiere hacer");
        System.out.println("[1]Area");
        System.out.println("[2]Volumen");

        int eleccion = validarEntero();

        switch (eleccion) {
            case 1:
                resultado = CalcAreaEsfera(num);
                break;
            case 2:
                resultado = CalcVolumenEsfera(num);
                break;
        }
        return resultado;
    }


    public static double menuRectangulo() {
        double resultado = 0;
        System.out.println("eliga el largo del primer lado");
        double num1 = validarDouble();

        System.out.println("Eliga el largo del segundo lado");
        double num2 = validarDouble();

        System.out.println("ELiga lo que quiere hacer");
        System.out.println("[1]Diametro");
        System.out.println("[2]Area");

        int eleccion = validarEntero();

        switch (eleccion) {
            case 1:
                resultado = CalcPerRectangulo(num1, num2);
                break;
            case 2:
                resultado = CalcAreaRectangulo(num1, num2);
                break;
        }
        return resultado;
    }

    public static double menuCirculo() {
        double resultado = 0;

        System.out.println("eliga el largo del radio");
        double num = validarDouble();

        System.out.println("ELiga lo que quiere hacer");
        System.out.println("[1]Diametro");
        System.out.println("[2]Area");

        int eleccion = validarEntero();

        switch (eleccion) {
            case 1:
                resultado = CalcPerCirculo(num);
                break;
            case 2:
                resultado = CalcAreaCirculo(num);
                break;
        }
        return resultado;
    }

    public static double menuCuadrado() {
        double resultado = 0;
        System.out.println("eliga el largo de un lado");
        double num = validarDouble();

        System.out.println("ELiga lo que quiere hacer");
        System.out.println("[1]Diametro");
        System.out.println("[2]Area");

        int eleccion = validarEntero();

        switch (eleccion) {
            case 1:
                resultado = CalcPerCuadrado(num);
                break;
            case 2:
                resultado = CalcAreaCuadrado(num);
                break;
        }
        return resultado;
    }

    public static void main(String[] args) {
        //imprimirList(CalcularCuadratica());
        //imprimirList(CalcularSistemaDeEcuaciones());
        menu();
    }
}