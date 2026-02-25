package Examen4y5;

import java.util.Arrays;

public class Usuario {
    private String nombre;
    private String email;
    private int edad;
    private String[] intereses;

    public Usuario(String nombre, String email, int edad, String[] intereses) {
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
        this.intereses = intereses;
    }

    public Usuario(String nombre, String email) {
        this(nombre, email, 18, new String[0]);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.endsWith("@gmail.com") || email.endsWith("@hotmail.es")) {
            this.email = email;
        } else {
            System.out.println("Correo no valido");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getIntereses(int i) {
        return intereses[i];
    }

    public void setIntereses(int i, String valor) {
        this.intereses[i] = valor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (edad != other.edad)
            return false;
        if (!Arrays.equals(intereses, other.intereses))
            return false;

        if (email == other.email) {
            return true;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario [nombre=" + nombre + ", email=" + email + ", edad=" + edad + ", intereses="
                + deArrayaEscrito() + "]";
    }

    public String deArrayaEscrito() {
        String arrayEntero = "";
        for (int i = 0; i < this.intereses.length; i++) {
            if (i == this.intereses.length - 1) {
                arrayEntero += this.intereses[i];
            } else {
                arrayEntero += this.intereses[i] + ", ";

            }
        }
        return arrayEntero;
    }

}
