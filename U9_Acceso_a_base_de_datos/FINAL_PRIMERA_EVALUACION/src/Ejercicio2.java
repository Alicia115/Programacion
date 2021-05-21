import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int base;
        int numero;

        do {
            System.out.print("Introduce base: ");
            base = sc.nextInt();
            System.out.print("Introduce número: ");
            numero = sc.nextInt();

            if(calculaExponente(base,numero)!=-1){
                System.out.println("Resultado: ");
                System.out.print(base+ " elevado a "+calculaExponente(base, numero) + " es "+numero+ ".");
                System.out.print(" El exponente es "+calculaExponente(base, numero)+ "\n");
            } else{
                System.out.println("No es una potencia exacta");
            }
        } while (base!=0);

    }

    public static int calculaExponente (int base, int numero){

        int resultado=1;
        int contador=0;

        while (resultado<=numero){
            resultado*=base;
            contador++;
            if (resultado==numero){
                return contador;
            }
        }
       return -1;
    }


}
