
package exBanco;

public class Main {
    public static void main(String[] args) { 
        Conta c1 = new Conta(); 
        
        c1.setNumConta(111);
        c1.setDono("Ana Julia");
        c1.abrirConta("cc");
        c1.depositar(100f);
        c1.contaStatus();
        
        
        Conta c2 = new Conta(); 
        
        c2.setNumConta(222);
        c2.setDono("Ana Luisa");
        c2.abrirConta("cp");
        c2.depositar(500f);
        c2.sacar(650);
        c2.fecharConta();
        c2.contaStatus();
        
        
    
}
}
