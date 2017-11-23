# Java: Dominando as Collections

- [Link para o curso](https://cursos.alura.com.br/course/java-collections)
- **Curso iniciado em: 23/11/2017**
- **Curso concluído em:**

## Aulas

1. :ok: Trabalhando com ArrayList
2. :ok: Listas de objetos
3. :ok: Relacionamentos com coleções
4. :ok: Mais práticas com relacionamentos
5. O poder dos sets
6. Aplicando o Set no modelo
7. Equals e hashcode
8. Outros sets e iterators
9. Qual Collection usar
10. Mapas

## Anotações

### 1. Trabalhando com ArrayList

- Se fizer um simples **String[] aulas** por exemplo, não tem tantos métodos e tantas maneiras de se trabalhar.

### 2. Listas de objetos

- Para a ordenação de uma lista, todos os objetos devem implementar a interface **Comparable**, ou seja, quando tempos uma lista de Aulas, a classe Aula deve extender de Comparable, que por sua vez, exige que se tenha implementado o método **compareTo()**. Exemplo: ```aulas.sort(Comparator.comparing(Aula::getTempo));```

### 3. Relacionamentos com coleções

- ```private List<Aula> aulas``` = Menos comprometimento com o tipo de lista (baixa acoplamento)

- ```return Collections.unmodifiableList(aulas);``` retorna uma cópia READ-ONLY da lista de aulas, importante para quando quer controlar quais métodos/quem pode modificar a lista

- ArrayList busca mais rápido, mas o processo de remoção e inserção no começo é mais demorado (**consumo de tempo linear**).

- LinkedList já é mais rápida nas inserções e remoções, mas a busca de um elemento é mais demorado.

### 4. Mais práticas com relacionamentos

- Agora que a lista está READ-ONLY, a ordenação dessa lista não é mais possível. Uma maneira de fazer isso é criando uma nova lista, passando essa lista imutável no construtor: ```List<Aula> aulas = new ArrayList<>(aulasImutaveis);```

- Métodos da classe Collections:
  - **reverse()** inverte a ordem da lista
  - **shuffle()** embaralha a ordem da lista
  - **singletonList()** devolve lista imutavel que contêm um único elemento especificado
  - **nCopies()** retorna lista imutável com a quantidade escolhida de um determinado elemento: ```(Collections.nCopies(1000, (Type)null);```

### 5. O poder dos sets

### 6. Aplicando o Set no modelo

### 7. Equals e hashcode

### 8. Outros sets e iterators

### 9. Qual Collection usar

### 10. Mapas

**Legenda:**

- :on: em andamento
- :ok: concluído
