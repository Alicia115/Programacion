import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Tarea8ejercicio10 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        int i,num;

        System.out.println("Dime un numero, y haremos su tabla de multiplicar");
        num= sc.nextInt();

        while (num<1 || num>10){
            System.out.println("Tiene que ser un numero del 1 al 10");
            System.out.println("Dime un numero, y haremos su tabla de multiplicar");
            num= sc.nextInt();
        }


        for (i=1; i<=10; i++){
            System.out.println(i+ " x " +num+ " = " +i*num);
        }
        System.out.println("");
    }
}
