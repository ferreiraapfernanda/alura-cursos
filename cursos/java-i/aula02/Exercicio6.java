class Exercicio6 {

    public static void main(String[] args){

        long fatorial = 1;

        for (int i = 1; i < 30; i++) {
            fatorial *= i;
            System.out.println("Fatorial de "+i+ " = " +fatorial);
        }
    }
}