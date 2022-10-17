# Entradas em java

Para que possamos fazer entradas pelo console em java, precisamos usar o tipo de variável `Scanner`

## Importar a Scanner 

```java
package com.google.searchtool;

import java.util.Scanner;

public class Program {
  // ...
}
```

## Cria uma variável do tipo `Scanner`

```java
Scanner sc = new Scanner(System.in);
```

## Métodos com a `Scanner` - `.next()`

O método next pega a próxima String acumulada no buffer.

```java
Scanner sc = new Scanner(System.in);
String texto = sc.next();
```
## Métodos com a `Scanner` - `.nextInt()`, `.nextDouble()`, ...

Servem para fazer casting do conteúdo lido para a variável desejada.

## Método `.nextLine()`

Tomar cuidado com situações em vai haver um `enter` esperando a ser processado e que pode dar falha quando usamos um `.nextLine()` logo em seguida.

Solução:
```java
  int idade = sc.nextInt();
  sc.nextLine();
  
  String apelido = sc.nextLine();
  double altura = sc.nextDouble();
``` 

# Vetores/Arrays em java

```java
int[] array = new int[100];

for (int i = 0; i < 100; i++) {
  array[i] = i;
}
```