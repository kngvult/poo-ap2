public abstract class Veiculo {
    public String marca;
    public String modelo;
    private int ano;

    public abstract String informacoesVeiculo();

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}