package EjercicioMinecraft;

public class Main {

    public static void main(String[] args) {

        Minecraft minecraft = new Minecraft();

        Cristal cristal1 = new Cristal("Monit", 300, 109, 56, CristalTipo.TRANSPARENTE);
        Cristal cristal2 = new Cristal("Viad", 560, 80, 73, CristalTipo.TRANSLUCIDO);
        Metal metal1 = new Metal("Metalito", 798, 45, 87, true);
        Metal metal2 = new Metal("Metalalo", 543, 65, 29, false);
        Rocas roca1 = new Rocas("Roquita", 213, 12, 67, 89);
        Rocas roca2 = new Rocas("Rocasa", 763, 90, 87, 12);
        Sierra sierra1 = new Sierra ("sierita", 234, 89, 34, 12);
        Sierra sierra2 = new Sierra ("sierrucha", 123, 36, 72, 67);
        Pico pico1 = new Pico("picaso", 456, 12, 87, 56);
        Pico pico2 = new Pico("picoto", 647, 99, 11, 17);

        minecraft.addMaterial(cristal1);
        minecraft.addMaterial(cristal2);
        minecraft.addMaterial(metal1);
        minecraft.addMaterial(metal2);
        minecraft.addMaterial(roca1);
        minecraft.addMaterial(roca2);
        minecraft.addMaterial(sierra1);
        minecraft.addMaterial(sierra2);
        minecraft.addMaterial(pico2);
        minecraft.addMaterial(pico1);

        System.out.println(minecraft + "\n");
        System.out.println(cristal1.MezclarConMaterial(metal1)+ "\n");
        System.out.println(roca1.MezclarConMaterial(roca2)+ "\n");
        System.out.println(metal2.MezclarConMaterial(sierra2)+ "\n");

        pico1.Deshacer(sierra2);
        pico2.Deshacer(sierra2);
        pico1.Hacer(cristal2);
        pico2.Hacer(roca2);
        pico2.Hacer(pico1);
        pico2.Hacer(pico1);
        pico1.Deshacer(roca1);
        pico1.Deshacer(roca1);
        pico2.Deshacer(roca1);
        pico2.Deshacer(sierra1);
        pico2.Deshacer(sierra1);

        System.out.println(minecraft+ "\n");

        minecraft.borrarMaterialSinMasa();

        minecraft.mostrarEstado();



    }
}
