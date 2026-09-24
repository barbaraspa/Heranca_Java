public class Professor extends Pessoa {
    // 1. Atributos privados (Encapsulamento)
    private String disciplina;
    private double salario;
    
    // 2. Método ensinar()
    public void ensinar() {
        // Usa o getter getNome() herdado de Pessoa para exibir o nome
        System.out.println("\n" + getNome() + " está ensinando " + this.disciplina + ".");
    }

    // Getters e Setters para a Disciplina
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    // Getters e Setters para o Salário
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}