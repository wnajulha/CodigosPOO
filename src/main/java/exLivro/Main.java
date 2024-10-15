
package exLivro;


public class Main {
    
    public static void main(String[] args) {
        
        Pessoa[] P = new Pessoa[2];
        Livro[] L = new Livro[3];
        
        P[0] = new Pessoa("Ana", 19, "F");
        P[1] = new Pessoa("joao", 20, "M");
        
        L[0] = new Livro("Assim que acaba", "cooleen", 250,P[0]);
        L[1] = new Livro("Aprendendo java", "guanabara", 300, P[1]);
        L[2] = new Livro("assim que comeca", "cooleen", 240, P[0]);
        
        L[1].abrir();
        L[1].folhear(40);
        L[1].avancarpag();
        L[1].avancarpag();
        L[1].avancarpag();
        
        System.out.println(L[1].detalhes());
        
        
         
          
    }
}
