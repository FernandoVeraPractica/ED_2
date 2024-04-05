
package claseunoabril;

import java.util.Comparator;


public class ComparaNombres implements Comparator{
    
    public int compare (Object obj1, Object obj2){
        Socio s1 = (Socio) obj1;
        Socio s2 = (Socio) obj2;
        
        return s1.nombre.compareTo(s2.nombre);
    }
    
}
