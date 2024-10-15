
package heranca2;

public class Bolsista extends Aluno{
    
    private double bolsa;

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
    
    
    
    public void renovarBolsa(){
        System.out.println("Renovando mensalidade do aluno " + this.getNome());
    }

    @Override
    public void pagarMensalidade() {
        super.pagarMensalidade(); 
        System.out.println( this.getNome() + " e bolsista! pagamento anulado.");
    }
    
    
    
    
}
