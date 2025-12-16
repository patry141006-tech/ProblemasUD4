import Problemas.Empleados;

public class App {
    public static void main(String[] args)  {
        Empleados.setPassword("1234");
        Empleados Empleado1 = new Empleados("Juan", 76, 1200);
        Empleados Empleado2 = new Empleados("Ana", 26, 1900);
        System.out.println(Empleado1.getSueldo("1234"));
        System.out.println(Empleado1.getDatos("1234"));
        System.out.println(Empleado2.getDatos("1234"));

    }
}
