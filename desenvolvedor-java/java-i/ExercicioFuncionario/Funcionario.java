/**
 * Funcionario
 */
class Funcionario {

    String nome;
    String departamento;
    double salario;
    Data dataEntrada;
    String rg;

    // getters and setters

    void recebeAumento(double valor) {
        this.salario += valor;
    }

    double calculaGanhoAnual() {
        return this.salario * 12;
    }

    void mostra() {
        System.out.println(" - Informacoes do Funcionario - ");
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salario: " + this.salario);
        System.out.println("Data de entrada: " + this.dataEntrada.getFormatada());
        System.out.println("RG: " + this.rg);
        System.out.println("Ganho Anual: " + this.calculaGanhoAnual());
    }

}

class Empresa {

    String nome;
    String cnpj;
    Funcionario[] funcionarios;
    int tamanho;

    void adiciona(Funcionario f){
        this.funcionarios[this.tamanho] = f;
        this.tamanho++;
    }

    void mostraFuncionarios(){
        
        for(int i = 0; i < this.funcionarios.length; i++){
            if(this.funcionarios[i] == null ) continue;
            System.out.println(" - Funcionario na posicao: " + i);
            System.out.println("Nome: " + this.funcionarios[i].nome);
            System.out.println("Data de Entrada : " + this.funcionarios[i].dataEntrada.getFormatada());
            
        }
    }

    void mostraTodasAsInformacoes(){
        for(int i = 0; i < this.funcionarios.length; i++){
            if(this.funcionarios[i] == null ) continue;
            System.out.println(" - Funcionario na posicao: " + i);
            this.funcionarios[i].mostra();
        }
    }

    boolean contem(Funcionario f){
        for(int i = 0; i < this.funcionarios.length; i++){
            if(this.funcionarios[i] == null ) continue;

            if(this.funcionarios[i] == f){
                return true;
            }
        }

        return false;
    }
}
