import java.util.Scanner;

public class Tarea8Bejercicio3 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        int num, i, n1, n2, temporal;
        n1=0;
        n2=1;

        System.out.println("Escribe hasta donde llegamos con la lista de fibonacci");
        num= sc.nextInt();

        System.out.print(n1+ "," +n2 +",");

        for(i=1; i<=num; i++){

                System.out.print(n1+n2+ ",");
                temporal=n1+n2;
                n1=n2;
                n2=temporal;
        }

    }
}
