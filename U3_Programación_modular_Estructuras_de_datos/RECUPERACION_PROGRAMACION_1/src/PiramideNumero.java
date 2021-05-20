import java.util.Scanner;

public class PiramideNumero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introducir el número de filas: ");
        int alt= sc.nextInt();

        //PIRAMIDE Con espacios

        /*int esp =alt-1;
        int pint = 1;

        for (int i = 0; i < alt; i++) {

            for (int j = 0; j < esp; j++) {
                System.out.print("-");
            }

            for (int k = 0; k < pint; k++) {
                System.out.print("*");
            }
            pint += 2;
            esp--;
            System.out.println("");
        }*/


        //PRIAMIDE Con filas y columnas

        /*int anch= (alt*2)-1;

        for (int i = 0; i < alt; i++) {

            for (int j = 0; j < anch; j++) {

                if(i+j>=alt-1 && j-i<=alt-1){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }*/

        //RELOJ DE ARENA Con filas y columnas

        for (int i = 0; i < alt; i++) {

            for (int j = 0; j < alt; j++) {

                if(i+j>=i*2 && i+j<=alt-1 ){
                    System.out.print("*");
                }else if (i+j>= alt-1 && i+j<= i*2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println("");
        }


    }


}
