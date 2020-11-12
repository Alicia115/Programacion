import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int cargo, civil;
        long viajes;
        double sueldo, dietas, bruto=0, retencion=0;



        System.out.println("Indica el cargo que tiene en la empresa (opcion 1, 2 o 3)");
        System.out.println("1 - Prog. junior");
        System.out.println("2 - Prog. senior");
        System.out.println("3 - Jefe de proyecto");
        cargo= sc.nextInt();
        while ((cargo>3) || (cargo<1)){
            System.out.println("Tiene que elegir una de las opciones del cargo que se ofrecen");
            cargo= sc.nextInt();
        }

        System.out.println("Indica su estado civil (opcion 1 o 2");
        System.out.println("1 - Soltero");
        System.out.println("2 - Casado");
        civil= sc.nextInt();
        while ((civil>2) || (civil<1)){
            System.out.println("Tiene que elegir una de las opciones del estado civil que se ofrecen");
            civil= sc.nextInt();
        }

        System.out.println("Introduce los dias que has estado de viaje visitando clientes");
        viajes= sc.nextLong();
        dietas=viajes*30;

      /*  switch (cargo){
            case 1: sueldo = 950;
                System.out.println("Sueldo base           " +sueldo);
                System.out.println("Dietas ( "+viajes+ " viajes)    "+(dietas));
                break;
            case 2: sueldo =1200;
                System.out.println("Sueldo base           1200");
                System.out.println("Dietas ( "+viajes+ " viajes)    "+viajes*30);
                break;
            case 3: sueldo =1600;
                System.out.println("Sueldo base           1600");
                System.out.println("Dietas ( "+viajes+ " viajes)    "+viajes*30);
                break;
        }
       */

        if (cargo==1){
            sueldo=950;
            System.out.println("Sueldo base           " +sueldo);
            System.out.println("Dietas ( "+viajes+ " viajes)    "+(dietas));
            System.out.println("");

            bruto=sueldo+dietas;

            if (civil==1){
                retencion= (bruto*25)/100;
                System.out.println("Sueldo bruto          " +bruto);
                System.out.println("Retebción IRP (25%)   "+retencion);
                System.out.println("Sueldo neto           "+(bruto-retencion));
            }

            if (civil==2){
                retencion= (bruto*20)/100;
                System.out.println("Sueldo bruto          " +bruto);
                System.out.println("Retebción IRP (25%)   "+retencion);
                System.out.println("Sueldo neto           "+(bruto-retencion));
            }
        }

        if (cargo==2){
            sueldo=1200;
            System.out.println("Sueldo base           " +sueldo);
            System.out.println("Dietas ( "+viajes+ " viajes)    "+(dietas));
            System.out.println("");

            bruto=sueldo+dietas;

            if (civil==1){
                retencion= (bruto*25)/100;
                System.out.println("Sueldo bruto          " +bruto);
                System.out.println("Retebción IRP (25%)   "+retencion);
                System.out.println("Sueldo neto           "+(bruto-retencion));
            }

            if (civil==2){
                retencion= (bruto*20)/100;
                System.out.println("Sueldo bruto          " +bruto);
                System.out.println("Retebción IRP (25%)   "+retencion);
                System.out.println("Sueldo neto           "+(bruto-retencion));
            }

            if (cargo==3){
                sueldo=1600;
                System.out.println("Sueldo base           " +sueldo);
                System.out.println("Dietas ( "+viajes+ " viajes)    "+(dietas));
                System.out.println("");

                bruto=sueldo+dietas;

                if (civil==1){
                    retencion= (bruto*25)/100;
                    System.out.println("Sueldo bruto          " +bruto);
                    System.out.println("Retebción IRP (25%)   "+retencion);
                    System.out.println("Sueldo neto           "+(bruto-retencion));
                }

                if (civil==2){
                    retencion= (bruto*20)/100;
                    System.out.println("Sueldo bruto          " +bruto);
                    System.out.println("Retebción IRP (25%)   "+retencion);
                    System.out.println("Sueldo neto           "+(bruto-retencion));
                }
            }
        }




    }
}
