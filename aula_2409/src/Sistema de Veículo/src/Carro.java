public class Carro extends Veiculo {
    private int quantidadePortas;

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public void exibirCarro() {
        exibirDados();
        System.out.println("Quantidade de Portas: " + quantidadePortas);
    }
}
