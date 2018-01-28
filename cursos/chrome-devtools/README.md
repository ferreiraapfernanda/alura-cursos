# Chrome DevTools: analise, inspecione e depure suas páginas Web

- [Link para o curso](https://cursos.alura.com.br/course/chrome-devtools)
- **Curso iniciado em: 02/01/2018**
- **Curso concluído em: 27/01/2018**

## Aulas

1. :ok: Introdução: Editando seu site em tempo real
2. :ok: O Console
3. :ok: Debuggando
4. :ok: Conectividade
5. :ok: Analisando a performance
6. :ok: Persistencia, Cookies e Cache
7. :ok: Device Mode

## Anotações

### 1. Introdução: Editando seu site em tempo real

- O html é o arquivo de texto que o navegador lê e interpreta para o usuário, portanto, o que enxergamos no Dev Tools é o resultado dessa leitura. Então, é criada uma estrutura que representa o documento html no formato de objetos criados in memória chamada de DOM - Document Object Model.
- Quando um elemento é adicionado ao DOM ele também é a somatória de diversos comportamentos que se acumulam. Para descobrir quais são os tipo desses elementos utilizamos a aba Properties.

### 2. O Console

- $$(query) funciona como document.querySelectorAll(query), enquanto $(query) funciona como document.querySelector(query). Mas cuidado! O segundo comando é reescrito pelo jQuery, portanto só funciona dessa forma sem jQuery.

- console.table([{nome:"Guilherme", empresa:"Alura"},{nome:"Paulo", empresa:"Caelum"}])

- document.querySelector(".cabecalho").style.backgroundColor="green"

### 3. Debuggando

### 4. Conectividade

- O botão faz uma chamada assíncrona. Toda requisição assíncrona é do tipo xhr, pois elas são feitas usando o objeto XMLHttpRequest no chrome.

### 5. Analisando a performance

- Aba Timeline/Performance: Cada frame não pode ser maior que 16 ms

- Aba Profiles: grava o processamento da página, em relação as funções e o tempo de processamento. Grava um screenshot do uso da memória, que detalha os objetos salvos na memória.

- Aba Audits: analisa o código e sugere melhorias.

### 6. Persistencia, Cookies e Cache

- Aba Application: verificar o que está salvo, cookies.

- Aba Security: certificados de segurança, 

### 7. Device Mode

- Simula tipos de telas, além de visualizar a media query.

- Possíbilidade de exibir o frame do sipositivo. Bom para screenshots de como fica o site nas plataformas mobile.

- Simular o hardware mobile, como geolocalização e acelerômetro. (Mais ferramentas > Sensores)

**Legenda:**

- :on: em andamento
- :ok: concluído
