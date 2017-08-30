# :white_check_mark Git: Controle e compartilhe seu código

Legenda: :white_check_mark: Concluídos | :arrow_right: Em andamento <br/><br/><br/>

- :white_check_mark:Aula 01: Introdução ao controle de versões com Git
- :white_check_mark: Aula 02: O ciclo básico do Git
- :white_check_mark: Aula 03: Sincronização dos dados com o repositório
- :white_check_mark: Aula 04: Organização do trabalho com branches
- :white_check_mark: Aula 05: Resolução de conflitos
- :white_check_mark: Aula 06: Boas práticas no uso do Git
- :white_check_mark: Aula 07: Controle avançado de alterações
- :white_check_mark: Aula 08: Contribuição com opensource, técnicas avançadase produtividade com o Git
- :white_check_mark: Aula 09: Fazendo merges avançados com Cherry Pick
- :white_check_mark: Aula 10: Usando Git através de interfaces visuais


# Aula 01
## git tag
Tags, para marcar as versões do seu projeto
- v0.1
- v0.2

## git diff v0.1 v0.2
Ver o que foi alterado em cada versão

## git blame css/index.css
Mostra alterações linha por linha

## git clone https://github.com/...
Copia os arquivos de determinado reposítório a sua máquina local

## git checkout v0.1
Altera o repositório local fazendo com que fiquem no mesmo estado em que estavam quando a tag v0.1 foi criada

# Aula 02
## git init
Cria um repositório. O git ainda não iria fazer o levantamento dos arquivos presentes na pasta

## git add 
Adiciona arquivos para que o git faça o gerenciamento das mudanças

Adicionar todos os arquivos
* git add .
* git add --all
* git add -A
* git add camminhoDiretorio
* git add arquivo1 arquivo2

## git status
Mostra o status geral do repositório, mudanças para serem commitadas, os arquivos que ainda não estão sendo rastreados

## git config --global user.name "..."
Define o nome do usuário responsável pelas alterações de todos os repositórios nessa máquina

## git config --global user.email "..."
Define o email do usuário responsável pelas alterações de todos os repositórios nessa máquina

## git commit -m "..."
Faz o commit, ou seja, cria um nó sobre algumas alterações no projeto. A tag "-m" indica a mensagem desse commit

## git commit -a
Inclui imediatamento no commit todos os arquivos modificados ou removidos

## git add -i
Modo interativo, mostra opções para que o usuário posso decidir quais alterações farão parte do próximo commit

## Ciclo
### Working Directory 
O sistema de arquivos atual. Onde estão as alterações que estão sendo realizadas no momento

### Staging Area (index)
Depois de adicionar/remover os arquivos para o próximo commit. 

### Head
Depois do commit, é a visão do último passo do projeto que foi concluído e entregue


# Aula 03
## git log
Historicos dos commits feitos

## git whatchanged
Mostra quais arquivos foram alterados em cada commit

## git whatchanged -p
O que foi alterado em cada arquivo em cada commit

## git remote
Mostra o apelido do repositorio remoto

## git remote add origin https://...git
Adiciona um local remoto para o repositório
Pode-se ter vários locais remotos para o mesmo repositório

## git push origin master
Manda as alterações pro repositório remoto origin,no branch master

## git pull origin master
Sincroniza as alterações remotas

## git clone https://...
Obtem uma copia local do repositorio

# Aula 04
## git branch
Mostra as branchs do repositorio

## git branch name
Cria uma nova branch name

## git checkout name
Muda para a branch name

## git push -u origin design
Define que a branch design local deve estar atrelada a branch design remota

## git branch -r
Mostra as branchs remotas existentes. Porém, se o usuário não estiver sincronizado com a última versão, ele não verá quaisquer branchs novas

## git branch -t design origin/design
Cria uma branch local design que se atrela a branch remota design

## git checkout -b
Cria uma nova branch e já faz o checkout nela

## git branch -d
Remove uma branch

## git push origin :design ou git push -d origin design
Remove a branch remota design

## git branch -a
Mostra todas as branchs. Locais e remotas

## git checkout -t origin/design
Cria uma branch local design que se atrela a branch remota design, e faz o checkout dela

## git fetch origin
Verificar todas as atualizações que foram realizadas no repositório referente ao origin
