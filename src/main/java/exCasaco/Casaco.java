
package exCasaco;

public class Casaco {
    
    String cor;
    int tamanho;
    boolean capuz;
    boolean estado;
    
    void status(){
        System.out.println("Este casaco e " + cor + ", do tamanho " + tamanho + " e possui capuz: " + capuz);
    
}
    void vestir(){
        if(estado == true){
            System.out.println("pode vestir o casaco");
        } else {
            System.out.println("desvire o casaco, esta do avesso ");
        }
    }
    void avesso(){
        this.estado = false;
    }
    void desvirado(){
        this.estado = true;
    }
}
