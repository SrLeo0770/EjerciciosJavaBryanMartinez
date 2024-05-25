import java.util.Scanner;
public class NumeroPositivoNegativo {
    public int positivo(){
        Scanner escaner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = escaner.nextInt();
        if (numero < 0){
            System.out.println(numero+" es un numero negativo ");
        }else {
            System.out.println(numero+" es un numero positivo ");
        }
        return 0;
    }

}