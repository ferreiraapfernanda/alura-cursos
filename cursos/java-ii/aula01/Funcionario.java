class Funcionario {
    private String nome;
    protected double salario;

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getBonus(){
        return this.salario * 0.2;
    }
}

class Gerente extends Funcionario{

    public double getBonus(){
        return this.salario * 0.3;
    }

    public void cobraEntrega(){
        System.out.println("Está pronto?");
    }
}

class Desenvolvedor extends Funcionario {

    public double getBonus(){
        return this.salario * 0.25;
    }
}

class TotalizadorDeBonus {

    private double total = 0;

    public void adiciona(Funcionario f){
        total+= f.getBonus();
    }

    public double getTotal(){
        return this.total;
    }
}

class TestaFuncionario {

    public static void main(String[] args){
        Funcionario joao = new Funcionario();
        joao.setSalario(1000);

        System.out.println(joao.getBonus());

        Gerente joaquim = new Gerente();
        joaquim.setSalario(2000);
        joaquim.cobraEntrega();

        System.out.println(joaquim.getBonus());

        TotalizadorDeBonus totalizador = new TotalizadorDeBonus();
        totalizador.adiciona(joao);
        totalizador.adiciona(joaquim);

        System.out.println(totalizador.getTotal());
    }
}