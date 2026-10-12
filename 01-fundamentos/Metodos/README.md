# 💼 Calculadora de Folha e Benefícios Corporativos

Programa modularizado em Java que simula o cálculo de folha de pagamento corporativa através de métodos especialistas, demonstrando separação de responsabilidades, sobrecarga e modelo de memória.

## 🎯 Objetivo
Dominar a criação e organização de métodos em Java, aplicando princípios de Clean Code (métodos pequenos com responsabilidade única), sobrecarga (*overloading*), documentação com Javadoc e a regra fundamental de passagem por valor.

## 🛠️ Conceitos Praticados
- **Método `main` Orquestrador:** Manter o ponto de entrada enxuto, delegando regras e cálculos para métodos especialistas.
- **Métodos com Retorno vs `void`:** Separação entre cálculo puro com `return` e exibição em tela com `void`.
- **Reutilização de Código:** Método especialista para leitura e validação defensiva de valores positivos (`lerValorPositivo`).
- **Sobrecarga de Métodos (*Overloading*):** Múltiplas versões de um método de bônus (`calcularBonus(salario)` e `calcularBonus(salario, percentual)`).
- **Passagem por Valor:** Demonstração prática da imutabilidade de variáveis primitivas passadas como argumento vs modificação de elementos em arrays.

## 💻 Exemplo de Execução
```text
=== SISTEMA DE FOLHA CORPORATIVA ===
Digite o salário bruto do colaborador (R$):
5000,00

--- HOLERITE / DEMONSTRATIVO ---
Salário Bruto: R$ 5000,00
Desconto INSS (11%): R$ 550,00
Bônus de Desempenho (Padrão 10%): R$ 500,00
Salário Líquido Final: R$ 4950,00
```
