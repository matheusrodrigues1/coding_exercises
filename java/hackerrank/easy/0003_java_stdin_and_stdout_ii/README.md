# Java Stdin and Stdout II

## Plataforma

HackerRank

## Exercício

Java Stdin and Stdout II

## Objetivo

Praticar a leitura de múltiplos tipos de dados da entrada padrão (`int`, `double` e `String`) utilizando a classe `Scanner`, aprendendo a lidar com o comportamento do buffer de entrada ao alternar entre métodos numéricos e textuais.

## Descrição

O exercício solicita a leitura de três tipos de dados da entrada padrão na seguinte ordem:
1. Um inteiro (`int`)
2. Um número de ponto flutuante (`double`)
3. Uma linha de texto (`String`)

Em seguida, deve-se imprimir esses valores na saída padrão na ordem inversa da leitura (String, Double e Int), acompanhados dos respectivos rótulos.

## Conceitos Praticados

* Leitura de tipos primitivos (`nextInt()`, `nextDouble()`)
* Leitura de textos completos (`nextLine()`)
* Manipulação do buffer do `Scanner` (consumo de quebra de linha `\n`)
* Impressão formatada na saída padrão (`System.out.println`)

## Abordagem Utilizada

1. Ler o número inteiro utilizando `scan.nextInt()`.
2. Ler o número de ponto flutuante utilizando `scan.nextDouble()`.
3. Executar uma chamada adicional a `scan.nextLine()` para limpar a quebra de linha pendente que permaneceu no buffer de entrada.
4. Ler a linha de texto completa utilizando `scan.nextLine()`.
5. Imprimir os valores nos formatos solicitados: `String: ...`, `Double: ...` e `Int: ...`.

## Conceitos de Programação Desenvolvidos

* Gerenciamento de buffer de entrada de dados
* Diferença no comportamento de leitura entre tokens e linhas completas
* Formatação de saída de dados
* Tipagem de variáveis em Java

## Dificuldade

Easy (Fácil)

## Aprendizados

Este exercício aborda um problema recorrente em Java ao utilizar a classe `Scanner`: o resíduo do caractere de nova linha (`\n`) deixado no buffer por métodos como `nextInt()` e `nextDouble()`. Entender esse comportamento é fundamental para evitar erros silenciosos em programas que alternam a leitura de números e textos.

## Arquivos

```text
0003_java_stdin_and_stdout_ii/
├── README.md
└── Solution.java