import java.util.Scanner;

public class SimuladorFinanceiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== SIMULADOR FINANCEIRO ===");
            System.out.println("1 - Simular Rendimento Mensal");
            System.out.println("2 - Listar Fundos Disponíveis");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("\nDigite o valor inicial a investir (R$): ");
                    double valor = scanner.nextDouble();

                    // 2. WHILE: Validação defensiva (obriga o usuário a digitar um valor válido)
                    while (valor <= 0) {
                        System.out.print("Valor inválido! Digite um valor maior que zero: ");
                        valor = scanner.nextDouble();
                    }

                    System.out.print("Digite o prazo da aplicação (em meses): ");
                    int meses = scanner.nextInt();

                    while (meses <= 0) {
                        System.out.print("Prazo inválido! Digite pelo menos 1 mês: ");
                        meses = scanner.nextInt();
                    }

                    double taxaMensal = 0.01;
                    System.out.println("\n--- Projeção de Rendimento (1.0% a.m.) ---");

                    // 3. FOR: Executa exatamente a quantidade de meses solicitada
                    for (int mes = 1; mes <= meses; mes++) {
                        valor += valor * taxaMensal;
                        System.out.printf("Mês %d: R$ %.2f%n", mes, valor);
                    }
                    break;

                case 2:
                    System.out.println("\n--- Fundos de Investimento Disponíveis ---");
                    String[] fundos = {
                            "Renda Fixa Simples (0.8% a.m.)",
                            "CDB Liquidez Diária (1.0% a.m.)",
                            "Tesouro IPCA+ (1.2% a.m.)",
                            "Fundo Multimercado (1.5% a.m.)"
                    };

                    // 4. FOR-EACH: Percorre a coleção diretamente, sem índice manual
                    for (String fundo : fundos) {
                        System.out.println("• " + fundo);
                    }
                    break;

                case 0:
                    System.out.println("\nEncerrando o simulador. Até logo!");
                    break;

                default:
                    System.out.println("\nOpção inválida! Escolha 1, 2 ou 0.");
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }
}