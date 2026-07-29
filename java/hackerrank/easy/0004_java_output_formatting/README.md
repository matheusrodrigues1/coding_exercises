# Java Output Formatting

## Plataforma

HackerRank

## Exercício

Java Output Formatting

## Objetivo

Praticar a formatação de saídas de texto e números inteiros no console em Java utilizando o método `System.out.printf()`, garantindo o alinhamento de colunas e o preenchimento de inteiros com zeros à esquerda.

## Descrição

O desafio consiste em ler três linhas da entrada padrão (`stdin`), onde cada linha contém uma `String` seguida por um número inteiro (`int`). A saída padrão (`stdout`) deve exibir uma tabela formatada com duas colunas envolvidas por bordas formadas por travessões (`================================`):

* **Primeira coluna:** Contém a `String` alinhada à esquerda com exatamente **15 caracteres** de largura.
* **Segunda coluna:** Contém o inteiro formatado com **exatamente 3 dígitos**, adicionando zeros à esquerda (`0`) caso o número tenha menos de 3 dígitos (por exemplo, `9` torna-se `009`).

## Conceitos Praticados

* Saída formatada de dados com `System.out.printf()`
* Especificadores de formato (`%s`, `%d`)
* Modificadores de largura, alinhamento e preenchimento (`%-15s`, `%03d`)
* Estrutura de repetição (`for`)
* Leitura de entradas com `Scanner`

## Abordagem Utilizada

1. Imprimir a linha superior divisória (`================================`).
2. Utilizar um laço de repetição `for` executado 3 vezes para processar cada par de dados:
   * Ler a palavra (`String`) com `sc.next()`.
   * Ler o número inteiro (`int`) com `sc.nextInt()`.
   * Formatar a saída utilizando a seguinte instrução:
     ```java
     System.out.printf("%-15s%03d%n", s1, x);
     ```
     * `%-15s`: Alinha a string `s1` à esquerda em um campo de 15 caracteres.
     * `%03d`: Preenche o inteiro `x` com zeros à esquerda para ter exatamente 3 dígitos.
     * `%n`: Adiciona uma quebra de linha compatível com qualquer sistema operacional.
3. Imprimir a linha inferior divisória (`================================`).

## Conceitos de Programação Desenvolvidos

* Formatação avançada de saídas no terminal
* Manipulação de especificadores de conversão de dados em Java
* Construção de tabelas e relatórios alinhados sem concatenação manual

## Dificuldade

Easy (Fácil)

## Aprendizados

Este exercício demonstra a praticidade e o poder do método `System.out.printf()`. Ele substitui concatenações complexas de strings para alinhamento manual por especificadores de formato diretos, simplificando o código e garantindo consistência na apresentação visual dos dados.

## Arquivos

```text
0004_java_output_formatting/
├── README.md
└── Solution.java