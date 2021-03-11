package Examemenes.examen_collections;

public class Main {
    public static void main(String[] args) {

      /*  Medicion medicion = new Medicion(38,40,32);
        Medicion medicion2 = new Medicion(42,29,25);
        Medicion medicion3 = new Medicion(36,32,20);
        Medicion medicion4 = new Medicion(40,34,30);
        Medicion medicion5 = new Medicion(37,38,28);*/

        Coordenadas coordenada = new Coordenadas(56,45);

        EstacionMeteorologica station = new EstacionMeteorologica("src/Examemenes/examen_collections/datos.dat", coordenada);

        /*station.addMedicion(medicion);
        station.addMedicion(medicion2);

        station.buscaMedicion(medicion3);
*/
        station.guardarFichero("src/Examemenes/examen_collections/datos.dat");

        System.out.println(station);
    }
}
