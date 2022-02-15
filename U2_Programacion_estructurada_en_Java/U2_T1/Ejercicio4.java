import java.util.Scanner;

public class Ejercicio4 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        int min,seg,hora, mas, i;


        System.out.println("Escribe hora (entre 0 y 24)");
        hora= sc.nextInt();
        while ((hora<0) || (hora>24)){
            System.out.println("Escribe hora (entre 0 y 24)");
            hora= sc.nextInt();
        }

        System.out.println("Escribe minutos (entre 0 y 60)");
        min= sc.nextInt();
        while ((min<0) || (min>60)){
            System.out.println("Escribe minutos (entre 0 y 60)");
            min= sc.nextInt();
        }

        System.out.println("Escribe segundos (entre 0 y 60)");
        seg= sc.nextInt();
        while ((seg<0) || (seg>60)){
            System.out.println("Escribe segundos (entre 0 y 60)");
            seg= sc.nextInt();
        }

        System.out.println("Escribe segundos a aumentar (mayor que cero)");
        mas= sc.nextInt();
        while (mas<=0){
            System.out.println("Escribe segundos a aumentar (mayor que cero)");
            mas= sc.nextInt();
        }

        System.out.println("Aumentando la hora...");

        for ( i=1 ; i<=mas ; i++) {
            seg++;
            if (seg>=60){
                min++;
                seg=0;
            }
            if (min >=60){
                hora++;
                min=0;
            }
            if (hora >=24){
                hora=0;
            }

            if (hora>9){
                System.out.print(hora+ ":");
            } else{
                System.out.print("0" +hora+ ":");
            }

            if (min>9){
                System.out.print(min+ ":");
            } else{
                System.out.print("0" +min+ ":");
            }

            if (seg>9){
                System.out.println(seg+ ":");
            } else{
                System.out.println("0" +seg);
            }

        }
    }
}
