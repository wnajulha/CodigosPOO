
package polimorfismo;

public class Mamifero extends Animal{
    
    private String corPelo;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    
    
    
    @Override
    public void locomover() {
        System.out.println( "locomover mamifero");
    }

    @Override
    public void alimentar() {
        System.out.println( "alimentar mamifero");
    }

    @Override
    public void emitirSom() {
        System.out.println( "Som mamifero");
    }

   

    
    
}
