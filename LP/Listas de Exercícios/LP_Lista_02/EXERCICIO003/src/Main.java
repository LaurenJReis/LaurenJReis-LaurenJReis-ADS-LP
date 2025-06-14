import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float number;
        System.out.println("Informe um numero real");
        Scanner pampers=new Scanner(System.in);
        number=pampers.nextFloat();
        number=number/5;
        System.out.println("Sua quinta parte é: " + number);
    }
}