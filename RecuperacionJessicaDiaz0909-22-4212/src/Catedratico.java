import java.util.Scanner;

class Main{

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
                        opcion1(scanner);
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

    public static void opcion1(Scanner scanner) {
        System.out.println("Opción 1 seleccionada: Operaciones con 2 números.");

        // Pedir al usuario que seleccione la operación
        System.out.println("Seleccione la operación que desea realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.print("Ingrese el número de la operación: ");
        int opcion = scanner.nextInt();

        // Pedir al usuario que ingrese los dos números
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        // Realizar la operación seleccionada y mostrar el resultado
        switch (opcion) {
            case 1:
                double suma = numero1 + numero2;
                System.out.println("El resultado de la suma es: " + suma);
                break;
            case 2:
                double resta = numero1 - numero2;
                System.out.println("El resultado de la resta es: " + resta);
                break;
            case 3:
                double multiplicacion = numero1 * numero2;
                System.out.println("El resultado de la multiplicación es: " + multiplicacion);
                break;
            case 4:
                if (numero2 != 0) {
                    double division = numero1 / numero2;
                    System.out.println("El resultado de la división es: " + division);
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Opción no válida. Por favor, seleccione una operación del 1 al 4.");
                break;
        }
    }

    public static void opcion2() {
        // Implementación de la opción 2
    }
}

public class Catedratico {
    void Nombre() {
        System.out.println("Juan Pablo");
    }
    void Carrera(){
        System.out.println("Ingenieria en Sistema");
    }
    void Edad(){

    }
    public class Name {

    }
    public class Main {

    }
    public class Edad{

    }
    private class Nombre {

    }
}