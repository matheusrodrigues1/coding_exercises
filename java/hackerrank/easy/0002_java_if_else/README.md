# Java If-Else

## Plataforma

HackerRank

## Exercício

Java If-Else

## Objetivo

Praticar o uso de estruturas condicionais (`if`, `else if`, `else`) e operadores lógicos e aritméticos para automatizar processos de tomada de decisão com base no valor de um número inteiro.

## Descrição

O exercício solicita a leitura de um número inteiro $n$ da entrada padrão e a exibição de uma mensagem baseada nas seguintes regras:

* Se $n$ for **ímpar**, imprimir `Weird`.
* Se $n$ for **par** e estiver no intervalo inclusivo de **2 a 5**, imprimir `Not Weird`.
* Se $n$ for **par** e estiver no intervalo inclusivo de **6 a 20**, imprimir `Weird`.
* Se $n$ for **par** e **maior que 20**, imprimir `Not Weird`.

## Conceitos Praticados

* Estrutura condicional (`if`, `else if`, `else`)
* Operador de módulo/resto da divisão (`%`)
* Operadores de comparação (`==`, `!=`, `>=`, `<=`, `>`)
* Operadores lógicos (`&&`)
* Leitura com `Scanner` e saída com `System.out.println`

## Abordagem Utilizada

1. Ler o número inteiro $n$ da entrada padrão utilizando o método `nextInt()` da classe `Scanner`.
2. Verificar se o número é ímpar utilizando a expressão `n % 2 != 0`. Se verdadeiro, imprimir `Weird`.
3. Caso o número seja par, verificar em qual faixa de valores ele se enquadra utilizando estruturas `else if` com operadores relacionais e lógicos:
   * Para o intervalo $[2, 5]$, imprimir `Not Weird`.
   * Para o intervalo $[6, 20]$, imprimir `Weird`.
   * Para valores maiores que 20 (`n > 20`), imprimir `Not Weird`.
4. Fechar o objeto `Scanner`.

## Conceitos de Programação Desenvolvidos

* Tomada de decisão e controle de fluxo
* Avaliação de paridade de números inteiros (par ou ímpar)
* Verificação de intervalos numéricos (range checking)
* Sintaxe de estruturas de controle em Java

## Dificuldade

Easy (Fácil)

## Aprendizados

Este exercício reforça a aplicação de estruturas de controle de fluxo para resolução de problemas baseados em regras e condições múltiplas. Além disso, consolida o entendimento sobre operadores aritméticos (como o operador resto `%`) e operadores lógicos combinados para validação de intervalos.

## Arquivos

```text
0002_java_if_else/
├── README.md
└── Solution.java