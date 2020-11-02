import java.util.Scanner;

public class Tarea8ejercicio9 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        int num, contador, mayor, id;
        mayor=0;
        contador=0;
        num=0;
        id=0;

        System.out.println("Dime la altura de los arboles en cms");


        while (num>-1){
            num= sc.nextInt();

            if (num>-1){
                System.out.println(contador+ " - " +num);
            }

            if (num>mayor){
                mayor=num;
                id=contador;
            }
            contador++;
        }
        System.out.println("El arbol más grande es el número " +id+ " con " +mayor+ " cm");
    }
}
