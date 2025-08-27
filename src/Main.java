import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Por estudiante: feature/XX-nombreTarea, con XX de 01 a 12.

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== CALCULADORA COLABORATIVA ===");
            System.out.println("1) CALCULAR seno y coseno 3 aleatorios ");
            System.out.println("2) Calcular logaritmo, tangente, arseno y arconseno de 3 numeros aleatorios");
            System.out.println("3) Calcular la suma de los primeros 50 impares ");
            System.out.println("4) Calcular la suma de los primeros 50 pares ");
            System.out.println("5) Potencia de 2 numeros aleatorios 1 - 100");
            System.out.println("6) Raíz cuadrada");
            System.out.println("7) Par o impar de un numero aleatorio entre 1 y 100 ");
            System.out.println("8) Mayor de tres números aleatorios 1 - 200");
            System.out.println("9) Menor de cuatro números impares aleatorios 1 - 100");
            System.out.println("10) Tabla de multiplicar del 1 al 20");
            System.out.println("11) Ejercicio de adivinar numero aleatorio con 3 intentos ");
            System.out.println("12) Ejercicios dado ganador de 10 rondas ");
            System.out.println("13) Salir");
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
                    Random random = new Random();
                    int numeroAleatorioUno = random.nextInt(100) + 1;
                    int numeroAleatorioDos = random.nextInt(100) + 1;
                    int numeroAleatorioTres = random.nextInt(100) + 1;
                    int numeroAleatorioCuatro = random.nextInt(100) + 1;
                    while (numeroAleatorioUno % 2 == 0) {
                        numeroAleatorioUno = random.nextInt(100) + 1;
                    }
                    while (numeroAleatorioDos % 2 == 0) {

                        numeroAleatorioDos = random.nextInt(100) + 1;
                    }
                    while (numeroAleatorioTres % 2 == 0) {

                        numeroAleatorioTres = random.nextInt(100) + 1;
                    }
                    while (numeroAleatorioCuatro % 2 == 0) {

                        numeroAleatorioCuatro = random.nextInt(100) + 1;
                    }

                    System.out.println("Numeros aleatorios: " + numeroAleatorioUno + ", " + numeroAleatorioDos + ", " + numeroAleatorioTres + ", " + numeroAleatorioCuatro);
                    int menor;

                    if (numeroAleatorioUno < numeroAleatorioDos && numeroAleatorioUno < numeroAleatorioTres && numeroAleatorioUno < numeroAleatorioCuatro){
                        menor = numeroAleatorioCuatro;
                    } else if (numeroAleatorioDos < numeroAleatorioUno && numeroAleatorioDos < numeroAleatorioTres && numeroAleatorioDos < numeroAleatorioCuatro) {
                        menor = numeroAleatorioDos;
                    } else if (numeroAleatorioTres < numeroAleatorioUno && numeroAleatorioTres < numeroAleatorioDos && numeroAleatorioTres < numeroAleatorioCuatro) {
                        menor = numeroAleatorioTres;
                    } else {
                        menor = numeroAleatorioCuatro;
                    }

                    System.out.println("El numero impar menor es: " + menor);

                break;
                case 10: // Estudiante 10

                    break;
                case 11: // Estudiante 11

                    break;
                case 12: // Estudiante 12

                    break;
                case 13:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
        while (opcion != 13);
    }
}