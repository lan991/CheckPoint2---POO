package br.com.fiap.delivery;

public class Caminhao extends Veiculo {
    private int quantidadeEixos;

    public Caminhao(String placa, double capacidadeCarga, int quantidadeEixos) {
        super(placa, capacidadeCarga);
        if (quantidadeEixos <= 0) {
            throw new IllegalArgumentException("Erro: O caminhão deve ter pelo menos 1 eixo.");
        }
        this.quantidadeEixos = quantidadeEixos;
    }

    public int getQuantidadeEixos() { return quantidadeEixos; }
}
