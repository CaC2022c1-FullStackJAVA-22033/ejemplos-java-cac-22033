package ejemplos.clase04;

public abstract class Vehiculo extends Object {

    private String patente;

    public Vehiculo(String patente) {
        super(); // Se invoca el constructor de Object
        this.patente = patente;
    }

    public void acelerar() {
        System.out.println("Acelerando...");
    }

    public String getPatente() {
        return patente;
    }
}
