package src.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Empleado extends Persona{
    private LocalDate fecha_incorporacion;
    private int num_despacho;

    public Empleado(String nombre, String apellido, String dni, Est_civ estado,int num_despacho,String fecha_incorporacion) {
        super(nombre, apellido, dni, estado);
        this.fecha_incorporacion = crearFecha(fecha_incorporacion);
        this.num_despacho = num_despacho;
    }

    public LocalDate getFecha_incorporacion() {
        return fecha_incorporacion;
    }
    public void setFecha_incorporacion(String fecha_incorporacion) {
        this.fecha_incorporacion = crearFecha(fecha_incorporacion);
    }
    public int getNum_despacho() {
        return num_despacho;
    }

    public void setNum_despacho(int num_despacho) {
        this.num_despacho = num_despacho;
    }
    //metodo para establecer la fecha correctamente
    public LocalDate crearFecha(String fecha_incorporacion) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha = LocalDate.parse(fecha_incorporacion, formato);
        return fecha;
    }
    public abstract double calcularSalario();
    @Override
    public String toString() {
        return super.toString()+", Despacho: "+num_despacho;
    }


}
