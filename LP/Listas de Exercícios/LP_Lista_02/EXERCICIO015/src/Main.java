import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Digite o raio do cilindro: ");
        Scanner scanner = new Scanner(System.in);

        double raioCilindro = scanner.nextDouble();
        System.out.print("Digite a altura do cilindro: ");
        double altura = scanner.nextDouble();
        double volume = Math.PI * Math.pow(raioCilindro, 2) * altura;

        System.out.println("Volume do cilindro: " + volume);
    }
}
