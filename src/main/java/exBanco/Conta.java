
package exBanco;

public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public Conta() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void abrirConta(String tipo) {
        this.setTipo(tipo); 
        this.setStatus(true); 

        if (this.getTipo().equals("cc")) { // Se for conta corrente
            this.setSaldo(50);
        } else if (this.getTipo().equals("cp")) { // Se for conta poupança
            this.setSaldo(150);
        }
        
    }
    
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta nao pode ser fechada, ainda possui saldo positivo.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta nao pode ser fechada, está em débito.");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }
    }
    
    public void sacar(float valor) {
        if (getStatus() == true) { // Verifica se a conta está ativa
            if (this.getSaldo() >= valor) { // Verifica se o saldo é suficiente para o saque
                this.setSaldo(this.getSaldo() - valor); // Deduz o valor do saque do saldo
                System.out.println("Saque de " + valor + " realizado com sucesso. Saldo atual: " + this.getSaldo());
            } else {
                System.out.println("Saldo insuficiente para realizar o saque.");
            }
        } else {
            System.out.println("Nao e possível sacar de uma conta inativa.");
        }
    }
    
    public void depositar(float valor) {
        if (getStatus() == true) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito de " + valor + " realizado com sucesso. Saldo atual: " + this.getSaldo());
        } else {
            System.out.println("Nao e possivel depositar em uma conta inativa.");
        }
    }

    public void pagarMensalidade() {
        if (getStatus() == true) {
            float valor = 0;
            if (this.getTipo().equals("cc")) {
                valor = 12;
            } else if (this.getTipo().equals("cp")) {
                valor = 20;
            }

            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Mensalidade de " + valor + " debitada com sucesso. Saldo atual: " + this.getSaldo());
            } else {
                System.out.println("Saldo insuficiente para pagar a mensalidade.");
            }
        } else {
            System.out.println("Não é possível pagar mensalidade de uma conta inativa.");
        }
    }
    
    public void contaStatus(){
        System.out.println("numero da conta: " + this.getNumConta());
        System.out.println("tipo da conta: " + this.getTipo());
        System.out.println("dono da conta: " + this.getDono());
        System.out.println("saldo da conta: " + this.getSaldo());
        System.out.println("status da conta: " + this.getStatus());
        
    }
}
