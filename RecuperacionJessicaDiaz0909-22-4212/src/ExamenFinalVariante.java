import java.util.Scanner;

public class ExamenFinalVariante {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while(opcion != 3) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Operaciones Matematicas");
            System.out.println("2. Estudiantes");
            System.out.println("3. Salir");
            System.out.print("Ingrese su opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
                switch (opcion) {
                    case 1:
                        opcion1();
                        break;
                    case 2:
                        opcion2();
                        break;
                    case 3:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, ingrese un número del 1 al 6.");
                }
            } catch (NumberFormatException var4) {
                System.out.println("Por favor, ingrese un número entero válido.");
            }
        }

        scanner.close();
    }

    // Funciones de las opciones (sin implementación en este ejemplo)

    public static void opcion1() {
        // Implementación de la opción 1
    }

    public static void opcion2() {
        // Implementación de la opción 2
    }
    


}
