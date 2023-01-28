
        import java.util.ArrayList;
        import java.util.List;

        public class Curso {

        final String nome;
        final List<Aluno> alunos = new ArrayList<>();


        Curso(String nome) {
            this.nome = nome;
        }

        // método para adicionar aluno
        void adicionarAluno(Aluno aluno) {
            this.alunos.add(aluno);
            aluno.cursos.add(this); // relação bidirecional
        }

        public void adicionarTurno(Turno manha) {

        }
    }

