package ejemplos.clase04;

public class Auto extends Vehiculo {

    private boolean tieneAire;

    public Auto(boolean tieneAire, String patente) {
        super(patente); // Se invoca el constructor de Vehiculo
        this.tieneAire = tieneAire;
    }
    
    

    public boolean tieneAire() {
        return tieneAire;
    }
}
