package parcial3;

import java.util.Scanner;

public class Parcial3 {

    public static void main(String[] args) {

        GestionEstudiantes gestion = new GestionEstudiantes();

        Scanner sc = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("****** EduPilo S.A. ********");
            System.out.println("******* MENÚ GESTIÓN ESTUDIANTES ********");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar todos los estudiantes");
            System.out.println("3. Buscar Estudiante por Nombre");
            System.out.println("4. Calcular el promedio general");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del estudiante: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese la edad del estudiante: ");
                    int edad = sc.nextInt();
                    System.out.print("Ingrese el promedio del estudiante: ");
                    double promedio = sc.nextDouble();
                    sc.nextLine();
                    gestion.agregarEstudiante(nombre, edad, promedio);
                    break;

                case 2:

                    gestion.mostrarEstudiantes();
                    break;

                case 3:

                    System.out.print("Ingrese el nombre del estudiante a buscar: ");
                    String nombreBusqueda = sc.nextLine();
                    gestion.buscarPorNombre(nombreBusqueda);
                    break;

                case 4:

                    gestion.calcularPromedioGeneral();
                    break;

                case 5:

                    System.out.println("Saliendo del sistema...");
                    break;

                default:

                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 5);

        sc.close();
    }
}
