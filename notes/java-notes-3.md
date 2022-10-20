# Funções/Métodos

Procedimentos para que possamos praticar o reuso e a divisão de responsabilidade.

```
public static [retorno/void] [nome] ([argumentos]) {
  [conjunto de regras]
  [retorno/void]
}
```

```java
public static boolen isMultipleOf3(int number) {
  return (numer%3 == 0) ? true : false;
}

public static void dizerOi(String nome) {
  if (nome == null) {
    System.out.println("Olá, [NULL]!");
    return;
  }

  if(nome.equals("")) {
    System.out.println("Olá, [UNDEFINED]!");
    return;
  }
    
  System.out.println("Olá, " + nome + "!");
}

public static void dizerOi() {
  System.out.println("Olá!");
}

```

## Sobrecarga (*Overload*)

é quando temos uma função, construtor, método, etc... com mais de uma responsabilidade e o mesmo nome.

A diferenciação dentre as sobrecargas e feita pelos tipo dos argumentos, pela ordem dos argumentos e pela quantidade de argumentos.

```java
public static int soma(int a, int b) {
  System.out.println("Estou somando inteiros");
  return a + b;
}

public static double soma(double a, double b) {
  System.out.println("Estou somando numeros reais");
  return a + b;
}
```

# Matrizes

As matrizes são vetores bidimensionais. 

```
matriz = [ [1, 2, 3],
           [3, 2, 1],
           [1, 3, 2], ]
```

## Declaração

antes: 

```java
int tamanho = 100;
int[] conjuntoDeInteiros = new int[tamanho];
```

depois:
```java
int linhas = 10;
int colunas = 5;
int[][] vetor2D = new int[10][5];
```

## Acesso

```java
int valor = 9;
vetor2D[0][0] = valor;
```

## Interação - linha por linha
```java
for (int i = 0; i < linhas; i++) {
  for(int j = 0; j < colunas; j++) {
    System.out.print(vetor2d[i][j] + " ");
  }
    System.out.println();
}
```

## Interação - coluna por coluna

```java
for (int i = 0; i < linhas; i++) {
  for(int j = 0; j < colunas; j++) {
    System.out.print(vetor2d[i][j] + " ");
  }
    System.out.println();
}
```