import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, n, quitarPorDetras, quitarPorDelante, n1,n2;
        int potencita, posicionDigito, pegarAtras, pegarAlante, pegar;
        System.out.println("Dame un numero que estoy hasta el coño");
        num = sc.nextInt();

        /*System.out.println("Voltea numero");
        System.out.println(voltea(num));
        System.out.println("Es capicua?");
        System.out.println(esCapicua(num));
        System.out.println("Es primo?");
        System.out.println(esPrimo(num));
        System.out.println("Contador digitos");
        System.out.println(digitos(num));
        System.out.println("Siguiente primo");
        System.out.println(siguientePrimo(num));
        System.out.println("Dame la posicion del numero que quieres sacar");
        n= sc.nextInt();
        System.out.println(digitoN(num,n));
        System.out.println("Dame la exposicion y te doy toa la potensia pa tu carro hase");
        potencita= sc.nextInt();
        System.out.println(potencia(num,potencita));*/
      /*  System.out.println("Dame el numero y te dire su posicion");
        posicionDigito= sc.nextInt();
        System.out.println(posicionDeDigito(num,posicionDigito));*/
        /*System.out.println("Dame el numero de digitos que quieres quitar");
        quitarPorDetras = sc.nextInt();
        System.out.println(quitaPorDetras(num,quitarPorDetras));*/
        /*System.out.println("Dame el numero de digitos que quieres quitar");
        quitarPorDelante = sc.nextInt();
        System.out.println(quitaPorDelante(num,quitarPorDelante));*/
        /*System.out.println("Dame el numero que quieres pegar atras");
        pegarAtras= sc.nextInt();
        System.out.println(pegaPorDetras(num,pegarAtras));*/
        /*System.out.println("Dame el numero que quieres pegar delante");
        pegarAlante= sc.nextInt();
        System.out.println(pegaPorDelante(num,pegarAlante));*/
      /*  System.out.println("Dame el numero que quieres pegar");
        pegar= sc.nextInt();
        System.out.println(juntaNumeros(num,pegar));*/
        System.out.println("Dame la posicion inicial y final");
        n1= sc.nextInt();
        n2= sc.nextInt();
        System.out.println(trozoDeNumero(num,n1,n2));


    }

    public static int voltea(int num){
        int resto, invertido =0;

        while (num>0){

            resto= num%10;
            invertido= (invertido*10) +resto;
            num = num/10;
        }
        return invertido;
    }

    public static boolean esCapicua (int num){

        if(num == voltea(num)){
            return true;
        } else{
            return false;
        }

    }

    public static boolean esPrimo (int num){

        for (int i = 2; i < num; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static int siguientePrimo(int num){

        while (true){

            num++;

            if(esPrimo(num)){
                return num;
            }
        }
    }

    public static int digitos(int num){

        int contador=0;

        while (num>0){
            contador ++;
            num = num/10;
        }

        return contador;
    }

    public static int potencia(int num, int potencia){

        int resultado=1;

        for (int i = 0; i < potencia; i++) {
            resultado*=num;
        }

        return resultado;
    }

    public static int digitoN(int num, int n){

        int resto=0;
        int numerito = voltea(num);

        if(n>=0 && n< digitos(numerito)){

            for (int i = 0; i < digitos(num); i++) {

                resto=numerito%10;

                if(i==n){

                    return resto;
                }

                numerito = numerito/10;
            }
        }

        return -1;
    }

    public static int posicionDeDigito (int num, int n){

        int resto=0;

        for (int i = digitos(num)-1; i >=0; i--) {

            resto= num%10;

            if(n==resto){
                return i;
            }
            num = num/10;
        }
        return -1;
    }

    public static int quitaPorDetras (int num, int n){

        int resto=0;

        for (int i = 0; i < n; i++) {
            resto = num%10;
            num = num/10;
        }
        return num;
    }


    public static int quitaPorDelante (int num, int n){

        int resto=0;
        num= voltea(num);

        for (int i = 0; i < n; i++) {
            resto =num%10;
            num = num/10;
        }

        num = voltea(num);
        return num;
    }


    public static int pegaPorDetras (int num, int n){

        int resultado=0, resto=0, n2=voltea(n);

        for (int i = 0; i < digitos(n); i++) {

            resto = n2%10;
            num = num*10;
            resultado= num+resto;
            n2 = n2/10;
            num = resultado;
        }
        return resultado;
    }


    public static int pegaPorDelante(int num, int n){
        int numero = voltea(num);
        int resto =0;
        int resultado=0;

        while(n>0) {
            resto = n%10;
            numero = numero*10;
            resultado = numero+resto;
            n = n/10;
            numero = resultado;
        }
        return voltea(resultado);

    }


    public static int trozoDeNumero(int num, int n, int n2){

        int resultado=0, resto=0, numero = voltea(num);

        for (int i = 0; i < digitos(num); i++) {

            resto = numero%10;

           if(i>=n && i<=n2){
               resultado=(resultado*10)+resto;
           }
            numero/=10;
        }

        return resultado;
    }


    public static int juntaNumeros(int num, int n){

        return pegaPorDetras(num,n);
    }







}
