
package ProjetoYoutube;

public class Visualizacao {
 
    private Garfanhoto espectador;
    private Video filme;

    public Visualizacao(Garfanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public Garfanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Garfanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" +
                espectador + ", filme=" + filme + '}';
    }
    
    
    
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    public void avaliar(float nota){
        int tot = 0;
        if(nota <= 20){
            tot = 3;
        }else if (nota <= 50){
            tot = 5 ;
          
        }else if(nota<= 90){
        tot = 8;
        }else{
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
        
    }
}
