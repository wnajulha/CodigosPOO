
package ProjetoYoutube;

public class Main {
    public static void main(String[] args) {
        
        Video V[] = new Video[3];
        
        V[0] = new Video("Aula 1");
        V[1] = new Video("Aula 2");
        V[2] = new Video("Aula 3");
        
        //System.out.println(V[0].toString());
        
        Garfanhoto G[] = new Garfanhoto[2];
        G[0] = new Garfanhoto("Ana", 19,"F","ana");
        G[1] = new Garfanhoto("Julia", 20,"F","julia");
        
        //System.out.println(G[0].toString());
        
        
        Visualizacao VZ[] = new Visualizacao[5];
        VZ[0] = new Visualizacao(G[0],V[0]);//ana ve aula 1
        VZ[0].avaliar();
        System.out.println(VZ[0].toString());      

        VZ[1] = new Visualizacao(G[0],V[1]);// ana ve aula 2
        VZ[1].avaliar(51.0f);
        System.out.println(VZ[1].toString());
        
    }
}
