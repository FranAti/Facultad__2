package src.model;

public class PersonalServicio extends Empleado {
    private Secc seccion;
    public PersonalServicio(String nombre, String apellido, String dni, Est_civ estado, int num_despacho, String fecha_incorporacion, Secc seccion) {
        super(nombre, apellido, dni, estado, num_despacho, fecha_incorporacion);
        this.seccion = seccion;
    }

    public Secc getSeccion() {
        return seccion;
    }
    public void cambioSeccion(Secc seccion) {
        this.seccion = seccion;
    }

    public double calcularSalario() {
        double salario = 2000;
        if (getEstado() == Est_civ.CASADO) {
            salario = salario * 0.3;
        }
        return salario;
    }

    @Override
    public String toString() {
        return super.toString()+", Seccion: "+seccion;
    }
}
