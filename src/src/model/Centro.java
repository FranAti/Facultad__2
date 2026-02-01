package src.model;

public class Centro {

    private Persona [] Personas;
    private Empleado[] Empleados;
    private int numPersonas;
    private int numEmpleados;

    public Centro(){
        Personas = new Persona[10];
        Empleados = new Empleado[10];
        numPersonas = 0;
        numEmpleados = 0;
    }

    public void darAlta(Persona p) {
        Personas[numPersonas] = p;
        numPersonas++;
        if (p instanceof Empleado){
            Empleados[numEmpleados] = (Empleado) p;
            numEmpleados++;
        }
    }


    public void bajaGeneral(String dni) {
        for (int i = 0; i < numPersonas; i++) {
            if (Personas[i].getDni().equals(dni)) {
                for (int j = i; j < numPersonas - 1; j++) {
                    Personas[j] = Personas[j + 1];
                }
                Personas[numPersonas - 1] = null;
                numPersonas--;
            }

        }
        for (int i = 0; i < numEmpleados; i++) {
            if (Empleados[i].getDni().equals(dni)) {
                for (int j = i; j < numEmpleados - 1; j++) {
                    Empleados[j] = Empleados[j + 1];
                }
                Empleados[numEmpleados - 1] = null;
                numEmpleados--;
                return;
            }

        }

    }


    public void imprimirPersonas() {

        for (int i = 0; i < numPersonas; i++) {
            System.out.println(Personas[i]);
        }

    }

    public void imprimirSalarios() {
        for (int i = 0; i < numPersonas; i++) {
            if (Personas[i] instanceof Empleado) {
                Empleado e = (Empleado) Personas[i];
                System.out.println(e.getNombre() + " -- Salario: " + e.calcularSalario());
            }
        }
    }
}
