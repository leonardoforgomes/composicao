    import java.util.ArrayList;

    public class Turno {

        // Classe criada para a adicionar um turno ao curso do aluno
        final String nome;
        final ArrayList<Turno> turnos = new ArrayList<>();

        Turno(String nome) {
            this.nome = nome;
        }

        void adicionarTurno(Turno turno) {
            this.turnos.add(turno);
            turno.turnos.add(this);
        }
    }

