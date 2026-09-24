public class Main {
    public static void main(String[] args) {
        
        // --- INSTANCIANDO O CARRO ---
        Carro carro = new Carro();
        carro.setMarca("Toyota");
        carro.setModelo("Corolla");
        carro.setAno(2023);
        carro.setQuantidadePortas(4);

        System.out.println("=== DADOS DO CARRO ===");
        carro.exibirCarro();

        System.out.println(); // Linha em branco para separar

        // --- INSTANCIANDO A MOTO ---
        Moto moto = new Moto();
        moto.setMarca("Honda");
        moto.setModelo("CB 500F");
        moto.setAno(2022);
        moto.setCilindradas(500);

        System.out.println("=== DADOS DA MOTO ===");
        moto.exibirMoto();
    }
}