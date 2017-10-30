class Data {

    private int dia;
    private int mes;
    private int ano;


    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

        if(! isDataValida(dia, mes, ano) ){
            System.out.println("A data " + getFormatada() + " não existe!");
        }
    }
    
    public String getFormatada(){
        return this.dia + "/" + this.mes + "/" + this.ano;
    }

    public boolean isDataValida(int dia, int mes, int ano){

        // Dia / mês negativo ou zerado
        if(dia <= 0 || mes <= 0){
            return false;
        }

        int ultimoDia = 31;

        // Ultimo dia do mês
        if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
            ultimoDia = 30;
        }else if(mes == 2){
            ultimoDia = 28;

            // Ano bissexto
            if( (ano % 400 == 0) || ( (ano % 4 == 0) && (ano % 100 != 0) ) ) {
                ultimoDia = 29;
            }
        }

        if(dia > ultimoDia){
            return false;
        }

        return true;

    }




}