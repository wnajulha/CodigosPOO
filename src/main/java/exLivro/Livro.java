
package exLivro;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean setAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    public String detalhes(){
        return "O livro " + titulo + " do autor " +
                autor + " esta na pagina " + pagAtual + " de "  
                + totPaginas + " paginas " + "do leitor " + leitor.getNome();
    }
    
    
    
    @Override
    public void abrir(){
        this.setAberto(true);
    }
    
    @Override
    public void fechar(){
        this.setAberto(false);
    }
    
    @Override
    public void folhear(int p){
        if(this.aberto == true ){
            if(p <= this.totPaginas){
                this.setPagAtual(p);
            } else{
                System.out.println("o livro possui apenas "+ this.getTotPaginas());
            }
        }else{
         System.out.println("o livro esta fechado");
        }
        
        
        
    }

    @Override
    public void avancarpag() {
        this.setPagAtual(pagAtual + 1);    }

    @Override
    public void voltarpag() {
        this.setPagAtual(pagAtual - 1);
    }
    

    
}