import java.util.Scanner;

public class Tarea8Bejercicio8 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        int  i, j, hora_inicial, hora_final,hora_minimo, hora_maximo, dias, dia_maximo=0, dia_minimo=0 ;
        String  dia_inicial, dia_final;
        hora_minimo=0;
        hora_maximo=0;
        dias=0;

        System.out.println("Escribe el dia inicial de la semana: ");
        dia_inicial= sc.nextLine();
        System.out.println("Escribe la hora inical de ese dia inicial de la semana: ");
        hora_inicial= sc.nextInt();
        sc.nextLine();
        System.out.println("Escribe el dia final de la semana: ");
        dia_final= sc.nextLine();
        System.out.println("Escribe la hora final de ese dia final de la semana: ");
        hora_final= sc.nextInt();

        switch (dia_inicial){
            case "lunes": dia_minimo = 1; break;
            case "martes": dia_minimo = 2; break;
            case "miercoles": dia_minimo = 3; break;
            case "jueves": dia_minimo = 4; break;
            case "viernes": dia_minimo = 5; break;
            case "sabado": dia_minimo = 6; break;
            case "domingo": dia_minimo = 7; break;
            default:
                System.out.println("Tiene que ser dias de lunes a domingo");
        }

        switch (dia_final){
            case "lunes": dia_maximo = 1; break;
            case "martes": dia_maximo = 2; break;
            case "miercoles": dia_maximo = 3; break;
            case "jueves": dia_maximo = 4; break;
            case "viernes": dia_maximo = 5; break;
            case "sabado": dia_maximo = 6; break;
            case "domingo": dia_maximo = 7; break;
            default:
                System.out.println("Tiene que ser dias de lunes a domingo");
        }


        if ((dia_minimo<=dia_maximo) && (dia_minimo>=1) && (dia_maximo<=7)){
            dias=(dia_maximo-dia_minimo);
            dias++;
        } else {
            System.out.println("Tienen que ser dias de la misma semana");
        }



        if ((hora_inicial >=1) && (hora_final<=24)){
            for (i=hora_inicial; i<24; i++){
                hora_minimo++;
            }

            for (j=1; j<=hora_final; j++){
                hora_maximo++;
            }
        }

        if (dias>2){
            dias= (dias-2)*24;
            hora_minimo= 24-hora_minimo;
            dias=dias+hora_minimo+hora_maximo;
        }

        if (dias==2){
            hora_inicial=24-hora_inicial;
            dias=hora_inicial+hora_final;
        }

        if (dias==1){
            hora_inicial=hora_final-hora_inicial;
            dias=hora_inicial;
        }

        System.out.println("De los dias y las horas introducidas hay un total de " +dias+ " horas");
    }
}
