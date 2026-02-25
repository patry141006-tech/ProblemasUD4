package Examen4y5;

public class Test {
    public static void main(String[] args) {
        String[] intere= new String [2];
        intere[0]= "pitos";
        intere[1]= "flautas"; 
        Usuario us= new Usuario("juan", "juan@gmail.com", 18, intere );
        System.out.println(us.toString());
    }
}
