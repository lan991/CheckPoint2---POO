package br.com.fiap.delivery;

public class Principal {
    public static void main(String[] args) {
        System.out.println("--- TESTES DE SUCESSO ---");
        try {
            Veiculo caminhao = new Caminhao("ABC-1234", 5000.0, 3);
            Veiculo moto = new Moto("XYZ-9876", 15.0, true);
            
            Pacote pacote1 = new Pacote("BR999", 10.5, "Pendente");
            Pacote pacote2 = new Pacote("BR888", 2.0, "Pronto para Envio");
            
            Rota rota1 = new Rota(pacote1, caminhao);
            rota1.iniciarEntrega();
            
            Rota rota2 = new Rota(pacote2, moto);
            rota2.iniciarEntrega();
            
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("\nTESTES DE FALHA (VALIDAÇÕES DA DEVOLUTIVA)");
        try {
            Veiculo caminhaoInvalido = new Caminhao("", -10.0, 3);
        } catch (IllegalArgumentException e) {
            System.err.println("Cenário 1 (Placa vazia/Peso negativo) bloqueado: " + e.getMessage());
        }

        try {
            Pacote pacoteTeste = new Pacote("BR111", 5.0, "Pronto");
            pacoteTeste.atualizarStatus(""); 
        } catch (IllegalArgumentException e) {
            System.err.println("Cenário 2 (Status vazio) bloqueado: " + e.getMessage());
        }
    }
}
