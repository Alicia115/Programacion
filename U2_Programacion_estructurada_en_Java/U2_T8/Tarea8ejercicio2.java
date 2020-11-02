import java.util.Scanner;

public class Tarea8ejercicio2 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        int edad,contador, mayor, suma, media;
        edad =0;
        contador =0;
        mayor =0;
        suma=0;
        media=0;


        while (edad>=0){
            System.out.println("Escribe ");
            edad= sc.nextInt();
            if (edad>=18){
                mayor++;
            }
            if (edad>=0){
                contador++;
                suma= suma + edad;
                media=suma/contador;
            }

        }
        System.out.println("La edad introducida es negativa.");
        System.out.println("Los alumnos mayores de edad son " +mayor);
        System.out.println("La suma de todas las edades es " +suma);
        System.out.println("La suma de todas las edades es " +media);



    }
}
