package aula05;

public class ContaBanco {
    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("--------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("--------------------------------    ");
    }

    // Método Construtor
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
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
        if (tipo == "CC") {
            this.setSaldo(50);
        } else if (tipo == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta(int numConta) {
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada, pois ainda tem dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada, pois tem débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float n) {
        if (this.getStatus() == true) {
            this.setSaldo(this.getSaldo() + n);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar em uma conta fechada");
        }
    }

    public void sacar(float n) {
        if (this.getStatus() == true) {
            if (this.getSaldo() >= n) {
                this.setSaldo(this.getSaldo() - n);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo Insuficiente para esse saque");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada");
        }
    }

    public void pagarMensal() {
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getStatus() == true){
            this.setSaldo(this.getSaldo() - v);
        }else{
            System.out.println("Impossível pagar");
        }

    }
}
