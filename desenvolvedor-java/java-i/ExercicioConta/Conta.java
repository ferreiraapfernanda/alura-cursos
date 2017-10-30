class Conta {

    int numero;
    Pessoa titular;
    private double saldo;
    int agencia;
    private double limite;

    public Conta(int numero, double limite){
        this(numero, limite, 0);
    }

    public Conta(int numero, double limite, double saldoInicial){
        this.numero = numero;
        this.limite = limite;
        this.saldo = saldoInicial;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setLimite(double limite){
        this.limite = limite;
    }

    public void deposita(double valorASerDepositavo) {
        this.saldo += valorASerDepositavo;
    }

    public void saca(double valorASerSacado) {

        if (valorASerSacado > this.saldo + this.limite) {
            System.out.println("Saque invalido");
        } else {
            this.saldo -= valorASerSacado;
        }
    }

    public void transfere(double valor, Conta destino) {
        this.saldo -= valor;
        destino.saldo += valor;
    }

}

class Pessoa {
    String nome;
    String cpf;
    String dataDeNascimento;

    String endereco;
}

/*
class Programa {

    public static void main(String[] args) {

        Conta mauricio = new Conta();
        mauricio.numero = 123;
        mauricio.saldo = 800.0;
        mauricio.agencia = 842;

        mauricio.titular = new Pessoa();
        mauricio.titular.nome = "Mauricio Aniche";
        mauricio.titular.cpf = "123456789";
        mauricio.titular.dataDeNascimento = "10/10/2010";

        System.out.println(mauricio.titular.nome);

        mauricio.deposita(100.0);
        mauricio.saca(5000.0);

        Conta guilherme = new Conta();
        guilherme.numero = 456;
        guilherme.saldo = 1200.0;

        guilherme.deposita(100.0);

        mauricio.saca(100.0);
        guilherme.deposita(100.0);

        mauricio.transfere(100.0, guilherme);

        System.out.println("Saldo Mauricio: " + mauricio.saldo);
        System.out.println("Saldo Guilherme: " + guilherme.saldo);
    }
}

*/