public class Semaforo {
    // Atributo para armazenar o valor atual da cor
    private String cor;

    // Construtor para inicializar o semáforo
    public Semaforo(String cor) {
        this.cor = cor;
    }

    // Método para alterar a cor do semáforo
    public void mudarCor() {
        switch (this.cor) {
            case "vermelho":
                this.cor = "verde";
                break;
            case "verde":
                this.cor = "amarelo";
                break;
            case "amarelo":
                this.cor = "vermelho";
                break;

        }
    }

    // Método para obter a cor atual
    public String getCor() {
        return this.cor;
    }

    // Método para setar a cor atual
    public void setCor(String cor) {
        this.cor = cor;
    }

    // Método sleep para simular a espera
    public void esperar(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            System.out.println("Erro ao esperar!");
        }
    }
}