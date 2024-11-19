import java.security.PrivateKey;

public class Turma {
    private Professor professor;
    private Aluno alunos[];
    private String curso;
    private String horario;
    private String disciplina;
    private int sala;
    private int contAlunos;

    public Turma(Professor professor, String curso, String horario, String disciplina, int sala) {
        this.professor = professor;
        alunos = new Aluno[40];
        this.curso = curso;
        this.horario = horario;
        this.disciplina = disciplina;
        this.sala = sala;
        contAlunos =0;
    }

    public boolean adicionarAluno(Aluno aluno){
        if(contAlunos < alunos.length){
            for(int k =0; k < 40; k++){
                if(alunos[k] == null){
                    alunos[k] = aluno;
                }
            }
            contAlunos++;
            return true;
        }else{
            return false;
        }
    }
    //TODO: fazer os gets e sets

    public String getProfessor() {
        return professor.getNome();
    }

    public void setProfessor(Professor professsor){
        this.professor = professor;
    }

    public String getCurso(){
        return curso;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public String getDisciplina(){
        return disciplina;
    }

    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }

    public int getSala(){
        return sala;
    }
    public void setSala(int sala){
        this.sala = sala;
    }
    public int getContAlunos(){
        return contAlunos;
    }
}
