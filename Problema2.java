package problema2;
import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o seu peso (kg): ");
        Double peso = sc.nextDouble();
        
        System.out.print("Insira a sua altura (m): ");
        Double altura = sc.nextDouble();

        Double imc = peso / (altura*altura);
        System.out.printf("O seu imc é: %.2f", imc);

        sc.close();
    }
}
