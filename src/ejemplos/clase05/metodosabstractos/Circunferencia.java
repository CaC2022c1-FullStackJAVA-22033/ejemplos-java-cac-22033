
package ejemplos.clase05.metodosabstractos;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Circunferencia extends FiguraGeometrica {
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }    

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }    
}
