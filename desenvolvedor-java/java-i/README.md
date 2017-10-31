# :white_check_mark: Java I: Primeiros passos

- [Link para o curso](https://cursos.alura.com.br/course/primeiros-passos-com-java)
- __Curso iniciado em: 26/10/2017__
- __Curso concluído em: 30/10/2017__

1. :white_check_mark: A linguagem Java
1. :white_check_mark: Variáveis e fluxo
1. :white_check_mark: Começando com Orientação a objetos
1. :white_check_mark: Arrays
1. :white_check_mark: Modificadores de acesso
1. :white_check_mark: Construtores
1. :white_check_mark: Atributos e métodos estáticos

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

- Private indica que __somente a própria classe__ pode utilizar esse atributo

- Não criar get e set para todos os atributos. Alguns atributos são muito importantes, e precisam seguir diversas regras de negócio, por isso, utilizam-se métodos mais ricos/complexos.

## 6. Construtores

- Pode ter quantos construtores quiser, contando que não cause conflito (se tiver um contrutor que requer um int e um double, não pode ter outro que requer somente esses dois tipos)

## 7. Atributos e métodos estáticos

- __static__ significa que é um método da classe, e não do objeto como normalmente se é definido

- Static assim como os modificadores de acesso é um recurso que é destinado a problemas específicos, quando você precisa interagir com as classes e não com os objetos, nestes casos e apenas nestes casos o static deve ser considerado.

Legenda:
:on: em andamento
:white_check_mark: concluído
