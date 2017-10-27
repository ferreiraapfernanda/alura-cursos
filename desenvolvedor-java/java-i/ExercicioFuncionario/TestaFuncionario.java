/** */
class TestaFuncionario {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario();

        f1.nome = "Fernanda";
        f1.departamento = "TI";
        f1.salario = 1300.0;
        f1.rg = "3999999999";

        f1.dataEntrada = new Data();

        f1.dataEntrada.preencheData(1, 2, 2017);

        //Funcionario f2 = f1;

        //f1.recebeAumento(1000);

        f1.mostra();

        /*
        if(f1 == f2 ){
            System.out.println("iguais");
        }else{
            System.out.println("diferentes");
        }
        */


    }
}