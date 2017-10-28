class Turma {

    Aluno[] alunos;

    void imprimeNotas() {
        for (int i = 0; i < this.alunos.length; i++) {
            Aluno aluno = this.alunos[i];

            if(aluno == null){
                continue;
            }

            System.out.println(aluno.nota);
        }
    }
}

class Aluno {
    String nome;
    int nota;
}

class TesteTurma {

    public static void main(String[] args) {

        Turma turma1 = new Turma();
        turma1.alunos = new Aluno[10]; // Array é um objeto por sí só, então precisa instanciar

        // Para cada valor no array, é preciso criar um novo objeto Aluno
        turma1.alunos[0] = new Aluno();
        turma1.alunos[0].nome = "Mauricio";
        turma1.alunos[0].nota = 9;

        turma1.alunos[1] = new Aluno();
        turma1.alunos[1].nome = "Marcelo";
        turma1.alunos[1].nota = 5;

        turma1.alunos[2] = new Aluno();
        turma1.alunos[2].nome = "Ana";
        turma1.alunos[2].nota = 10;

        turma1.imprimeNotas();

    }
}