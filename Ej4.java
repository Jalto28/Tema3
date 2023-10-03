import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        //Declaramos variables
		Scanner teclado = new Scanner(System.in);
		double numero1, numero2;
		
		//Pedimos los numeros por teclado
        System.out.print("Introduce el primer número real: ");
        numero1 = teclado.nextDouble();

        System.out.print("Introduce el segundo número real: ");
        numero2 = teclado.nextDouble();

        double menor, mayor;

        // Determinar el menor y el mayor de los dos números
        if (numero1 < numero2) {
            menor = numero1;
            mayor = numero2;
        } else {
            menor = numero2;
            mayor = numero1;
        }

        System.out.println("Números ordenados de menor a mayor: " + menor + ", " + mayor);

        teclado.close();
    }
}