
package ejemplos.clase01;

import java.util.Scanner;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Para leer por consola, necesitamos un objeto
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingresá tu nombre: ");
        String nombre = input.nextLine();
        System.out.print("Ingresá tu año de nacimiento: ");
        int anioNac = Integer.parseInt(input.nextLine());
        
        int edadEstimada = 2022 - anioNac;
        
        System.out.println("Hola " + nombre + " y tu edad podría ser " + edadEstimada);
        
        
        
        // Cómo declarar variables
        /*int y;
        y = 4;
        int x = 5;
        double precio = 14.2;
        boolean esDeDia = true;
        char letra = 'A';    
        String nombre = "Carlos";*/
        
        
        // Salidas con 'println'
        /*
            System.out.println(3 + 3);
            System.out.println("4" + 4);
            System.out.println("Hola mundo");
        */
    }
}
