public class Main {
    // Adicionado 'public' e '(String[] args)' para o Java conseguir executar
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Barbara");
        aluno.setIdade(20);
        aluno.setCurso("Analise e desenvolvimento de Sistemas");
        

        aluno.apresentar();
              
        aluno.fazerProva();

         // 3. Criando o objeto Professor
        Professor prof = new Professor();
        
        // Definindo as informações usando os Setters
        prof.setNome("Melissa");
        prof.setIdade(42);
        prof.setDisciplina("Java");
        prof.setSalario(5830.00);

        

        // Exibindo todas as informações na tela usando os Getters
        System.out.println("\n--- Informações do Professor ---");
        System.out.println("Nome: " + prof.getNome());
        System.out.println("Idade: " + prof.getIdade() + " anos");
        System.out.println("Disciplina: " + prof.getDisciplina());
        System.out.println("Salário: R$ " + prof.getSalario());

        // Executando o método ensinar
        prof.ensinar();
    }    
}