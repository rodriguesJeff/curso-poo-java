package aula05;

public class ContaBanco {
    public int numConta;
    protected String tipo;

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    private String dono;
    private float saldo;
    private boolean status;

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t.equals("CC")) {
            this.setSaldo(50);
        } else if (t.equals("CP")) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta nao pode ser fechada pq ainda tem dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta nao pode ser fechada pq  tu me deve grana");
        }
    }

    public void depositar(float v) {
        if (this.status) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito de " + v + " realizado com sucesso na conta de " + this.getDono());
        } else {
            System.out.println("Impossivel depositar em contas fechadas");
        }
    }

    public void sacar(float v) {
        if (this.isStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado com sucesso");
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        } else {
            System.out.println("Impossivel sacar de contas fechadas");
        }
    }

    public void pagarMensalidade() {
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga no valor de " + v);
        } else {
            System.out.println("Impossivel pagar mensalidade em contas fechadas");
        }
    }

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void estadoAtual() {
        System.out.println("-------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Aberta: " + this.isStatus());
    }
}
