package polimorfismo;

public class Main {
    public static void main(String[] args) {
       
    Mamifero M = new Mamifero();
    Peixe P = new Peixe();
    Ave A = new Ave();
    Reptil R = new Reptil();
    Canguro C = new Canguro();
    Cachorro ca = new Cachorro();
    
    //M.setIdade(2);
    //M.setMembros(4);
    //M.setPeso(24.0);
    //M.setCorPelo("marrom");
    //M.alimentar();
    
    //M.locomover();
    //A.locomover();
    //R.locomover();
    //C.locomover();
    //ca.emitirSom();
    
    //System.out.println( M.getCorPelo());
    
    System.out.println("1 reagir");
    ca.reagir("oi");
    ca.reagir("sai daqui");
    
    System.out.println("2 reagir");
    ca.reagir(11);
    ca.reagir(17);
    ca.reagir(20);
    
    System.out.println("3 reagir");
    ca.reagir(true);
    ca.reagir(false);
    
    System.out.println("4 reagir");
    ca.reagir(4,8.0);
    ca.reagir(4,11.0);
    ca.reagir(7,7.0);
    ca.reagir(7,15.0);
    }
    
    
    
}
