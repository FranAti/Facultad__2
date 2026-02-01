package src.model;

public class Estudiante extends Persona {
    private String curso;
    public Estudiante(String nombre, String apellido, String dni, Est_civ estado,String curso) {
        super(nombre, apellido, dni, estado);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }
    //Matriculación de un estudiante en un nuevo curso.
    //Esto es un poco ambiguo, no se si refiere a solapando el actual
    //o cursando los dos a la vez
    //Voy a hacerlo solapando
    public void cambioDeCurso(String curso) {
        this.curso = curso;
    }
    @Override
    public String toString() {
        return super.toString()+", Curso: "+curso;
    }
}
