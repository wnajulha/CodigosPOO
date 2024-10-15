
package metodosEspecificos;


public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
    public Caneta(String m, String c,float p){ //metodo construtor, mesmo nome da classe
        this.tampar();
        this.cor = c;
        this.modelo = m;
        this.setPonta(p);
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    public void status(){
        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Esta tampada: "+ this.tampada);
        System.out.println("De cor: "+ this.cor);
    }
}
