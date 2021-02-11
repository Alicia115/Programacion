package U5_T1_Ej1;

public class Main {
    public static void main(String[] args) {

   Edicio_Juego_Deportivos edicion = new Edicio_Juego_Deportivos(2004, "Cartuja");



     Pais pais1 = new Pais("Dinamarca", 8);
     Pais pais2 = new Pais("Noruega", 5);
     Pais pais3 = new Pais("España", 34);

    Atletas atleta1 = new Atletas("Diego", 27,"Prueba Atletica");
    Atletas atleta2 = new Atletas("Sara", 32,"Prueba Atletica");
    Judokas judoka1 = new Judokas("Sergio", 23, 70);
    Judokas judoka2 = new Judokas("Rosa", 28, 65);
    Jugadores_baloncesto jugador1 = new Jugadores_baloncesto("Raquel", 21,81.5);
    Jugadores_baloncesto jugador2 = new Jugadores_baloncesto("Pepe", 36,82.9);


    edicion.addpaises(pais1);
    edicion.addpaises(pais2);
    edicion.addpaises(pais3);

    edicion.mostrarPaises();
        System.out.println(edicion);



    }
}
