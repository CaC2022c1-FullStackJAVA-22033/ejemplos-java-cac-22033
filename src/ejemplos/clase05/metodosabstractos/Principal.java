
package ejemplos.clase05.metodosabstractos;

import java.util.ArrayList;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Principal {

   
    public static void main(String[] args) {
        ArrayList<FiguraGeometrica> lista = new ArrayList<>();
        
        lista.add( new Rectangulo(2, 5));
        lista.add( new Circunferencia(1));
        lista.add( new TrianguloEquilatero(4));
        lista.add( new Rectangulo(4, 3));
        lista.add( new Circunferencia(2));        
        
        for (FiguraGeometrica f : lista) {
            if( f instanceof Circunferencia ) {
                System.out.println("Radio: " + ((Circunferencia) f).getRadio());
            }
            System.out.println("Area: " + f.area());
        }
    }

}
