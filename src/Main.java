import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menú:");
            System.out.println("1. Verificar si un número es positivo, negativo o cero");
            System.out.println("2. Verificar si un número es par o impar");
            System.out.println("3. Numero Mayor");
            System.out.println("4. Año bisiesto");
            System.out.println("5. Numero del 1 al 20");
            System.out.println("6. Numero del 1 al 10");
            System.out.println("7. Suma de numeros positivos");
            System.out.println("8. Secuencia de Fibonacci");
            System.out.println("9. Suma de numeros pares");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    NumeroPositivoNegativo numeroPositivo = new NumeroPositivoNegativo();
                    numeroPositivo.positivo();
                    break;
                case 2:
                    NumeroParImpar numeroParImpar = new NumeroParImpar();
                    numeroParImpar.numeroParImpar();
                    break;
                case 3:

                    break;
                case 4:
                    System.out.print("Ingresa un año: ");
                    int año = scanner.nextInt();

                    if (NumeroBisiesto.esBisiesto(año)) {
                        System.out.println(año + " es un año bisiesto.");
                    } else {
                        System.out.println(año + " no es un año bisiesto.");
                    }
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (choice != 0);

    }
}
