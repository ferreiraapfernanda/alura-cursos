# git init
Cria um repositório. O git ainda não iria fazer o levantamento dos arquivos presentes na pasta

# git add 
Adiciona arquivos para que o git faça o gerenciamento das mudanças

Adicionar todos os arquivos
* git add .
* git add --all
* git add -A
* git add camminhoDiretorio
* git add arquivo1 arquivo2

# git status
Mostra o status geral do repositório, mudanças para serem commitadas, os arquivos que ainda não estão sendo rastreados

# git config --global user.name "..."
Define o nome do usuário responsável pelas alterações de todos os repositórios nessa máquina

# git config --global user.email "..."
Define o email do usuário responsável pelas alterações de todos os repositórios nessa máquina

# git commit -m "..."
Faz o commit, ou seja, cria um nó sobre algumas alterações no projeto. A tag "-m" indica a mensagem desse commit

# git commit -a
Inclui imediatamento no commit todos os arquivos modificados ou removidos

# git add -i
Modo interativo, mostra opções para que o usuário posso decidir quais alterações farão parte do próximo commit

# Ciclo
## Working Directory 
O sistema de arquivos atual. Onde estão as alterações que estão sendo realizadas no momento

## Staging Area (index)
Depois de adicionar/remover os arquivos para o próximo commit. 

## Head
Depois do commit, é a visão do último passo do projeto que foi concluído e entregue