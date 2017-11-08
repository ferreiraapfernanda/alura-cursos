# Java III: Orientação a Objetos

- [Link para o curso](https://cursos.alura.com.br/course/java-e-bibliotecas)
- __Curso iniciado em: 06/11/2017__
- __Curso concluído em:__

## Aulas

1. :ok: Pacotes
1. :ok: Jar e Javadoc
1. :ok: Java.lang
1. :ok: Pacote java.io
1. :on: Collections framework
1. Threads

## Anotações

### 1. Pacotes

- __Ctrl+Shift+O__ faz a importação automática das classes necessárias para o arquivo

### 2. Jar e Javadoc

- ```Project > Generate Javadoc```
- Javadoc Commmand: C:\Program Files\Java\jdk-9.0.1\bin\javadoc.exe

### 3. Java.lang

- A classe que nos ajudará a evitar arredondamentos e a armazenar números decimais bem grandes é a java.math.BigDecimal

### 4. Pacote java.io

#### Para Leitura

- __InputStream__ lê os bytes
- __InputStreamReader__ lê os caracteres
- __BufferedReader__ utiliza a memória do disco para utilizar memória do disco, não ficar lendo somente um caracter por vez, ou lê linhas de uma vez só
- Utiliza o método __readLine()__ para exibir uma linha inteira
- Método close fecha todos os readers __close()__

#### Para Escrita

Mesmo processo:

- Abre o arquivo através de bytes __OutputStream__
- Cria um __OutputStreamWriter__ para escrever os caracteres (e não bytes)
- Cria o __BufferedWriter__ para escrever linhas, e não caracter por caracter

### 5. Collections framework

- Collections

```java
Collections.sort(contas);
```

- LinkedList

```java
List<String> nomes = new LinkedList<String>();
```

- HashSet: implementação co método __hashCode()__

```java
Set<String> nomes = new HashSet<String>();
```

- HashMap: faz a ligação, onde a string representa uma identificação do valor.

```java
Map<String, Conta> contas = new HashMap<String, Conta>();
java contas.put("Diretor", c1);
```

- ```reverse(List<?> list)``` - Inverte a ordem dos elementos em uma lista específica.
- ```rotate(List<?> list, int distance)``` - Rotaciona os elementos de uma lista específica a uma distância específica.
- ```shuffle(List<?> list)``` - Troca aleatoriamente a lista específica usando um código padrão de aleatoriedade.

### 6. Threads

__Legenda:__

- :on: em andamento
- :ok: concluído
