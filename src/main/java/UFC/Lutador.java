
package UFC;


public class Lutador {
    // atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    
    //metodos especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.getPeso()<= 52.2){
            this.categoria = "invalido";
        }else if (this.getPeso()<70.3){
            this.categoria = "Peso Leve";
        }else if (this.getPeso()<83.9){
            this.categoria = "Peso Medio";
        }else if (this.getPeso()<=120.2){
            this.categoria = "Peso Pesado";
        }else{
            this.categoria = "invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int votorias) {
        this.vitorias = votorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    public Lutador(String nome, String nacionalidade,int idade,double altura,double peso,int vitorias,int derrotas,int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }
    
    //metudos publicos 
    public void apresentar(){
        System.out.println("O lutador " + nome);
        System.out.println("Do " + nacionalidade);
        System.out.println("De " + idade);
        System.out.println("Do peso " + peso);
        System.out.println("Da categoria " + categoria);
        System.out.println("Que possui " + vitorias + " vitorias ");
        System.out.println("Que possui " + derrotas +" derrotas");
        System.out.println("Que possui " + empates +  " empates");
    }
   
    public void status(){
        System.out.println( nome);
        System.out.println(peso);
        System.out.println("vitorias:" + vitorias );
        System.out.println("derrotas:" + derrotas );
        System.out.println("empates:" + empates );
        
        
    }
}
