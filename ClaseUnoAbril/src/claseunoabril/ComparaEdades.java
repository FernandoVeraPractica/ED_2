
package claseunoabril;

import java.util.Comparator;


public class ComparaEdades implements Comparator{
    
    @Override
    public int compare(Object objeto1, Object objeto2){
        Socio socio1 = (Socio) objeto1;
        Socio socio2 = (Socio) objeto2;
        
        return socio1.edad()- socio2.edad();
    }
    
}
