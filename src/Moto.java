public class Moto extends Veiculo {
    private int cilindrada;
    private String tipoPartida;
    private boolean temABS;
    private double pesoSeco;

    @Override
    public String informacoesVeiculo() {
        return "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Ano: " + getAno() + "\n" +
                "Cilindrada: " + cilindrada + "cc\n" +
                "Tipo de Partida: " + tipoPartida + "\n" +
                "ABS: " + (temABS ? "Sim" : "Não") + "\n" +
                "Peso Seco: " + pesoSeco + " kg";
    }
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    public String getTipoPartida() {
        return tipoPartida;
    }

    public void setTipoPartida(String tipoPartida) {
        this.tipoPartida = tipoPartida;
    }

    public double getPesoSeco() {
        return pesoSeco;
    }

    public void setPesoSeco(double pesoSeco) {
        this.pesoSeco = pesoSeco;
    }

    // Novo setter para temABS
    public void setTemABS(boolean temABS) {
        this.temABS = temABS;
    }
}