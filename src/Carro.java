public class Carro extends Veiculo {
    public int numeroPortas;
    public String tipoCombustivel;
    public boolean temSensorEstacionamento;
    public int capacidadePortaMalas;

    @Override
    public String informacoesVeiculo() {
        return "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Ano: " + getAno() + "\n" +
                "Número de Portas: " + numeroPortas + "\n" +
                "Tipo de Combustível: " + tipoCombustivel + "\n" +
                "Sensor de Estacionamento: " + (temSensorEstacionamento ? "Sim" : "Não") + "\n" +
                "Capacidade do Porta-Malas: " + capacidadePortaMalas + " litros";
    }
}