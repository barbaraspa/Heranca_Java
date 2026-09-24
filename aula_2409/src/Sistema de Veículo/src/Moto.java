public class Moto extends Veiculo {
    private int cilindradas;

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public void exibirMoto() {
        exibirDados();
        System.out.println("Cilindradas: " + cilindradas + " cc");
    }
}
