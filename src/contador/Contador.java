package contador;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro: ");
            int firstParameter = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Digite o segundo parâmetro: ");
            int secondParameter = scanner.nextInt();

            count(firstParameter, secondParameter);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    static void count(int firstParameter, int secondParameter) throws ParametrosInvalidosException {
        if (firstParameter >= secondParameter) {
            ParametrosInvalidosException.throwError();
        }

        int count = secondParameter - firstParameter;

        for (int i = 1; i <= count; i++) {
            System.out.printf("Imprimindo o número %d%n", i);
        }
    }
}
