# Lista de Exercícios VI - Algoritmos e Programação
---

## Sobre o Projeto

Este repositório documenta a implementação da **Lista de Exercícios VI** da disciplina **Algoritmos e Programação / Programação de Soluções Computacionais**, desenvolvida no contexto acadêmico do **Centro Universitário UNA**, sob orientação do **Professor Daniel Henrique Matos de Paiva**.

A atividade teve como objetivo reforçar conceitos fundamentais de programação utilizando **vetores (arrays)**, estruturas de repetição e manipulação de dados em linguagem Java.

---

## Objetivo da Atividade

Desenvolver algoritmos que trabalhem com estruturas de dados simples (vetores), aplicando:

- leitura de dados pelo usuário
- armazenamento em arrays
- processamento de informações
- exibição de resultados no console

---

## Exercícios Implementados e Explicação

### Exercicio01
Leitura de 5 números inteiros e exibição dos valores informados.

Explicação:  
Foi utilizado um vetor de tamanho fixo para armazenar os números digitados pelo usuário. Um laço `for` percorre o vetor para leitura e outro para exibição, demonstrando o uso básico de arrays.

---

### Exercicio02
Leitura de 10 números reais e exibição na ordem inversa.

Explicação:  
Após preencher o vetor, foi utilizado um laço `for` invertido (do último índice até o primeiro) para imprimir os valores em ordem reversa, explorando o controle de índices.

---

### Exercicio03
Leitura de 4 notas, exibição das notas e cálculo da média.

Explicação:  
As notas são armazenadas em um vetor e somadas durante a leitura. A média é calculada dividindo a soma pela quantidade de elementos, demonstrando manipulação de dados e operações matemáticas.

---

### Exercicio04
Leitura de 10 caracteres e identificação das consoantes.

Explicação:  
Cada caractere é analisado para verificar se é letra e não é vogal. Foi utilizada uma função auxiliar para identificar vogais, aplicando lógica condicional e validação de dados.

---

### Exercicio05
Separação de números pares e ímpares em vetores distintos.

Explicação:  
Os números são classificados usando o operador módulo (`%`). Dois vetores auxiliares armazenam pares e ímpares, demonstrando filtragem e organização de dados.

---

### Exercicio06
Cálculo da média de 10 alunos e contagem de aprovados.

Explicação:  
Para cada aluno, são lidas 4 notas e calculada a média. As médias são armazenadas em um vetor e um contador identifica quantos alunos atingiram média maior ou igual a 7.0, aplicando estruturas aninhadas.

---

### Exercicio07
Cálculo da soma e multiplicação de 5 números.

Explicação:  
Durante a leitura dos números, são acumulados os valores em duas variáveis: uma para soma e outra para multiplicação, demonstrando processamento simultâneo de dados.

---

## Estrutura do Projeto

    algprog-lista-06/
    ├── exercicios/
    │   ├── Exercicio01.java
    │   ├── Exercicio02.java
    │   ├── Exercicio03.java
    │   ├── Exercicio04.java
    │   ├── Exercicio05.java
    │   ├── Exercicio06.java
    │   ├── Exercicio07.java
    └── README.md

---

## Conceitos Utilizados

- arrays (vetores)
- estruturas de repetição (for)
- entrada de dados com Scanner
- operadores matemáticos
- estruturas condicionais (if/else)
- manipulação de dados em memória

---

## Boas Práticas Aplicadas

- código organizado e indentado
- nomes de classes seguindo padrão do exercício
- separação de responsabilidades por classe
- leitura clara e objetiva
- lógica adequada ao nível acadêmico

---

## Como Executar

### Pré-requisitos

- Java JDK instalado

### Compilar

    javac exercicios/Exercicio01.java

### Executar

    java exercicios.Exercicio01

(Repetir para os demais exercícios conforme necessário)

---

## Conclusão

A lista de exercícios permitiu consolidar o uso de vetores e estruturas básicas da programação, reforçando a lógica de manipulação de dados e organização de código.

A implementação atende aos requisitos propostos e demonstra domínio dos conceitos fundamentais para evolução em estruturas mais complexas.

---

## Autor

Gabriella Chagas
Estudante de Análise e Desenvolvimento de Sistemas  
