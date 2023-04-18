import java.util.*;

public class Calculadora {
    public static double SumaDos(double n1, double n2) {
        return n1 + n2;
    }

    public static double RestaDos(double n1, double n2) {
        return n1 - n2;
    }

    public static double DividirDos(double n1, double n2) {
        double n3;
        try {
            n3 = n1 / n2;
            return n3;
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por 0");
            n3 = 0;
        }
        return n3;
    }

    public static double MultiplicarDos(double n1, double n2){
        return n1*n2;
    }
    public static double MayorDos(double n1, double n2){
        return Math.max(n1, n2);
    }
    public static double MenorDos(double n1, double n2){
        return Math.min(n1, n2);
    }
    public static double ELevarNumero(double n1, double n2){
        return Math.pow(n1,n2);
    }

    public static double PorcentajeNumero(double n1, double n2){
        return n1*(n2/100);
    }

    public static List<Double> Cuadratica(List<Integer> lista) {
        int a = lista.get(0);
        int b = lista.get(1);
        int c = lista.get(2);

        b = -b;
        double calcRaiz = Math.pow(b, 2) - (4 * a * c);

        calcRaiz = Math.sqrt(calcRaiz);

        double sol1 = DividirDos ((b + calcRaiz), (2*a));
        double sol2 = DividirDos ((b - calcRaiz), (2*a));

        List<Double> resultado = Arrays.asList(sol1, sol2);
       return resultado;
    }
    public static double CalcPerCuadrado(double n1){
        return 4*n1;
    }
    public static double CalcPerRectangulo(double n1, double n2){
        return (n1*2) + (n2*2);
    }
    public static double CalcPerCirculo(double n1){
        double n2 = n1*(2*Math.PI);
        return n2;
    }
    public static double CalcAreaEsfera(double n1){
        double n2 = (4*Math.PI)*(Math.pow(n1,2));
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
        return n1 * (Math.pow(Math.PI, 2));
    }
    public static double CalcVolumenEsfera(double n1){
        double n2 = DividirDos((4*Math.PI*Math.pow(n1, 3)), 3);
        return n2;
    }
    public static String CalcEcuacionDeLaRecta(double x1,double y1, double x2, double y2){
        double m = DividirDos(y2 - y1, x2 - x1);
        double b = y1 - (m*x1);
        return "y = " + m + "x " + "+ " + b;
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
        double n3 = DividirDos((Math.PI * Math.pow(n1, 2) * n2), 3);
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

        double var1 = DividirDos((n1+n4 + n3+n6), (n2+n5));

        double var2 = DividirDos((n3 - n2*var1), n1);

        List<Double> resultado = Arrays.asList(var1, var2);
        return resultado;
    }
    public static void infinito(double num) {
        if (Double.isInfinite(num)) {
            throw new RuntimeException("El número es infinito!");
        }
    }
    public static double ValidarDoublePositivo(){
        Scanner teclado = new Scanner(System.in);
        double num  = -1;

            while(num < 0){
           num = ValidarDouble();
           if (num < 0 ){
               System.out.println("Debe escribir un numero positivo");
           }
        }
        return num;
    }
    public static double ValidarDouble(){
        Scanner teclado = new Scanner(System.in);
        double num = 0;

        try {
            num = teclado.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("Debes escribir un numero");
        }
        return num;
    }

    public static int ValidarEntero(){
        Scanner teclado = new Scanner(System.in);
        int num = 0;

        try {
            num = teclado.nextInt();
        }catch (NumberFormatException ex){
            System.out.println("Debe escribir un numero");
        }catch(InputMismatchException e){
            System.out.println("Debe escribir un entero");
        }
        return num;
    }

    public static void MenuCalcularEtc() {
        double resultado = 0;
        System.out.println("ELiga lo que quiere hacer");
        System.out.println("[1]Mayor entre 2 numeros");
        System.out.println("[2]Menor entre 2 numeros");
        System.out.println("[3]Elevar un Numero");
        System.out.println("[4]Porcentaje numero");

        int eleccion = ValidarEntero();

        switch (eleccion) {
            case 1:
                resultado = MenuMayor2();
                ImprirDouble(resultado);
                break;
            case 2:
                resultado = MenuMenor2();
                ImprirDouble(resultado);
                break;
            case 3:
                resultado = MenuELevarNumero();
                ImprirDouble(resultado);
                break;
            case 4:
                resultado = MenuPorcentajeNumero();
                ImprirDouble(resultado);
            default:
                ImprirDouble(resultado);
        }
    }

    public static double MenuPorcentajeNumero() {
        System.out.println("ELiga el numero a sacarle porcentaje");
        double num1 = ValidarDouble();

        System.out.println("Eliga el porcentaje");
        double num2 = ValidarDoublePositivo();

        return PorcentajeNumero(num1, num2);
    }

    public static double MenuELevarNumero() {
        System.out.println("ELiga el numreo a ser elevado");
        double num1 = ValidarDouble();

        System.out.println("Eliga la potencia");
        double num2 = ValidarDoublePositivo();

        return ELevarNumero(num1, num2);
    }

    public static double MenuMenor2() {
        System.out.println("ELiga el primer numero");
        double num1 = ValidarDouble();

        System.out.println("Eliga el segundo numero");
        double num2 = ValidarDouble();

        return MenorDos(num1, num2);
    }

    public static double MenuMayor2() {
        System.out.println("ELiga el primer numero");
        double num1 = ValidarDouble();

        System.out.println("Eliga el segundo numero");
        double num2 = ValidarDouble();

        return MayorDos(num1, num2);
    }
    public static void MenuCalculoBasico() {
        double resultado = 0;
        int eleccion = 1;
        while (eleccion >0 && eleccion < 5){
            System.out.println("ELiga lo que quiere hacer");
            System.out.println("[1]Sumar");
            System.out.println("[2]Restar");
            System.out.println("[3]multiplicar");
            System.out.println("[4]Dividir");
            System.out.println("Si desea salir oprima cualquier otro numero");
            eleccion = ValidarEntero();

            switch (eleccion) {
                case 1:
                    resultado = menuSumar(resultado);
                    ImprirDouble(resultado);
                    break;
                case 2:
                    resultado = MenuRestar(resultado);
                    ImprirDouble(resultado);
                    break;
                case 3:
                    resultado = MenuMultiplicar(resultado);
                    ImprirDouble(resultado);
                    break;
                case 4:
                    resultado = MenuDividir(resultado);
                    ImprirDouble(resultado);
                default:
                    ImprirDouble(resultado);
            }
        }

    }

    public static double MenuDividir(double resultado) {
        double num1 = 0;
        int val = 0;
        double num2 = 0;

        if(resultado != 0){
            System.out.println("Si desea usar el numero que le dio antes escriba 1");
            val = ValidarEntero();
        }

        if (val == 1){
            System.out.println("Eliga si lo quiere de minuendo o sustraendo");
            System.out.println("[1]Dividendo");
            System.out.println("[2]Divisor");

            int zal = ValidarEntero();
            if (zal == 1){
                num1 = resultado;
                System.out.println("Eliga el Divisor");
                num2 = ValidarDouble();
            }else{
                num2 = resultado;
                System.out.println("Eliga el dividendo");
                num1 = ValidarDouble();
            }
        }else{
            System.out.println("Eliga el Dividendo");
            num1 = ValidarDouble();

            System.out.println("Elige el divisor");
            num2 = ValidarDouble();
        }

        return DividirDos(num1,num2);
    }

    public static double MenuMultiplicar(double resultado){
        double num1 = 0;
        int val = 0;

        if(resultado != 0){
            System.out.println("Si desea usar el numero que le dio antes escriba 1");
            val = ValidarEntero();
        }

        if (val == 1){
            System.out.println(resultado);
            num1 = resultado;
        }else{
            System.out.println("Eliga el primer numero");
            num1 = ValidarDouble();
        }

        System.out.println("Elige el segundo numero");
        double num2 = ValidarDouble();

        return MultiplicarDos(num1,num2);
    }
    public static double MenuRestar(double resultado){
        double num1 = 0;
        int val = 0;
        double num2 = 0;

        if(resultado != 0){
            System.out.println("Si desea usar el numero que le dio antes escriba 1");
            val = ValidarEntero();
        }

        if (val == 1){
            System.out.println("Eliga si lo quiere de minuendo o sustraendo");
            System.out.println("[1]Minuendo");
            System.out.println("[2]Sustraendo");

            int zal = ValidarEntero();
            if (zal == 1){
                num1 = resultado;
                System.out.println("Eliga el sustraendo");
                num2 = ValidarDouble();
            }else{
                num2 = resultado;
                System.out.println("Eliga el minuendo");
                 num1 = ValidarDouble();
            }
        }else{
            System.out.println("Eliga el minuyendo");
            num1 = ValidarDouble();

            System.out.println("Elige sustraendo");
            num2 = ValidarDouble();
        }


        return RestaDos(num1,num2);
    }
    public static double menuSumar(double resultado){
        double num1 = 0;
        int val = 0;

        if(resultado != 0){
            System.out.println("Si desea usar el numero que le dio antes escriba 1");
            val = ValidarEntero();
        }

        if (val == 1){
            System.out.println(resultado);
            num1 = resultado;
        }else{
            System.out.println("Eliga el primer numero");
            num1 = ValidarDouble();
        }

        System.out.println("Elige el segundo numero");
        double num2 = ValidarDouble();

        return SumaDos(num1,num2);
    }

    public static List<Double> MenuCuadratica(){
        System.out.println("Debe Escribir numeros enteros");

        System.out.println("De la forma x^2 + x + c = 0");
        System.out.println("Elige el numero que va a estar con el x^2");
        int a = ValidarEntero();
        System.out.println("Elige el numero que va a estar con el x");
        int b = ValidarEntero();
        System.out.println("Elige el numero que va a estar solo");
        int c = ValidarEntero();

        List<Integer> cuadra = Arrays.asList(a, b, c);

        List<Double> resultado  = Cuadratica(cuadra);

        return resultado;
    }
    public static List<Double> MenuSistemaDeEcuaciones(){
        System.out.println("Las 2 ecuaciones de la forma x + y = c");

        System.out.println("Debe escribir numeros enteros");

        System.out.println("Elige los numeros de la primera ecuacion");

        System.out.println("Elige el numero que va a estar con la x");
        int a = ValidarEntero();
        System.out.println("Elige el numero que va a estar con la y");
        int b = ValidarEntero();
        System.out.println("Elige el numero que va a estar solo");
        int c = ValidarEntero();

        System.out.println("Elige los numeros de la segunda ecuacion");

        System.out.println("Elige el numero que va a estar con la x");
        int d = ValidarEntero();
        System.out.println("Elige el numero que va a estar con la y");
        int e = ValidarEntero();
        System.out.println("Elige el numero que va a estar solo");
        int f = ValidarEntero();

        List<Integer> cuadra = Arrays.asList(a, b, c, d, e, f);
        List<Double> resultado = CalcSistemaDe2Ecuaciones(cuadra);
        return resultado;
    }
    public static void ImprimirList(List<Double> lista){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
    public static void ImprirDouble(double num){
        System.out.println(num);
    }

    public static void MenuGeometria(){
        double resultado = 0;

        System.out.println("Que geometria quiere usar:");
        System.out.println(("[1]Cuadrado "));
        System.out.println("[2]Rectangulo");
        System.out.println("[3]Circulo");
        System.out.println("[4]Esfera");
        System.out.println("[5]Cubo");
        System.out.println("[6]Cono");
        int eleccion = ValidarEntero();
        switch (eleccion) {
            case 1:
                resultado = MenuCuadrado();
                ImprirDouble(resultado);
                break;
            case 2:
                resultado = MenuRectangulo();
                ImprirDouble(resultado);
                break;
            case 3:
                resultado = MenuCirculo();
                ImprirDouble(resultado);
                break;
            case 4:
                resultado = MenuEsfera();
                ImprirDouble(resultado);
                break;
            case 5:
                resultado = MenuCubo();
                ImprirDouble(resultado);
                break;
            case 6:
                resultado = MenuCono();
                ImprirDouble(resultado);
                break;
            default:
                System.out.println(resultado);
        }
    }

    public static double MenuCono() {
        double resultado = 0;
        System.out.println("eliga el largo del radio");
        double num1 = ValidarDouble();

        System.out.println("Eliga el largo del largo");
        double num2 = ValidarDouble();

        System.out.println("ELiga lo que quiere hacer");
        System.out.println("[1]Diametro");
        System.out.println("[2]Area");

        int eleccion = ValidarEntero();

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

    public static double MenuCubo() {
        double resultado = 0;
        System.out.println("eliga el largo de un lado");
        double num = ValidarDoublePositivo();

        System.out.println("ELiga lo que quiere hacer");
        System.out.println("[1]Perimetro");
        System.out.println("[1]Area");
        System.out.println("[2]Volumen");

        int eleccion = ValidarEntero();

        switch (eleccion) {
            case 1:
                resultado = CalcPerCubo(num);
                break;
            case 2:
                resultado = CalcAreaCubo(num);
                break;
            case 3:
                resultado = CalcVolumenCubo(num);
                break;
        }
        return resultado;
    }

    public static double MenuEsfera() {
        double resultado = 0;
        System.out.println("eliga el radio");
        double num = ValidarDoublePositivo();

        System.out.println("ELiga lo que quiere hacer");
        System.out.println("[1]Area");
        System.out.println("[2]Volumen");

        int eleccion = ValidarEntero();

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


    public static double MenuRectangulo() {
        double resultado = 0;
        System.out.println("eliga el largo del primer lado");
        double num1 = ValidarDouble();

        System.out.println("Eliga el largo del segundo lado");
        double num2 = ValidarDouble();

        System.out.println("ELiga lo que quiere hacer");
        System.out.println("[1]Diametro");
        System.out.println("[2]Area");

        int eleccion = ValidarEntero();

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

    public static double MenuCirculo() {
        double resultado = 0;

        System.out.println("eliga el largo del radio");
        double num = ValidarDoublePositivo();

        System.out.println("ELiga lo que quiere hacer");
        System.out.println("[1]Diametro");
        System.out.println("[2]Area");

        int eleccion = ValidarEntero();

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

    public static double MenuCuadrado() {
        double resultado = 0;
        System.out.println("eliga el largo de un lado");
        double num = ValidarDoublePositivo();

        System.out.println("ELiga lo que quiere hacer");
        System.out.println("[1]Diametro");
        System.out.println("[2]Area");

        int eleccion = ValidarEntero();

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
    public static void Menu() {
        int eleccion = 1;
        while ((eleccion > 0) &&(eleccion<7)){
            System.out.println("Que desea hacer");
            System.out.println(("[1]Calcular cosas basicas"));
            System.out.println("[2]Calcular cosas de geometria");
            System.out.println("[3]Calcular cosas extras");
            System.out.println("[4]Calcular ecuacion cuadratica");
            System.out.println("[5]Calcular sistema de ecuaciones");
            System.out.println("[6]Calcular ecuacion de la recta");
            System.out.println("Si desea salir oprima cualquier otro numero");
           eleccion = ValidarEntero();
            switch (eleccion) {
                case 1:
                    MenuCalculoBasico();
                    break;
                case 2:
                    MenuGeometria();
                    break;
                case 3:
                    MenuCalcularEtc();
                case 4:
                    ImprimirList(MenuCuadratica());
                    break;
                case 5:
                    ImprimirList(MenuSistemaDeEcuaciones());
                    break;
                case 6:
                    MenuEcuacionDeLaRecta();
            }

        }
    }

    public static void MenuEcuacionDeLaRecta() {

        System.out.println("Elige el x1");
        double a = ValidarDouble();

        System.out.println("Elige y1");
        double b = ValidarDouble();

        System.out.println("Elige el x2");
        double c = ValidarDouble();

        System.out.println("Eliga el y2");
        double d = ValidarDouble();

        System.out.println(CalcEcuacionDeLaRecta(a,b,c,d));
    }

    public static void main(String[] args) {
        Menu();
    }
}