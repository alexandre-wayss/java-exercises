public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("=== SISTEMA DE FOLHA CORPORATIVA ===");
    double salarioBruto = lerValorPositivo(scanner, "Digite o salário bruto do colaborador (R$): ");

    double inss = calcularINSS(salarioBruto);
    double bonus = calcularBonus(salarioBruto);
    double bonus2 = calcularBonus(salarioBruto, 15.0);
    double salarioLiquido = calcularSalarioLiquido(salarioBruto, inss, bonus);


    imprimirHolerite(salarioBruto, inss, bonus, salarioLiquido);

    scanner.close();
}

static double  lerValorPositivo(Scanner scanner, String mensagem) {
  System.out.println(mensagem);
  double valor = scanner.nextDouble();

    while (valor <= 0) {
        System.out.print("Valor inválido! Digite um valor maior que zero: ");
        valor = scanner.nextDouble();
    }
    return valor;

}

public static double calcularINSS(double salarioBruto){
    return salarioBruto * 0.11;
}


public static double calcularBonus(double salarioBruto){
    return salarioBruto * 0.10;
}

public static double calcularBonus(double salarioBruto, double percentual) {
    return salarioBruto * (percentual / 100.0);
}

public static double calcularSalarioLiquido(double salarioBruto, double inss, double bonus){
    return (salarioBruto - inss) + bonus;
}

public static void imprimirHolerite(double bruto, double inss, double bonus, double liquido) {
    System.out.println("\n==================================");
    System.out.println("   --- DEMONSTRATIVO DE PAGAMENTO ---   ");
    System.out.println("==================================");
    System.out.printf("Salário Bruto:          R$ %.2f%n", bruto);
    System.out.printf("(-) Desconto INSS (11%%): R$ %.2f%n", inss);
    System.out.printf("(+) Bônus Recebido:     R$ %.2f%n", bonus);
    System.out.println("----------------------------------");
    System.out.printf("(=) Salário Líquido:    R$ %.2f%n", liquido);
    System.out.println("==================================");
}


