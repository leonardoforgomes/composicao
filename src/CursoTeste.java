public class CursoTeste {

        public static void main(String[] args) {

            Aluno aluno1 = new Aluno("João Paulo Araujo");
            Aluno aluno2 = new Aluno("Maria dos Santos Abreu");
            Aluno aluno3 = new Aluno("Leonardo Gomes da Silva");

            Curso curso1 = new Curso("Java Completo 2022");
            Curso curso2 = new Curso("Programação web 2022");
            Curso curso3 = new Curso("HTML5 e CSS3");

            Turno manha = new Turno("Manhã - 08:00 ÁS 11:00 AM");
            Turno tarde = new Turno("Tarde - 14:00 ÁS 17:00 PM");
            Turno noite = new Turno("Noite - 19:00 ÁS 22:00 PM");

            curso1.adicionarAluno(aluno1);

            curso2.adicionarAluno(aluno1); // RELACIONAMENTO ENTRE OS OBJETOS
            curso2.adicionarAluno(aluno2);
            curso2.adicionarAluno(aluno3);

            curso3.adicionarAluno(aluno2);
            curso3.adicionarAluno(aluno3);


            for(Aluno aluno: curso2.alunos) {
                System.out.println("O aluno(a) " + aluno.nome + " está matriculado no curso "
                        + curso2.nome + " no turno da " + noite.nome);

                System.out.println();
                // o resultado é para puchar todos os alunos que estão matriculados no curso 2, no turno noite

            }
        }
}

