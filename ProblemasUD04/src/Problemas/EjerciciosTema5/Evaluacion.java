package Problemas.EjerciciosTema5;

public class Evaluacion {
    private int eval1, eval2, eval3;
    //Otros elementos
}

class Alumno{
    private String nombre;
    private Evaluacion e;
    private double notaGlobal;

    public Alumno(String nombre, Evaluacion e){
        this.nombre=nombre;
        this.e=e;
    }

    public Evaluacion getEvaluacion (){return e;}
    public void setEvaluacion (Evaluacion e ){this.e=e;}
    
}

