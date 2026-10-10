import java.util.Scanner;

public class CompraProduto {
    public static void main(String[] args) {

        String produto = "teclado";
        float precoProduto = 350f;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade desejada de " + produto);
        int quantidade = Integer.parseInt(scanner.nextLine());

        float valorCompra = quantidade * precoProduto;

        System.out.println("O valor de " + quantidade + " " + produto + " ficou em " + valorCompra + " reais");

    }

}
