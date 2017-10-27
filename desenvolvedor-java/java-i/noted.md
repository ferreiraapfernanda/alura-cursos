# Java I: Primeiros passos

[Link para o curso](https://cursos.alura.com.br/course/primeiros-passos-com-java)

__Curso iniciado em: 26/10/2017__
__Curso concluído em:__

1. :white_check_mark: A linguagem Java
1. :white_check_mark: Variáveis e fluxo
1. :on: Começando com Orientação a objetos
1. Arrays
1. Modificadores de acesso
1. Construtores
1. Atributos e métodos estáticos

## 1. A linguagem Java

- Java compilado para um pseudocódigo (__byte code__), que sera interpretado pela __JVM__. A JVM é uma máquina virtual, uma camada para que cada SO poderá interpretar e executar as funções. Ela isola totalmente a aplicação do sistema operacional.

- O código compilado __.class__ pode ser executado em qualquer SO

- Case sensitive

- Exemplo de código Java

```java

class OlaMundo {
    public static void main (String[] args) {
        System.out.println("Olá Java");
    }
}

```

- Compilação: __javac OlaMundo.java__

- Execução __java OlaMundo__

- Ofuscador, para a liberação do programa [ProGuard](http://proguard.sf.net)

## 2. Variáveis e fluxo

- Tipos primitivos, referenciados com minúsculo

```java

int
char
double
float
long numeroGrande = 999999999L;
String
boolean

```

- Casting ```java long copiaDeNumero = (int) numero;```

## 3. Começando com Orientação a objetos

## 4. Arrays

## 5. Modificadores de acesso

## 6. Construtores

## 7. Atributos e métodos estáticos

Legenda:
:on: em andamento
:white_check_mark: concluído
