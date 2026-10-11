# 🏷️ Cálculo de Desconto e Frete

Programa em Java que calcula o valor final de uma compra aplicando regras comerciais de desconto para membros VIP e concessão de frete grátis.

## 🎯 Objetivo
Praticar o uso integrado de operadores em Java (aritméticos, relacionais, lógicos e ternário), evitando código duplicado e estruturas condicionais desnecessárias.

## 🛠️ Conceitos Praticados
- **Operador Relacional de Igualdade (`==`):** Leitura de opção numérica (`1` ou `0`) e conversão direta para booleano `(opcao == 1)`.
- **Operador Relacional de Comparação (`>=`):** Avaliação de valor mínimo de compra para atingir o benefício (`valorCompra >= 150.0`).
- **Operador Lógico OU com Curto-Circuito (`||`):** Concessão de frete grátis caso o cliente seja VIP **ou** a compra atinja R$ 150,00.
- **Operador Ternário (`? :`):** Atribuição direta de valores condicionais para frete e percentual de desconto sem duplicação de blocos `if/else`.
- **Operadores Aritméticos:** Cálculos de desconto e acréscimo de frete com precedência via parênteses: `(valorCompra - (valorCompra * desconto)) + frete`.
- **Fechamento de Recursos:** Liberação correta do leitor com `scanner.close()`.

## 💻 Exemplo de Execução
```text
Digite o valor da compra:
200,0
Cliente VIP? (1 para Sim, 0 para Não):
1
180.0
```
