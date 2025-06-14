import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Digite a medida em polegada: ");
        Scanner scanner = new Scanner(System.in);

        double polegada = scanner.nextDouble();

        double mm2 = polegada * 25.4;

        System.out.println("Medida em milímetros: " + mm2);
    }
}
