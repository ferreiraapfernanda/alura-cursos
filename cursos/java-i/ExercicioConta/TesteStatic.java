class TesteStatic {

    public static void main(String[] args){

        Conta joao = new Conta();
        System.out.println(joao.getNumero());

        Conta jose = new Conta();
        System.out.println(jose.getNumero());

        // Invoca o método estático, sendo ele um método da classe
        System.out.println(Conta.x());
    }



}