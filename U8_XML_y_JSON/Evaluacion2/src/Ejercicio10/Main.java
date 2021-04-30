package Ejercicio10;

public class Main {

    public static void main(String[] args) {

        Profesor prof1 = new Profesor("Pedro", "2577455L", "profesor", 5);
        Profesor prof2 = new Profesor("Paca", "2577455P", "profesor", 5);
        Profesor prof3 = new Profesor("Andrea", "2577455K", "profesor", 5);
        Profesor prof4 = new Profesor("Juan", "2577455S", "profesor", 5);
        Profesor prof5 = new Profesor("Paco", "2577455A", "profesor", 5);
        Profesor prof6 = new Profesor("Poli", "2577455X", "profesor", 5);

        Departamento depart = new Departamento(5);

        Instituto insti = new Instituto("Alixar", 458,"profesores.dat");

        insti.addDepartamento(depart);
        insti.guardar("profesores.dat");
        depart.addProfesor(prof1);
        insti.guardar("profesores.dat");

    }
}
