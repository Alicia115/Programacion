import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

       int alt = 6;
       int alt2 = 2;
       int anch = (alt*2)-1;
       int anch2= (alt2*2)-1;


        for (int i = 0; i < alt; i++) {

            for (int j = 0; j < anch; j++) {

                if (i+j>= alt-1 && j-i<=alt-1){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }

                /*if(j==anch-1 && i== alt-1){
                    for (int k = 0; k < alt2; k++) {
                        for (int l = 0; l < anch2; l++) {
                            if (k+l>= alt2-1 && l-k<=alt2-1){
                                System.out.print("*");
                            } else{
                                System.out.print(" ");
                            }
                        }
                        System.out.println("");
                    }
                }*/

            }
            System.out.println("");

        }



        for (int k = 0; k < alt2; k++) {
            for (int l = 0; l < anch2; l++) {
                if (k+l>= alt2-1 && l-k<=alt2-1){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }


    }


}
