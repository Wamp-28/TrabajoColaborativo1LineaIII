import java.util.Random;
import java.util.Scanner;

<<<<<<< HEAD
=======
import java.lang.Math;

import java.util.*;

>>>>>>> 8eddbfd5fb548a327c4c3989a2da0cbda05bbe0a

public class Main {
    public static void main(String[] args) {

 
     // Por Miguel: feature/04-primeros50pares

        // Por estudiante: feature/XX-nombreTarea, con XX de 01 a 12.
 

        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
        Random random = new Random();
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
                case 1: //

                    Random aleatorio = new Random();

                    int n1 = aleatorio.nextInt();
                    int n2 = aleatorio.nextInt();
                    int n3 = aleatorio.nextInt();

                    double senN1 = Math.sin(n1);
                    double senN2 = Math.sin(n2);
                    double senN3 = Math.sin(n3);

                    double cosN1 = Math.cos(n1);
                    double cosN2 = Math.cos(n2);
                    double cosN13 = Math.cos(n3);

                    System.out.println("Seno para " + n1 + ": " +senN1);
                    System.out.println("Seno para " + n2 + ": " +senN1);
                    System.out.println("Seno para " + n3 + ": " +senN1);

                    System.out.println("cos para " + n1 + ": " +senN1);
                    System.out.println("cos para " + n2 + ": " +senN1);
                    System.out.println("cos para " + n3 + ": " +senN1);

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
                case 4: // Miguel Gañan
                    int suma = 0;
                    for (int i = 1; i <= 50; i++) {
                        suma += i * 2;
                    }
                    System.out.println("la suma de los primeros 50 pares es : " + suma);
                    break;
                case 5: // Estudiante 5
                    System.out.println("OPCIÓN 5: Potencia de 2 números aleatorios 1 - 100");

                    int n1;
                    int n2;
                    int min = 1;
                    int max = 100;

                    // Genera los números aleatorios
                    n1 = aleatorio.nextInt(max - min + 1) + min;
                    n2 = aleatorio.nextInt(max - min + 1) + min;

                    // Calcula el resultado de la potencia entre los 2 números aleatorios
                    double resultado = Math.pow (n1, n2);

                    // Imprime la potencia de n1 a la n2, indicando el número generado aleatoriamente y el resultado
                    System.out.println("Número aleatorio 1: " + n1 + "\n Número aleatorio 2: " + n2 + "\n Resultado: " + resultado);

                    break;
                case 6: // Estudiante 6

                    break;
                case 7: // Estudiante 7

                    int numero = random.nextInt(100) + 1;
                    System.out.println("El número generado es: " + numero);

                    if (numero % 2 == 0) {
                        System.out.println("El número es PAR.");
                    } else {
                        System.out.println("El número es IMPAR.");
                    }

                    break;
                case 8: // Estudiante 8
                    System.out.println("8) Mayor de tres números aleatorios 1 - 200");
                    int nume1, nume2, nume3, mayor;

                    //Genera un numero aleatorio entre 1 y 200
                    nume1 = random.nextInt(200)+1;
                    nume2 = random.nextInt(200)+1;
                    nume3 = random.nextInt(200)+1;
                    System.out.println("El número 1 es = "+nume1+"\nEl número 2 es = "+nume2+"\nEl número 3 es = "+ nume3);

                    if (nume1 >= nume2 && nume1 >= nume3) {
                        mayor = nume1;
                    } else if (nume2 >= nume1 && nume2 >= nume3) {
                        mayor = nume2;
                    } else {
                        mayor = nume3;
                    }

                    System.out.println("El número mayor es: "+ mayor);




                    break;
                case 9: // Estudiante 9

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
                    System.out.println("Tabla de multiplicar del 1 al 20");
                    for(int i=1; i<=20; i++) {
                        System.out.println("\nTabla de: " + i);
                        for (int j=1; j<=10; j++) {
                            int result = i * j;
                            System.out.println(i + " * " + j + " = " + result);
                        }
                    }
                    break;
                case 11: // Estudiante 11



                    int i = 0;
                    int num;
                    int  n;

                    Random aleatorioo = new Random();

                    n = aleatorioo.nextInt((60-1)+1) + 1;

                    System.out.println("escoje 3 diferentes numeros");
                    for (int i = 1; i <= 3; i++)
                    {
                        System.out.println("ingrese el primer numero");
                        num = sc.nextInt();
                      if ( num<n){
                          System.out.println("el numero esmayor");
                    } else if ( num>n) {
                          System.out.println("el numero es menor");



                      }
                      else {
                          System.out.println("adivinaste");
                      }

                    }











                    break;
                case 12: // Estudiante 12

                    int numeroMayor=0;

                    for (int i=1; i<=10; i++)
                    {
                        int n= aleatorio.nextInt(6-1)+(1)+1;
                        System.out.println("Resultado del tiro del dado "+n);
                        if (n>numeroMayor)
                        {
                            numeroMayor=n;
                        }

                    }

                    System.out.println("El numero ganador es : "+numeroMayor );

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