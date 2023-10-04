import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int edad;
		
		System.out.println("Introduce la edad");
		edad = Integer.parseInt(teclado.nextInt());
		
        if (edad >= 18) {
            System.out.println("La persona de edad " + edad + " es mayor de edad");
        } else if (edad <= 0) {
            System.out.println("La edad no puede ser 0 o negativa");
        } else if (edad > 0 && edad < 18) {
            System.out.println("La persona de edad " + edad + " es menor de edad");
        }
    }
}
