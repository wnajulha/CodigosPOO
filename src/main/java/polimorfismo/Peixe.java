
package polimorfismo;

public class Peixe extends Animal{
    
    private String corEscama;
    
    public void soltarBolha(){
        System.out.println( "Soltando bolhas... ");
    }
    
    @Override
    public void locomover() {
        System.out.println( "locomover peixe");
    }

    @Override
    public void alimentar() {
        System.out.println( "alimentar peixe");
    }

    @Override
    public void emitirSom() {
        System.out.println( "Peixe nao faz som");
    }
}
