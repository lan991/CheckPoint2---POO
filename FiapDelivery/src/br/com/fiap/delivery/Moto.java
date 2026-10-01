package br.com.fiap.delivery;

public class Moto extends Veiculo {
    private boolean possuiBau;

    public Moto(String placa, double capacidadeCarga, boolean possuiBau) {
        super(placa, capacidadeCarga);
        this.possuiBau = possuiBau;
    }

    public boolean isPossuiBau() { return possuiBau; }
}
