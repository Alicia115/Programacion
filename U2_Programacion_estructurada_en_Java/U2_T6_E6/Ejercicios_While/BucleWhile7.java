import java.util.Scanner;

public class BucleWhile7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1,n2;
        n1=0;

        System.out.print("Introduce el numero para representar asteriscos");
        n2 = sc.nextInt();

        while(n1++<n2){
            System.out.print("*");
        }

    }
}
