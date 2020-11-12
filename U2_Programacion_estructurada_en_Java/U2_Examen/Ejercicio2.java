import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        long num, recorrido, par=0, impar=0, suma=0, sumaimp=0;


        System.out.println("Por favor, introduzca un número entero positivo (minimo 2 digitos):");
        num= sc.nextInt();

        while (num<2){
            System.out.println("El numero tiene que ser minimo de 2 digitos");
            num= sc.nextInt();
        }

        do{

            recorrido= (long)Math.log10(num);
            System.out.println(recorrido);
            num= (long) (num- Math.pow(10,recorrido));
            System.out.println(num);

            if (num%2==0){
                par=(num*10)+num;
                suma=suma+par;
            }
            if (num%2==1){
                impar=(num*10)+num;
                sumaimp=sumaimp+impar;

            }
        } while (num>0);

        System.out.println("Los numeros pares son " +par);
        System.out.println("Los numeros impares son " +impar);
        System.out.println("Suma de los digitos pares" +suma);
        System.out.println("Suma de los digitos pares" +sumaimp);
    }
}
