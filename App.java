public class App {
    public static void main(String[] args) {

        // Criar os objetos dos semáforos
        Semaforo semaforoA = new Semaforo("verde");
        Semaforo semaforoB = new Semaforo("vermelho");
        Semaforo semaforoC = new Semaforo("vermelho");
        Semaforo semaforoPedestre = new Semaforo("vermelho");

        printStatus(semaforoA, semaforoB, semaforoC, semaforoPedestre);

        // Loop infinito para simular o funcionamento dos semáforos
        while (true) {
            // Semáforo A muda de verde para amarelo após 6 segundos
            semaforoA.esperar(6);
            semaforoA.mudarCor(); // muda para amarelo
            printStatus(semaforoA, semaforoB, semaforoC, semaforoPedestre);

            // Semáforo A muda de amarelo para vermelho após 2 segundos
            semaforoA.esperar(2);
            semaforoA.mudarCor(); // muda para vermelho
            printStatus(semaforoA, semaforoB, semaforoC, semaforoPedestre);

            // Atualiza o semáforo de pedestre para verde
            semaforoPedestre.mudarCor(); // muda para verde
            printStatus(semaforoA, semaforoB, semaforoC, semaforoPedestre);

            // Espera o pedestre atravessar
            semaforoPedestre.esperar(2);

            // O semáforo de pedestre pisca antes de mudar para vermelho fixo
            if (semaforoPedestre.getCor().equals("verde")) {
                for (int i = 0; i < 3; i++) { // Pisca 3 vezes
                    semaforoPedestre.setCor("off"); // Desliga o semáforo de pedestre
                    printStatus(semaforoA, semaforoB, semaforoC, semaforoPedestre);
                    semaforoPedestre.esperar(1); // Espera 1 segundo

                    semaforoPedestre.setCor("vermelho"); // Liga como vermelho
                    printStatus(semaforoA, semaforoB, semaforoC, semaforoPedestre);
                    semaforoPedestre.esperar(1); // Espera 1 segundo
                }

                // Semáforo de pedestre fica vermelho fixo
                semaforoPedestre.setCor("vermelho");
                printStatus(semaforoA, semaforoB, semaforoC, semaforoPedestre);
            }

            // Continua o ciclo dos outros semáforos
            
            // Atualiza o semáforo B para verde
            semaforoB.mudarCor(); // muda para verde
            printStatus(semaforoA, semaforoB, semaforoC, semaforoPedestre);

            // Semáforo B muda de verde para amarelo após 6 segundos
            semaforoB.esperar(6);
            semaforoB.mudarCor(); // muda para amarelo
            printStatus(semaforoA, semaforoB, semaforoC, semaforoPedestre);

            // Semáforo B muda de amarelo para vermelho após 2 segundos
            semaforoB.esperar(2);
            semaforoB.mudarCor(); // muda para vermelho
            printStatus(semaforoA, semaforoB, semaforoC, semaforoPedestre);

            // Atualiza o semáforo C para verde
            semaforoC.mudarCor(); // muda para verde
            printStatus(semaforoA, semaforoB, semaforoC, semaforoPedestre);

            // Semáforo C muda de verde para amarelo após 6 segundos
            semaforoC.esperar(6);
            semaforoC.mudarCor(); // muda para amarelo
            printStatus(semaforoA, semaforoB, semaforoC, semaforoPedestre);

            // Semáforo C muda de amarelo para vermelho após 2 segundos
            semaforoC.esperar(2);
            semaforoC.mudarCor(); // muda para vermelho
            printStatus(semaforoA, semaforoB, semaforoC, semaforoPedestre);

            // Atualiza o semáforo A para verde
            semaforoA.mudarCor(); // muda para verde
            printStatus(semaforoA, semaforoB, semaforoC, semaforoPedestre);
        }
    }

    // Método para imprimir o status dos semáforos
    public static void printStatus(Semaforo semaforoA, Semaforo semaforoB, Semaforo semaforoC, Semaforo semaforoPedestre) {
        // Limpar a tela
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Semáforo A:");
        printSemaforo(semaforoA);
        System.out.println("Semáforo B:");
        printSemaforo(semaforoB);
        System.out.println("Semáforo C:");
        printSemaforo(semaforoC);
        System.out.println("Semáforo Pedestre:");
        printSemaforo(semaforoPedestre);
    }

    public static void printSemaforo(Semaforo semaforo) {
        String cor = semaforo.getCor();
        String vermelho = "";
        String amarelo = "";
        String verde = "";
        String off = "";

        if (cor.equals("vermelho")) {
            vermelho = "\u001B[41m \u001B[0m"; // Vermelho
        } else {
            vermelho = " ";
        }
        if (cor.equals("amarelo")) {
            amarelo = "\u001B[43m \u001B[0m"; // Amarelo
        } else {
            amarelo = " ";
        }
        if (cor.equals("verde")) {
            verde = "\u001B[42m \u001B[0m"; // Verde
        } else {
            verde = " ";
        }
        if (cor.equals("off")) {
            off = "\u001B[40m \u001B[0m"; // LED apagado (preto)
        } else {
            off = " ";
        }

        System.out.println(" " + vermelho);
        System.out.println(" " + amarelo);
        System.out.println(" " + verde);
        System.out.println(" " + off);
    }
}