package Practic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class prueba {
    public static void main(String[] args) {
Pattern p = Pattern.compile("\\d+\\s*\\d+");
        List<String> cadenas= new ArrayList <>();
        cadenas.add("Pene");
        cadenas.add("Cono");
        cadenas.add("123");
        cadenas.add("604 151");
        cadenas.add("Pene de 123");
        cadenas.add("234vdf3");


        
        for(String cadena: cadenas){
            boolean b = p.asMatchPredicate().test(cadena);
            if(b){
                System.out.println(cadena);
            }
        }
    }

    public static void filtro(ArrayList<Integer> nums, FiltroNumero fil) {
        for (int i = 0; i < nums.size(); i++) {
            if (fil.aceptar(nums.get(i))) {
                System.out.println(nums.get(i));
            }
        }
    }
}
