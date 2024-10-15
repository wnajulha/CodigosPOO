
package classeCaneta;

public class Caneta {

    public String modelo;
    public String cor;
    public float ponta;
    protected int carga;
    protected boolean tampada;
    
   public void status(){
       System.out.println("Uma caneta do medelo: " + this.modelo);
       System.out.println("Da cor " + this.cor);
       System.out.println("De ponta: " + this.ponta);
       System.out.println("Com carga de : " + this.carga);
       System.out.println("Que esta fechada ? " + this.tampada);
       
   }
   public void rabiscar(){
       if (this.tampada == true){
         System.out.println("Nao pode rabiscar, a caneta esta tampada");  
       } else {
          System.out.println("Esta rabiscando");  
       }
   } 
   protected void tampar(){
       this.tampada = true;
   } 
   protected void destampar(){
       this.tampada = false;
   }

}
