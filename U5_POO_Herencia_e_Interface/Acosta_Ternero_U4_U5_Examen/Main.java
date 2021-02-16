import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Prendas prenda1 = new Prendas(26.54, 20, "Pantalón",100001);
        Prendas prenda2 = new Prendas(35.25, 10, "Falda",100002);
        Prendas prenda3 = new Prendas(13.57, 25, "Blusa",100003);
        Prendas prenda4 = new Prendas(26.00, 15, "Leggins",100004);
        Prendas prenda5 = new Prendas(36.54, 10, "Camiseta",100005);
        Prendas prenda6 = new Prendas(16.54, 18, "Jersey",100006);


        Cajas caja1 = new Cajas(20005);
        Cajas caja2 = new Cajas(20006);
        Cajas caja3 = new Cajas(20007);
        Cajas caja4 = new Cajas(20008);

        prendaColgadas prendaColgada1 = new prendaColgadas(07.25);
        prendaColgadas prendaColgada2 = new prendaColgadas(07.25);
        prendaColgadas prendaColgada3 = new prendaColgadas(07.25);

        Conductor conductor1 = new Conductor("Pepe", "Perez", 56874123);
        Conductor conductor2 = new Conductor("Sara", "Rodriguez", 56874512);
        Conductor conductor3 = new Conductor("Enrique", "Sanchez", 78874189);

        CamionPerchas camionpercha1 = new CamionPerchas("2145DGJ",conductor1, 50);
        CamionPerchas camionpercha2 = new CamionPerchas("5763DDF",conductor2, 50);

        CamionCajas camioncajas1 = new CamionCajas("4785KJH", conductor1, 65);
        CamionCajas camioncajas2 = new CamionCajas("4685KLO", conductor3, 65);

        caja1.addprenda(prenda1);
        caja1.addprenda(prenda2);
        caja2.addprenda(prenda3);
        caja3.addprenda(prenda4);
        caja4.addprenda(prenda5);
        caja4.addprenda(prenda6);

        camioncajas1.addcaja(caja1);
        camioncajas1.addcaja(caja2);
        camioncajas2.addcaja(caja3);

        camionpercha1.addPrendaColgada(prendaColgada1);
        camionpercha1.addPrendaColgada(prendaColgada2);
        camionpercha2.addPrendaColgada(prendaColgada3);

        prenda1.devolver(prenda1);



        System.out.println(camioncajas1);
        System.out.println(camioncajas2);
        System.out.println(camionpercha1);
        System.out.println(camionpercha2);

        camioncajas1.descargar();

    }
}
