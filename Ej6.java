import java.util.Scanner;

public class Ej6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double cantidadDinero;
        int monedas2 = 0, monedas1 = 0, centimos50 = 0, centimos20 = 0, centimos10 = 0, centimos5 = 0, centimos2 = 0, centimos1 = 0;

        System.out.print("Introduce la cantidad de dinero en euros: ");
        cantidadDinero = teclado.nextDouble();

        // Convertir la cantidad a céntimos para facilitar el cálculo
        int cantidadCentimos = (int) (cantidadDinero * 100); 

        // Calcular la cantidad de monedas de 2 euros
        if (cantidadCentimos >= 200) {
            monedas2 = cantidadCentimos / 200;
            cantidadCentimos -= monedas2 * 200;
        }

        // Calcular la cantidad de monedas de 1 euro
        if (cantidadCentimos >= 100) {
            monedas1 = cantidadCentimos / 100;
            cantidadCentimos -= monedas1 * 100;
        }

        // Calcular la cantidad de monedas de 50 céntimos
        if (cantidadCentimos >= 50) {
            centimos50 = cantidadCentimos / 50;
            cantidadCentimos -= centimos50 * 50;
        }

        // Calcular la cantidad de monedas de 20 céntimos
        if (cantidadCentimos >= 20) {
            centimos20 = cantidadCentimos / 20;
            cantidadCentimos -= centimos20 * 20;
        }

        // Calcular la cantidad de monedas de 10 céntimos
        if (cantidadCentimos >= 10) {
            centimos10 = cantidadCentimos / 10;
            cantidadCentimos -= centimos10 * 10;
        }

        // Calcular la cantidad de monedas de 5 céntimos
        if (cantidadCentimos >= 5) {
            centimos5 = cantidadCentimos / 5;
            cantidadCentimos -= centimos5 * 5;
        }

        // Calcular la cantidad de monedas de 2 céntimos
        if (cantidadCentimos >= 2) {
            centimos2 = cantidadCentimos / 2;
            cantidadCentimos -= centimos2 * 2;
        }

        // El resto son monedas de 1 céntimo
        centimos1 = cantidadCentimos;

        // Mostrar la cantidad mínima de monedas
        System.out.println("Cantidad mínima de monedas:");
        System.out.println("Monedas de 2 euros: " + monedas2);
        System.out.println("Monedas de 1 euro: " + monedas1);
        System.out.println("Monedas de 50 céntimos: " + centimos50);
        System.out.println("Monedas de 20 céntimos: " + centimos20);
        System.out.println("Monedas de 10 céntimos: " + centimos10);
        System.out.println("Monedas de 5 céntimos: " + centimos5);
        System.out.println("Monedas de 2 céntimos: " + centimos2);
        System.out.println("Monedas de 1 céntimo: " + centimos1);
    }
}