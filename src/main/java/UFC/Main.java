
package UFC;

public class Main {
    public static void main(String[] args){
        Lutador[] L = new Lutador[6];

        // Inicializando cada posição do vetor com uma instância de Lutador
        L[0] = new Lutador("Lutador 1", "Brasil", 25, 1.80, 75.0, 10, 2, 1);
        L[1] = new Lutador("Lutador 2", "EUA", 30, 1.85, 82.5, 15, 3, 0);
        L[2] = new Lutador("Lutador 3", "Japão", 28, 1.70, 68.0, 12, 5, 2);
        L[3] = new Lutador("Lutador 4", "Rússia", 32, 1.90, 90.0, 20, 4, 1);
        L[4] = new Lutador("Lutador 5", "França", 26, 1.75, 72.3, 18, 1, 3);
        L[5] = new Lutador("Lutador 6", "Canadá", 29, 1.82, 85.6, 13, 2, 1);
    
        Luta UFC1 = new Luta();
        UFC1.marcarLuta(L[2], L[3]);
        UFC1.lutar();
        //L[0].status();
        //\L[4].status();
        
    }
    
}
