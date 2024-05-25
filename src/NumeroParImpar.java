import java.util.Scanner;
public class NumeroParImpar {
    public int numeroParImpar() {
        Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese un numero ");
    int numero = sc.nextInt();
    if (numero % 2 == 0) {
        System.out.println(numero + " es un numero par");
    }else {
        System.out.println(numero + " es un numero impar");
    }
        return 0;
    }
}