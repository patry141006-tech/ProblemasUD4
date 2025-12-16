package Problemas;

public class Empleados {
    private String nombre;
    private int edad;
    private double sueldo;
    private static String password;

    public Empleados(String nombre, int edad, double sueldo) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre es obligatorio");
        }

        if (edad < 18) {
            throw new IllegalArgumentException("La edad debe ser mayor o igual a 18");
        }

        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;

    }

    public static void setPassword(String nuevoPassword) {
        if (nuevoPassword == null || nuevoPassword.isEmpty()) {
            throw new IllegalArgumentException("El password no puede ser vacío");
        }
        password = nuevoPassword;
    }

    private static boolean passwordCorrecto(String pass) {
        return password != null && password.equals(pass);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser vacío");
        }
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 18) {
            throw new IllegalArgumentException("La edad debe ser mayor o igual a 18");
        }
        this.edad = edad;
    }

    public double getSueldo(String pass) {
        if (!passwordCorrecto(pass)) {
            throw new SecurityException("Password incorrecto");
        }
        return sueldo;
    }

    public void setSueldo(double sueldo, String pass) {
        if (!passwordCorrecto(pass)) {
            throw new SecurityException("Password incorrecto");
        }
        this.sueldo = sueldo;
    }

    public String getDatos(String pass) {
        if (!passwordCorrecto(pass)) {
            return "Acceso denegado: password incorrecto";
        }
        return "Nombre: " + nombre +
                ", Edad: " + edad +
                ", Sueldo: " + sueldo;
    }
}
