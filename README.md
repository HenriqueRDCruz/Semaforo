# Simulação de Semáforo com Controle de Pedestres

## Descrição
Este projeto simula o comportamento de um conjunto de semáforos, incluindo controle de trânsito e semáforos de pedestres, utilizando a linguagem de programação Java. O objetivo é simular o ciclo de mudança de cores dos semáforos e garantir que os semáforos de veículos e pedestres funcionem de forma coordenada.

## Funcionalidades
- **Semáforos para veículos**: O sistema simula três semáforos para carros (A, B, e C), que alternam entre as cores verde, amarelo e vermelho com temporizações apropriadas.
- **Semáforo de pedestres**: Controla a passagem de pedestres, alternando entre verde e vermelho e piscando antes de voltar ao vermelho.
- **Troca de cores**: Implementa a troca automática de cores nos semáforos com tempos ajustados para verde, amarelo e vermelho.
- **Piscar do semáforo de pedestre**: Antes de o semáforo de pedestres ficar vermelho, ele pisca três vezes, simulando a transição de segurança.

## Execução
1. **Ciclo do Semáforo A**:
   - Inicia em verde, permanece por 6 segundos.
   - Muda para amarelo, permanece por 2 segundos.
   - Muda para vermelho e permite o trânsito dos pedestres.
   
2. **Semáforo de Pedestres**:
   - Altera para verde quando o Semáforo A está vermelho.
   - Permanece verde por 2 segundos, pisca 3 vezes e retorna para vermelho.

3. **Ciclo dos Semáforos B e C**:
   - Semáforos B e C alternam o ciclo de forma semelhante ao Semáforo A, garantindo a coordenação entre os três semáforos de veículos.

## Tecnologias Utilizadas
- **Java**: Linguagem de programação utilizada para desenvolver a simulação.
- **ANSI Escape Codes**: Utilizado para colorir a saída no terminal e simular as luzes do semáforo.

   ## Instruções de Execução
1. Clone este repositório e Compile o código:
   ```bash
   git clone https://github.com/HenriqueRDCruz/Semaforo.git
   javac App.java
   ```
2. Execute o programa:
   ```bash
   App.java
   ```
## Exemplo de Execução
4. O status dos semáforos será impresso no terminal em um loop contínuo, mostrando o ciclo de cores e a interação com os pedestres.
