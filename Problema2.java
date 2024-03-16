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
        System.out.printf("O seu imc é: %.2f%n", imc);

        if (imc < 17) {
            System.out.println("De acordo com o seu IMC, sua situação é: Muito abaixo do peso");
        }
        if (imc >= 17 && imc < 18.5) {
            System.out.println("De acordo com o seu IMC, sua situação é: Abaixo do peso");
        }
        if (imc >= 18.5 && imc < 25){
            System.out.println("De acordo com o seu IMC, sua situação é: Peso normal");
        }
        if (imc >= 25 && imc < 30) {
            System.out.println("De acordo com o seu IMC, sua situação é: Acima do peso");
        }
        if (imc >= 30 && imc < 35){
            System.out.println("De acordo com o seu IMC, sua situação é: Obesidade");
        }
        if (imc >= 35 && imc < 40) {
            System.out.println("De acordo com o seu IMC, sua situação é: Obesidade severa");
        }
        if (imc >= 40) {
            System.out.println("De acordo com o seu IMC, sua situação é: Obesidade mórbida");
        }
        sc.close();
    }
}
