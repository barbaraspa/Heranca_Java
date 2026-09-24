public class Principal {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        
        // Uso correto dos setters
        gerente.setNome("Carlos Andre");
        gerente.setIdade(46);
        gerente.setSalario(5830.00);
        gerente.setDepartamento("Tecnologia da Informação");

        // Métodos de exibição
        gerente.apresentar();
        gerente.gerenciar();
    }
}