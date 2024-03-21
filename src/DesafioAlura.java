import java.util.Random;
import java.util.Scanner;

public class DesafioAlura {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int newNumber = new Random().nextInt(100);

        int i;
        for (i = 5; i > 0; i = i - 1) {
            System.out.println("Você tem " + i + " chances de acertar o numero aleatorio");
            System.out.println("Digite um numero de 0 a 100:");
            int randomNumber = sc1.nextInt();
            if (randomNumber == newNumber) {
                System.out.println("Parabens voce acertou");
                break;
            }
            if (randomNumber > newNumber) {
                System.out.println("O numero é menor");
            } else {
                System.out.println("O numero é maior");
            }
        }

        if (i == 0) {
            System.out.println("Voce utilizou todas suas chances e perdeu");
        }
    }
}
