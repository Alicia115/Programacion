import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        /*Scanner sc = new Scanner(System.in);
        String texto;
        System.out.println("Dame el texto");
        texto= sc.nextLine();*/

        String texto = "<html><head> <title> <head><body> <!--- Cuerpo --> <h1>Hola Mundo </h1><!-- Fin --> </body> </html>";

        String cadena="";
        String comentario = "<!---";


        for (int i = 0; i < texto.length(); i++) {

          //  System.out.print(texto.charAt(i));
            if(texto.charAt(i)!='!' && texto.charAt(i)!='-'){
                cadena+= texto.charAt(i);
            }
        }

        System.out.println(cadena);







    }
}
