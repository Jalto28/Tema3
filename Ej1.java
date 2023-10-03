import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        //Declaramos variables
        Scanner teclado = new Scanner(System.in);
        int numero;
        
        //Pedimos el número teclado
        System.out.print("Introduce un número: ");
        numero = teclado.nextInt();

        //Comprobamos si es el resultado de una división entre 2 es 0
        if (numero % 2 == 0) {
            System.out.println("El número introducido es par.");
        } else {
            System.out.println("El número introducido es impar.");
        }

        teclado.close();
    }
}
