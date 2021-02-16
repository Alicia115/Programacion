public  abstract class Vehiculos {

    protected String matricula;
    protected Conductor conductor;
    protected int carga_max;

    public Vehiculos(String matricula, Conductor conductor, int carga_max) {
        this.matricula = matricula;
        this.conductor = conductor;
        this.carga_max = carga_max;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public int getCarga_max() {
        return carga_max;
    }

    public void setCarga_max(int carga_max) {
        this.carga_max = carga_max;
    }

    @Override
    public String toString() {
        return
                " Matricula: " + matricula + "\n" +
                " Conductor: " + conductor + "\n" +
                " Carga maxima: " + carga_max + "\n";
    }
}
