import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double km;
        System.out.println("Informe o KM");
        Scanner valor=new Scanner(System.in);
        km=valor.nextFloat();
        km= km / 3.6;
        System.out.println("A m/s é: " + km);
    }
}