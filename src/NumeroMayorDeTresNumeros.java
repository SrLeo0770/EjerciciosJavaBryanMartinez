/*import java.util.Scanner;

public class NumeroMayorDeTresNumeros {
    private double number1;
    private double number2;
    private double number3;

    public NumeroMayorDeTresNumeros(double number1, double number2, double number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public void showGreatestNumber() {
        double greatest = number1;

        if (number2 > greatest) {
            greatest = number2;
        }
        if (number3 > greatest) {
            greatest = number3;
        }

        System.out.println("El mayor de los tres números es: " + greatest);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        double userInput1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double userInput2 = scanner.nextDouble();

        System.out.print("Ingresa el tercer número: ");
        double userInput3 = scanner.nextDouble();

        NumeroMayorDeTresNumeros ejercicio = new NumeroMayorDeTresNumeros(userInput1, userInput2, userInput3);
        ejercicio.showGreatestNumber();

        scanner.close();
    }
}
*/