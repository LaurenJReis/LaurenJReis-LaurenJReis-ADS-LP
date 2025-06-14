import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Digite a medida em milímetros: ");
        Scanner scanner = new Scanner(System.in);

        double mm = scanner.nextDouble();

        double polegada = mm / 25.4;

        System.out.println("Medida em polegadas: " + polegada);

    }
}
