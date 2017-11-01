# :ok: Java II: Orientação a Objetos

- [Link para o curso](https://cursos.alura.com.br/course/java-e-orientacao-a-objetos)
- __Curso iniciado em: 31/10/2017__
- __Curso concluído em: 01/11/2017__

## Aulas

1. :ok: Herança, reescrita e polimorfismo
1. :ok: A IDE Eclipse
1. :ok: Classes abstratas
1. :ok: Interfaces
1. :ok: Exceções e controle de erros

## Anotações

### 1. Herança, reescrita e polimorfismo

- Caso exista uma função na classe mãe e na classe filha (com o mesmo nome), e uma terceira classe for utilizar essa(s) função(ões), o próprio código saberá diferenciar qual implementação usar de acordo com a classe (exemplo: classes funcionário, gerente e desenvolvedor possuem método de bonus, e a classe totalBonus utiliza somente a classe funcionário em sua implementação)

- Não faça herança quando a relação não é estritamente "é um".

### 2. A IDE Eclipse

- quick fixes, acessível pelo comando "Ctrl+1"
- Ctrl + 3 Aciona modo de descoberta de menu.
- Ctrl + F11 roda a última classe que você rodou
- Ctrl + PgUp e Ctrl + PgDown Navega nas abas abertas
- Ctrl + M Expande a View atual para a tela toda
- Ctrl + O Rápida navegação pelo arquivo
- Ctrl sobre hyperlink, ou F3

### 3. Classes abstratas

### 4. Interfaces

- Garante que determinados métodos existirão em uma classe. Exemplo: Funcionario (abstr) e Cliente possuem um método de autenticação no sistema através da interface Autenticavel)

- Interface: "Ela é um contrato onde quem assina se responsabiliza por implementar esses métodos (cumprir o contrato). Uma interface pode definir uma série de métodos, mas nunca conter implementação deles."

### 5. Exceções e controle de erros

- "Sempre que você quiser tratar o caso excepcional, nós adicionamos o try/catch no código. Mas se a intenção é apenas indicar que a exceção pode acontecer, sem desejar tratá-la, usamos o throw".

__Legenda:__

- :on: em andamento
- :ok: concluído
