import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double ms;
        System.out.println("Informe o m/s");
        Scanner valor=new Scanner(System.in);
        ms=valor.nextFloat();
        ms= ms * 3.6;
        System.out.println("O km é: " + ms);
    }
}