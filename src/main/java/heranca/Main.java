
package heranca;

public class Main {
    
    public static void main(String[] args) {
    
       Pessoa  p = new Pessoa("ana", 19,"feminino");
       Aluno a = new Aluno(123, "matematica", "pedro", 20,"masculino");
       Professor prof = new Professor("matematico", 13.000, "julio", 57, "masculino");
       Funcionario f = new Funcionario("Armazenamento", true,"nelson", 34,"masculino"); 
       
       
       
       System.out.println(a.getIdade());
       a.fazerAniv();
       System.out.println(a.getIdade());
       System.out.println(a.getCurso());
    }
}
