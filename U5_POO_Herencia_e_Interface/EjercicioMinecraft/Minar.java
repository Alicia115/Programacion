package EjercicioMinecraft;


public interface Minar {

    default Materiales Hacer(Materiales material) {

        material.masa+= 100;

        return material;
    }

    default Materiales Deshacer(Materiales material) {

        material.masa-=100;

        return material;
    }

}
