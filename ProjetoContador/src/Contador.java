import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            int primeiroNumero = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int segundoNumero = scanner.nextInt();

            if (primeiroNumero >= segundoNumero) {
                throw new ParametrosInvalidosException("O primeiro parâmetro deve ser menor que o segundo parâmetro");
            }

            int diferenca = segundoNumero - primeiroNumero;

            for (int i = 1; i <= diferenca; i++) {
                System.out.println("Imprimindo o número " + i);
            }

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
