import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== CALCULADORA COLABORATIVA ===");
            System.out.println("1) Sumar");
            System.out.println("2) Restar");
            System.out.println("3) Multiplicar");
            System.out.println("4) Dividir");
            System.out.println("5) Potencia");
            System.out.println("6) Raíz cuadrada");
            System.out.println("7) Par o impar");
            System.out.println("8) Mayor de dos números");
            System.out.println("9) Menor de dos números");
            System.out.println("10) Tabla de multiplicar");
            System.out.println("11) Área de un rectángulo");
            System.out.println("12) Salir");
            System.out.print("Elija opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: // Estudiante 1

                    break;
                case 2: // Estudiante 2

                    break;
                case 3: // Estudiante 3

                    break;
                case 4: // Estudiante 4

                    break;
                case 5: // Estudiante 5

                    break;
                case 6: // Estudiante 6

                    break;
                case 7: // Estudiante 7

                    break;
                case 8: // Estudiante 8

                    break;
                case 9: // Estudiante 9

                    break;
                case 10: // Estudiante 10

                    break;
                case 11: // Estudiante 11

                    break;
                case 12: // Estudiante 12
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 12);
    }
}