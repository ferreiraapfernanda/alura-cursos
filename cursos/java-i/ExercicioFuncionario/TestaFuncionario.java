/** */
class TestaFuncionario {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario();

        f1.setNome("Fernanda");
        f1.setDepartamento("TI");
        f1.setSalario(1300.0);
        f1.setRg("3999999999");

        Data data = new Data(1,2,2017);

        f1.setDataEntrada(data);

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