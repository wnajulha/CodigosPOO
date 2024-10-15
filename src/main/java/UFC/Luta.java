
package UFC;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rouds;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiantes() {
        return desafiante;
    }

    public void setDesafiantes(Lutador desafiantes) {
        this.desafiante = desafiantes;
    }
  
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria())
                && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
            System.out.println("Luta marcada com sucesso");
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
            System.out.println("Impossivel marcar a luta!!!");
                    
        }
       
    }
    public void lutar(){
        if(this.aprovada){
            System.out.println("--- LUTADOR DESAFIADO ---");
            this.desafiado.apresentar();
            System.out.println("--- LUTADOR DESAFIANTE ---");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 ou 1 ou 2
            System.out.println("=== RESULTADO ===");
            switch(vencedor){
                case 0: // empate
                    System.out.println("EMPATE!!!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // desafiado vence
                    System.out.println("VITORIA DE " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // desafiante vence
                    System.out.println("VITORIA DE " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
            System.out.println("===================");
        }else{
            System.out.println("A luta nao pode acontecer!!!");
        }
        
    }
}
