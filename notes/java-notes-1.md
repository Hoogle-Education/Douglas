# Saída e Código base

`Program.java`
```java
public class Program {
  public static void main(String[] args) {
    
    System.out.println("Hello World!");

  }
}
```

# Estruturas de Seleção (`if-else if-else`)

```java

  double nota = 7.5;

  if ( nota >= 7.0 ) {
    System.out.println("Aprovado");
  }

  if (nota < 7.0 ) {
    System.out.println("Reprovado");
  }
```

## Sintaxe Alternativa

Essa sintaxe só funciona caso exista apenas um único comando a ser executado.

```java

  double nota = 7.5;

  if ( nota >= 7.0 ) 
    System.out.println("Aprovado");
  

  if (nota < 7.0 ) 
    System.out.println("Reprovado");
```

## Estrutura Senão (`else`)

```java

  double nota = 7.5;

  if ( nota >= 7.0 ) 
    System.out.println("Aprovado");
  else
    System.out.println("Reprovado");
```

## Estrutura Senão se(`else if`)

```java

  double nota = 7.5;

  if ( nota >= 7.0 ){ 
    System.out.println("Aprovado");
  } else if ( nota < 4.0 ) {
    System.out.println("Reprovado");
  } else  {
    System.out.println("Recuperação");
  }
```

Resolvendo `Fliper.java`

```java
public static void main(String[] args) {

  int p = 1;
  int r = 0;

  if ( p == 0 ) 
    System.out.println("C");
  else if ( r == 0 )
    System.out.println("B");
  else 
    System.out.println("A");
}
```

## Operadores Lógicos

1. Operador `&&` (*and*)

Executa se ambas as condições passadas forem `true`

2. Operador `||` (*or*)

Executa se pelo menos uma das condições passadas forem `true`

3. Operador Reflexivo

sem:
```java
  a = a + 1;
  a = a - 1;
  a = 2 * a;
  a = a % 10;
```

com:
```java
  a += 1; //a++
  a -= 1; //a--
  a *= 2;
  a %= 10;
```

# Estruturas de Repetição

```
1. inicialização
2. verificação
3. atualização
```

## Estrutura `while` (*enquanto*)

```java
int contador = 0;

while ( contador <= 10 ) {
  System.out.println(contador);
  contador++;
}
```

## Estrutura `for` (*para*)

```java
for (/*inicialização*/ ; /*verificação*/ ; /*atualização*/ ) {

}
```

```java
for (int i = 0; i <= 10 ; i++) {

}
```

## Keyword `break`

Quebra todo o loop

## keyword `continue`

Quebra o laço mantendo e pulando para o próximo laço do loop

30

1 + 2 + 3 + 4 + 5