package br.com.fiap.delivery;

public abstract class Veiculo {
    private String placa;
    private double capacidadeCarga;

    public Veiculo(String placa, double capacidadeCarga) {
        if (placa == null || placa.trim().isEmpty()) {
            throw new IllegalArgumentException("Erro: A placa não pode ser nula ou vazia.");
        }
        if (capacidadeCarga <= 0) {
            throw new IllegalArgumentException("Erro: A capacidade de carga deve ser maior que zero.");
        }
        this.placa = placa;
        this.capacidadeCarga = capacidadeCarga;
    }

    public String getPlaca() { return placa; }
    public double getCapacidadeCarga() { return capacidadeCarga; }
}