import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        //Declaramos variables
		Scanner teclado = new Scanner(System.in);
		int numero1,numero2;
		
		//Pedimos los números por teclado
        System.out.print("Introduce el primer número: ");
        numero1 = teclado.nextInt();

        System.out.print("Introduce el segundo número: ");
        numero2 = teclado.nextInt();
		
		//Comprobamos si numero1 es mayor que numero2. 
        if (numero1 > numero2) {
            System.out.println(numero1 + " es mayor que " + numero2);
        } else if (numero1 < numero2) {
            System.out.println(numero1 + " es menor que " + numero2);
        } else {
            System.out.println(numero1 + " es igual a " + numero2);
        }

        teclado.close();
    }
}