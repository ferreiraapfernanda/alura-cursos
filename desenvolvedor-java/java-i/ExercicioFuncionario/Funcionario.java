/**
 * Funcionario
 */
class Funcionario {

    private String nome;
    private String departamento;
    private double salario;
    private Data dataEntrada;
    private String rg;

    // getters and setters

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public void setDataEntrada(Data dataEntrada){
        this.dataEntrada = dataEntrada;
    }

    public void setRg(String rg){
        this.rg = rg;
    }


    public String getNome(){
        return this.nome;
    }

    public String getDepartamento(){
        return this.departamento;
    }

    public String getSalario(){
        return this.salario;
    }

    public String getDataEntrada(){
        return this.dataEntrada;
    }

    public String getRg(){
        return this.rg;
    }

    
    public void recebeAumento(double valor) {
        this.salario += valor;
    }

    public double getGanhoAnual() {
        return this.salario * 12;
    }

    public void mostra() {
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

    private String nome;
    private String cnpj;
    private Funcionario[] funcionarios;
    private int tamanho;

    public Funcionario getFuncionario (int posicao) {
        return this.funcionarios[posicao];
    }

    public void setNome(Strng nome){
        this.nome = nome;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCnpj(){
        return this.cnpj;
    }

    public void adiciona(Funcionario f){
        this.funcionarios[this.tamanho] = f;
        this.tamanho++;
    }

    public void mostraFuncionarios(){
        
        for(int i = 0; i < this.funcionarios.length; i++){
            if(this.funcionarios[i] == null ) continue;
            System.out.println(" - Funcionario na posicao: " + i);
            System.out.println("Nome: " + this.funcionarios[i].nome);
            System.out.println("Data de Entrada : " + this.funcionarios[i].dataEntrada.getFormatada());
            
        }
    }

    public void mostraTodasAsInformacoes(){
        for(int i = 0; i < this.funcionarios.length; i++){
            if(this.funcionarios[i] == null ) continue;
            System.out.println(" - Funcionario na posicao: " + i);
            this.funcionarios[i].mostra();
        }
    }

    public boolean contem(Funcionario f){
        for(int i = 0; i < this.funcionarios.length; i++){
            if(this.funcionarios[i] == null ) continue;

            if(this.funcionarios[i] == f){
                return true;
            }
        }

        return false;
    }
}
