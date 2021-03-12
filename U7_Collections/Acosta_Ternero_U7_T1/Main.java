public class Main {
    public static void main(String[] args) {

        Alumnos alumno1 = new Alumnos("Alicia", "Acosta", "25487896W", 14,"4ºC");
        Alumnos alumno2 = new Alumnos("Gonzalo", "Perez", "25487896P", 15,"3ºD");
        Alumnos alumno3 = new Alumnos("Alvaro", "Jimenez", "25487896L", 13,"1ºC");
        Alumnos alumno4 = new Alumnos("Angela", "Segobia", "25487896M", 16,"2ºC");
        Alumnos alumno5 = new Alumnos("Sergio", "Yanes", "25486596N", 19,"2ºC");
        Alumnos alumno6 = new Alumnos("Pedro", "Garcia", "25412896A", 20,"3ºA");
        Alumnos alumno7 = new Alumnos("Raul", "Lafuente", "25487896H", 22,"2ºB");
        Alumnos alumno8 = new Alumnos("Oscar", "Carmona", "25487896K", 24,"4ºB");
        Alumnos alumno9 = new Alumnos("Iñaki", "Cuevas", "25487896B", 87,"4ºB");
        Alumnos alumno10 = new Alumnos("Ruben", "Ballesta", "25489896A", 96,"2ºB");

        Instituto Alixar = new Instituto("Alixar");

        Alixar.addAlumnoUnidad("4ºB",alumno8);
        Alixar.addAlumnoUnidad("2ºC", alumno4);
        Alixar.addAlumnoUnidad("2ºC", alumno5);
        Alixar.addAlumnoUnidad("2ºB", alumno10);
        Alixar.addAlumnoUnidad("2ºB", alumno7);

        Alixar.cargarAlumnos();
        Alixar.guardarAlumnos();
        Alixar.mostrarAlumnosUnidad("2ºC");

        System.out.println(Alixar);


    }
}
