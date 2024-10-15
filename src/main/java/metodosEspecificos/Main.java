
package metodosEspecificos;

public class Main {
    public static void main(String[] args){
        Caneta c1 = new Caneta("BIC", "Amarela", 0.4f);
        Caneta c2 = new Caneta("BIC 2.0", "Azul", 0.5f);
        c1.status();
        c2.status();
    }
}
