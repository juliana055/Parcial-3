package parcial3;

public class GestionEstudiantes {

    private static final int CAPACIDAD_MAX = 100;

    private final Estudiante[] estudiantes;
    private int cantidadActual;

    public GestionEstudiantes() {
        estudiantes = new Estudiante[CAPACIDAD_MAX];
        cantidadActual = 0;
    }

    public void agregarEstudiante(String nombre, int edad, double promedio) {
        if (cantidadActual < CAPACIDAD_MAX) {
            estudiantes[cantidadActual] = new Estudiante(nombre, edad, promedio);
            cantidadActual++;
            System.out.println("Estudiante agregado con éxito.");
        } else {
            System.out.println("No se puede agregar más estudiantes. Capacidad máxima alcanzada.");
        }
    }

    public void mostrarEstudiantes() {
        if (cantidadActual == 0) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            System.out.println("Lista de estudiantes:");
            for (int i = 0; i < cantidadActual; i++) {
                Estudiante estudiante = estudiantes[i];
                System.out.println("Nombre: " + estudiante.getNombre()
                        + ", Edad: " + estudiante.getEdad()
                        + ", Promedio: " + estudiante.getPromedio());
            }
        }
    }

    public void buscarPorNombre(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < cantidadActual; i++) {
            if (estudiantes[i].getNombre().equalsIgnoreCase(nombre)) {
                Estudiante estudiante = estudiantes[i];
                System.out.println("Estudiante encontrado:");
                System.out.println("Nombre: " + estudiante.getNombre()
                        + ", Edad: " + estudiante.getEdad()
                        + ", Promedio: " + estudiante.getPromedio());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Estudiante no encontrado.");
        }
    }

    public void calcularPromedioGeneral() {
        if (cantidadActual == 0) {
            System.out.println("No hay estudiantes registrados para calcular el promedio.");
        } else {
            double sumaPromedios = 0;
            for (int i = 0; i < cantidadActual; i++) {
                sumaPromedios += estudiantes[i].getPromedio();
            }
            double promedioGeneral = sumaPromedios / cantidadActual;
            System.out.println("El promedio general de los estudiantes es: " + promedioGeneral);
        }
    }
}
