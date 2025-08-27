import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

     // Por estudiante: feature/XX-nombreTarea, con XX de 01 a 12.

        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
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
                    int num, num1, num2, num3;
                    for (int i=1; i<=3; i++) {
                        num = aleatorio.nextInt(101-1);
                        num1 = aleatorio.nextInt(101-1);
                        num2 = aleatorio.nextInt(101-1);
                        num3 = aleatorio.nextInt(101-1);
                        //
                        System.out.println(num);
                        //logaritmo
                        double logaritmo = Math.log(num);
                        System.out.println("Logaritmo: "+num);
                        //tangente
                        double tangente = Math.tan(num1);
                        System.out.println("Tangente: "+tangente);
                        //arse
                        double arseno = Math.asin(num2);
                        double radianes = Math.toRadians(arseno);
                        System.out.println("Arcoseno: "+radianes);


                        //arcos
                        double arcocoseno = Math.acos(num3);
                        double radianes2 = Math.toRadians(arcocoseno);
                        System.out.println("Radianes: "+radianes2);
                        System.out.println("Arcocoseno: "+radianes2);
                    }


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

                    break;
                case 13:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 13);
    }
}