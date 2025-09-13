public class Main {
    public static void main(String[] args) {
        // Criando um carro
        Carro carro = new Carro();
        carro.marca = "Honda";
        carro.modelo = "City Sedan";
        carro.setAno(2025);
        carro.numeroPortas = 4;
        carro.tipoCombustivel = "Flex";
        carro.temSensorEstacionamento = true;
        carro.capacidadePortaMalas = 519;

        // Criando uma moto
        Moto moto = new Moto();
        moto.marca = "Royal Enfield";
        moto.modelo = "Hunter";
        moto.setAno(2025);
        moto.setCilindrada(350);
        moto.setTipoPartida("Elétrica");
        moto.setTemABS(true);
        moto.setPesoSeco(181);


        // Exibindo informações
        System.out.println("===== Informações do Carro =====");
        System.out.println(carro.informacoesVeiculo());

        System.out.println("\n===== Informações da Moto =====");
        System.out.println(moto.informacoesVeiculo());
    }
}