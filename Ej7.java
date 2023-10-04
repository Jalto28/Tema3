import java.util.Scanner;

public class Ej7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la edad: ");
        int edad = teclado.nextInt();

        System.out.print("¿Los padres son socios? (true/false): ");
        boolean padresSocios = teclado.nextBoolean();

        double cuotaBase = 500;  // Cuota base en euros

        // Calcular el descuento en función de la edad y si los padres son socios
        double descuento = 0;

        if (edad > 65) {
            descuento = 0.5;  // 50% de descuento para personas mayores de 65 años
        } else if (edad < 18) {
            if (padresSocios) {
                descuento = 0.35;  // 35% de descuento para menores de 18 años con padres socios
            } else {
                descuento = 0.25;  // 25% de descuento para menores de 18 años sin padres socios
            }
        }

        // Calcular la cuota final después del descuento
        double cuotaFinal = cuotaBase - (cuotaBase * descuento);

        System.out.println("La cuota a abonar es: " + cuotaFinal + " euros");
    }
}


