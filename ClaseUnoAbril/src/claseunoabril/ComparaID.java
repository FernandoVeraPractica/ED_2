
package claseunoabril;

import java.util.Comparator;


public class ComparaID implements Comparator {
    
    public int compare(Object obj1, Object obj2){
        Socio sc1 = (Socio) obj1;
        Socio sc2 = (Socio) obj2;
        
        return sc1.id - sc2.id;
    }
}
