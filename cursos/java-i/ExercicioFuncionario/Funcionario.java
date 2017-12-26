/**
 * Funcionario
 */
class Funcionario {

    private String nome;
    private String departamento;
    private double salario;
    private Data dataEntrada;
    private String rg;
    private int identificador;

    private static int numeroIncremental = 0;

    // getters and setters

    public Funcionario(String nome){
        this.nome = nome;
        this.identificador = ++numeroIncremental;
    }

    public int getIdentificador(){
        return this.identificador;
    }

    public Funcionario(String nome){
        this.nome = nome;        
    }

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

    public double getSalario(){
        return this.salario;
    }

    public Data getDataEntrada(){
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
        System.out.println("Ganho Anual: " + this.getGanhoAnual());
    }

}

class Empresa {

    private String nome;
    private String cnpj;
    private Funcionario[] funcionarios;
    private int tamanho;


    public Empresa(int tamanho){
        funcionarios = new Funcionario[tamanho];
    }

    public Funcionario getFuncionario (int posicao) {
        return this.funcionarios[posicao];
    }

    public void setNome(String nome){
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
            System.out.println("Nome: " + this.funcionarios[i].getNome());
            System.out.println("Data de Entrada : " + this.funcionarios[i].getDataEntrada().getFormatada());
            
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
