package br.com.fiap.delivery;

public class Rota {
    private Pacote pacote;
    private Veiculo veiculo;

    public Rota(Pacote pacote, Veiculo veiculo) {
        if (pacote == null || veiculo == null) {
            throw new IllegalArgumentException("Erro: Rota exige um pacote e um veículo válidos.");
        }
        this.pacote = pacote;
        this.veiculo = veiculo;
    }

    public void iniciarEntrega() {
        System.out.println("Logística aprovada!");
        System.out.println("-> Entregando pacote [" + pacote.getCodigoRastreio() + 
                           "] com o veículo [" + veiculo.getPlaca() + "]");
    }
}
