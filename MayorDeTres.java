import java.util.Scanner;

public class MayorDeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer numero: ");
        int n1 = scanner.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        int n2 = scanner.nextInt();
        System.out.print("Ingresa el tercer numero: ");
        int n3 = scanner.nextInt();

        int mayor = n1;
        if (n2 > mayor) {
            mayor = n2;
        }
        if (n3 > mayor) {
            mayor = n3;
        }

        System.out.println("El numero mayor de los tres numeros ingresados es: " + mayor);
        scanner.close();
    }
}
