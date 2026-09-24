public class Principal {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();

        // Usando setters para alterar os dados protegidos (private)
        gerente.setNome("Carlos Andre");
        gerente.setIdade(46);
        gerente.setSalario(5830.00);
        gerente.setDepartamento("Tecnologia");
        gerente.setNumeroFuncionarios(10);

        // Exibindo os dados
        gerente.apresentar();
        gerente.gerenciar();
    }
}
