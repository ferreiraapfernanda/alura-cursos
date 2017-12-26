class BalancoTrimestral {


    public static void main(String[] args){
        int gastosJaneiro = 1500;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;

        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

        System.out.println("Gasto do trimestre: R$" + gastosTrimestre);

        float mediaMensal = gastosTrimestre / 3;

        System.out.println("Valor da média mensal = " + mediaMensal);
    }
}