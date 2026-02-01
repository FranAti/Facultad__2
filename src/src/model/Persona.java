package src.model;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private Est_civ estado;
    public Persona(String nombre, String apellido, String dni, Est_civ estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.estado = estado;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDni(){
        return dni;
    }

    public Est_civ getEstado() {
        return estado;
    }
    public void cambiarEstado(Est_civ estado) {
        this.estado = estado;
    }
    @Override
    public String toString() {
        return "Datos: "+nombre+" "+apellido+", DNI: "+dni+", Estado civil: "+estado;
    }
}

