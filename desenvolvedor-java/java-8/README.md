# Java 8: Tire proveito dos novos recursos da linguagem

- [Link para o curso](https://cursos.alura.com.br/course/java8-lambdas)
- **Curso iniciado em: 17/11/2017**
- **Curso concluído em:**

## Aulas

1. :ok: Default methods
2. :ok: Lambdas
3. Method references
4. Streams
5. Mais Streams
6. Datas

## Anotações

### 1. Default methods

- Permite que se adicione um novo método em uma interface, e esse método seja concreto (diferente das versões anteriores. Sempre existiam métodos abstratos)

- Método sort() com Comparator<>. O comparator fará a implementação de um método compare()

- Método forEach() com Consumer<>. O Consumer fará a implementação de um método accept()

### 2. Lambdas

- Para os casos onde temos uma classe que só tem um método implementado, é uma boa prática a utilização dos Lambdas. O compilador já sabe que um certo método precisa de um certo objeto, e que esse objeto precisa da implementação de um certo método. Por exemplo:

    - Para utilizar o método forEach(), é preciso de um objeto que implemente a interface Consumer<>.
    - O objeto Consumer precisa de uma implementação de seu método accept(). Um jeito de resolvermos isso é da sequinte maneira:
    
        ```palavras.forEach(s -> System.out.println(s));```

- Interface Funcional: uma interface parece muito com uma função, pois só tem um método implementado
- Para o caso da ordenação: 

  ```palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));```

- Criação de Thread:
    
    ```new Thread(() -> System.out.println("executando um runnable")).start();```

### 3. Method references

### 4. Streams

### 5. Mais Streams

### 6. Datas

**Legenda:**

- :on: em andamento
- :ok: concluído
