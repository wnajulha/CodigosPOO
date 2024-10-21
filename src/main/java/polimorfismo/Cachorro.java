
package polimorfismo;

public class Cachorro extends Mamifero{

    @Override
    public void emitirSom() {

        System.out.println("AU AU AU");
    }
    
    
    public void reagir(String frase){
        
        if(frase.equals("oi" )|| frase.equals("ola" ) ){
            System.out.println("Abanando o rabo...");
        }else{
            System.out.println("rosnando...");
        }
    }
    
    public void reagir(int hora){
        if(hora < 12){
            System.out.println("Abanando o rabo... " );
        }else if(hora>=18){
            System.out.println( "Ignorando... ");
        }else{
            System.out.println( "Abanando o rabo e latindo...");
        }
    }
    
    public void reagir(boolean dono){
        if(dono){
            System.out.println( "Abanando rado... ");
        }else{
            System.out.println( "Rosnando... ");
        }
    }
    
    public void reagir(int idade, double peso){
        if(idade< 5){
            if(peso<10){
               System.out.println( "Abanando rabo... ");
 
            }else{
                System.out.println( "Latindo... ");

            }
        }else{
            if(peso>10){
               System.out.println( "Rosnando...");
 
            }else{
                System.out.println( "Ignorando... ");

            }

        }
    
    
    }
}
