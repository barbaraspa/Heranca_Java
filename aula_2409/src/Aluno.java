public class Aluno extends Pessoa {
     private String curso;


    public String getCurso() {
    return curso;
}

    public void setCurso(String curso) {
    this.curso = curso;
} 
        
    public void estudar() {
        System.out.println(getNome() + " está estudando ");
    }

    public void fazerProva() {
        System.out.println(getNome() + " está fazendo uma prova.");
    }
    
}