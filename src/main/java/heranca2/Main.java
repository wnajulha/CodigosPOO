
package heranca2;

public class Main {
    public static void main(String[] args) {
    
        //Pessoa p = new Pessoa(); naopode pois pessoa e uma classe abstrata
        /* Visitante v = new Visitante();
        v.setNome("juio");
        v.setIdade(22);
        v.setSexo("masculino");
        
        System.out.println(v.toString());*/
        
        Aluno A = new Aluno();
        A.setNome("ana");
        A.setIdade(19);
        A.setCurso("ti");
        A.setSexo("feminino");
        A.setMatricula(1111);
        
        System.out.println(A.toString());
        A.pagarMensalidade();
        
        
        Bolsista b = new Bolsista();
        b.setBolsa(5.5f);
        b.setCurso("informatica");
        b.setIdade(25);
        b.setSexo("f");
        b.setNome("julia");
        
        b.pagarMensalidade();
        
        Tecnico t = new Tecnico();
        t.Praticar();
    }
    
}
