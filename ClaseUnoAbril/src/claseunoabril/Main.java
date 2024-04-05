/* 
Cambiar el criterio de ordenacion de socio para que ordene por edades ascendentes y si tienen la misma edad que vaya antes el que tiene
un número de socio menor.

Ordenar la tabla de Socios por orden alfabético de nombres invertido.
*/

package claseunoabril;

import java.util.Arrays;

public class Main {

    
    public static void main(String[] args) {

        Socio socio1 = new Socio(1, "Javier", "1962-10-30");
        Socio socio2 = new Socio(2, "Laura", "1965-02-15");
        Socio socio3 = new Socio(3, "Mauricio", "1989-10-15");
        Socio socio4 = new Socio(4, "Pepe", "1989-10-15");

        System.out.println(socio1);
        System.out.println(socio2);
        System.out.println(socio3);
        
        System.out.println(socio1.compareTo(socio2));
        System.out.println(socio2.compareTo(socio3));
        System.out.println(socio3.compareTo(socio1));
        
        
        Socio[] tablaSocios = new Socio[4];
        
        tablaSocios[0] = socio2;
        tablaSocios[1] = socio3;
        tablaSocios[2] = socio1;
        tablaSocios[3] = socio4;
        
        System.out.println("Tabla sin ordenar:");
        System.out.println(Arrays.toString(tablaSocios));
        System.out.println("-------------------------------------------------------------");
        Arrays.sort(tablaSocios);
        
        System.out.println("Tabla ordenada con compareTo de la clase Socio (por id)");
        System.out.println(Arrays.toString(tablaSocios));
        
        ComparaEdades comparaEdadesSocios = new ComparaEdades();
        
        System.out.println("-------------------------------------------------------------");
        System.out.println("Tabla ordenada con compare de la clase ComparaEdades");
        Arrays.sort(tablaSocios, comparaEdadesSocios);
        
        System.out.println(Arrays.toString(tablaSocios));
        
        ComparaNombres comparaNombresSocios = new ComparaNombres();
        
        System.out.println("-------------------------------------------------------------");
        System.out.println("Tabla ordenada con compare de la clase ComparaNombres");
        Arrays.sort(tablaSocios, comparaNombresSocios);
        
        System.out.println(Arrays.toString(tablaSocios));
        
        System.out.println("--------------------------------------------------");
        System.out.println("Tabla ordenada con ComparaNombres reversed");
        Arrays.sort(tablaSocios, comparaNombresSocios.reversed());
        System.out.println(Arrays.toString(tablaSocios));
        
        // Ejercicio Interfaces de comparación
        
        Lista lista = new Lista();
        
        lista.insertarFinal(socio1);
        lista.insertarFinal(socio2);
        lista.insertarFinal(socio3);
        lista.insertarFinal(socio4);
        
        System.out.println("Orden natural por la edad de manera creciente");
        Arrays.sort(lista.tabla);
        System.out.println(Arrays.deepToString(lista.tabla));
        
        System.out.println("Orden alternativo por id creciente.");
        ComparaID comparador = new ComparaID();
        Arrays.sort(lista.tabla, comparador);
        System.out.println(Arrays.deepToString(lista.tabla));
    }
    
}
