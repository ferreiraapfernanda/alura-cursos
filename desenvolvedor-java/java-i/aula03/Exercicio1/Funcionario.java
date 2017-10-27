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
