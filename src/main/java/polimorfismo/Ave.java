
package polimorfismo;

public class Ave extends Animal {
    
    private String corPena;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
    
    public void fazerNinho(){
        System.out.println( "Fazendo ninho...  ");
    }
    
    @Override
    public void locomover() {
        System.out.println( "locomover ave");
    }

    @Override
    public void alimentar() {
        System.out.println( "alimentar ave");
    }

    @Override
    public void emitirSom() {
        System.out.println( "Som ave");
    }
}
