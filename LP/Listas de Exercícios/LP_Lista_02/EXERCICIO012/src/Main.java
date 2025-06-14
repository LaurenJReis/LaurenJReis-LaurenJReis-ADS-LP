import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Digite a primeira nota : ");
        Scanner scanner = new Scanner(System.in);

        double n1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota : ");

        double n2 = scanner.nextDouble();

        double media = (n1 * 1 + n2 * 2) / 3;

        System.out.println("A média é: " + media);
    }
}
