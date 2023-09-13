import java.util.Scanner;

public class AnioBisiesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("escribir numero:");
        int anio = scanner.nextInt();

        boolean esBisiesto = false;

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            esBisiesto = true;
        }

        if (esBisiesto) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }

        scanner.close();
    }
}
