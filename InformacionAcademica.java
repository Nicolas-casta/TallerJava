import java.util.Scanner;

public class InformacionAcademica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Datos personales
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        System.out.print("Ingresa tu carrera: ");
        String carrera = scanner.nextLine();

        System.out.print("Cuantas asignaturas registraras?: ");
        int numMaterias = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        String[] asignaturas = new String[numMaterias];
        double[] calificaciones = new double[numMaterias];

        double suma = 0;

        for (int i = 0; i < numMaterias; i++) {
            System.out.print("Nombre de la asignatura #" + (i + 1) + ": ");
            asignaturas[i] = scanner.nextLine();
            System.out.print("Calificacion de " + asignaturas[i] + ": ");
            calificaciones[i] = scanner.nextDouble();
            scanner.nextLine();
            suma += calificaciones[i];
        }

        // Mostrar datos y resultados
        System.out.println("\nNombre: " + nombre + ", Edad: " + edad + ", Carrera: " + carrera);
        System.out.println("\nListado de asignaturas y calificaciones:");

        for (int i = 0; i < numMaterias; i++) {
            System.out.println((i + 1) + ") " + asignaturas[i] + " = " + calificaciones[i]);
        }

        double promedio = (double) suma / numMaterias;
        System.out.println("\nPromedio de calificaciones: " + promedio);

        if (promedio >= 60) {
            System.out.println("Estado: APROBADO");
        } else {
            System.out.println("Estado: REPROBADO");
        }

        scanner.close();
    }
}
