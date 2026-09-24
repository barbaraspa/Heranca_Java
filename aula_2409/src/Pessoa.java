public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}
    public int getIdade() {
    return idade;
}

    public void setIdade(int idade) {
    this.idade = idade;
}

    public void apresentar() {
        System.out.println("\n--- Apresentação ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
    }

    
}