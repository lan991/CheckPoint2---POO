package br.com.fiap.delivery;

public class Pacote {
    private String codigoRastreio;
    private double peso;
    private String status;

    public Pacote(String codigoRastreio, double peso, String statusInicial) {
        if (codigoRastreio == null || codigoRastreio.trim().isEmpty()) {
            throw new IllegalArgumentException("Erro: O código de rastreio é obrigatório.");
        }
        if (peso <= 0) {
            throw new IllegalArgumentException("Erro: O peso não pode ser negativo ou zero.");
        }
        if (statusInicial == null || statusInicial.trim().isEmpty()) {
            throw new IllegalArgumentException("Erro: O pacote precisa de um status inicial.");
        }
        
        this.codigoRastreio = codigoRastreio;
        this.peso = peso;
        this.status = statusInicial;
    }

    public void atualizarStatus(String novoStatus) {
        if (novoStatus == null || novoStatus.trim().isEmpty()) {
            throw new IllegalArgumentException("Erro: O novo status não pode ser nulo ou vazio.");
        }
        this.status = novoStatus;
    }

    public String getCodigoRastreio() { return codigoRastreio; }
    public double getPeso() { return peso; }
    public String getStatus() { return status; }
}