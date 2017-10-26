class Conta {

    int numero;
    Pessoa titular;
    double saldo;
    int agencia;

    void deposita(double valorASerDepositavo){
        this.saldo += valorASerDepositavo;
    }

    void saca(double valorASerSacado){
        if(this.saldo >= valorASerSacado){
            this.saldo -= valorASerSacado;
        }
    }

    void transfere(double valor, Conta destino){
        this.saldo -= valor;
        destino.saldo += valor;
    }

}

class Pessoa {
    String nome;
    String cpf;
    String dataDeNascimento;

}


class Programa {

    public static void main(String[] args){

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