import java.util.Scanner;

public class RegistroUsuarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos cantidad de usuarios
        System.out.print("Cuantos usuarios quieres registrar?: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // limpiar el buffer

        // Creamos arreglos simples con tamaño fijo
        String[] nombres = new String[cantidad];
        int[] edades = new int[cantidad];
        String[] estados = new String[cantidad];

        int mayores = 0;
        int menores = 0;

        // Recorrer para pedir datos
        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nUsuario #" + (i + 1));
            System.out.print("Nombre: ");
            nombres[i] = scanner.nextLine();

            System.out.print("Edad: ");
            edades[i] = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            System.out.print("Estado (Activo/Inactivo): ");
            estados[i] = scanner.nextLine();
        }

        // Mostrar informacion y contar mayores/menores
        System.out.println("\n--- Lista de usuarios ---");
        for (int i = 0; i < cantidad; i++) {
            System.out.print(nombres[i] + " - Edad: " + edades[i] + " - Estado: " + estados[i]);
            if (edades[i] >= 18) {
                System.out.println(" - MAYOR de edad");
                mayores++;
            } else {
                System.out.println(" - MENOR de edad");
                menores++;
            }
        }

        // Mostrar resumen
        System.out.println("\nResumen:");
        System.out.println("Total de usuarios: " + cantidad);
        System.out.println("Mayores de edad: " + mayores);
        System.out.println("Menores de edad: " + menores);

        scanner.close();
    }
}
