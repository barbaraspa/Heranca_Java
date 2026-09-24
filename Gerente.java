public class Gerente extends Funcionario {
    private String departamento;
    private int numeroFuncionarios;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public void gerenciar() {
        System.out.println(getNome() + " gerencia o departamento de " + departamento + " com " + numeroFuncionarios + " funcionários.");
    }
}