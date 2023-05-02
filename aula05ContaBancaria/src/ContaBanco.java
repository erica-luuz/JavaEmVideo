public class ContaBanco {
    public int numConta;
    protected String tipoConta;
    private String titular;
    private Double saldo;
    private Boolean status = false;

    public ContaBanco() {
    }

    public ContaBanco(int numConta, String titular) {
        this.setNumConta(numConta);
        this.setTipoConta(tipoConta);
        this.setTitular(titular);
        this.setSaldo(0.0);
        this.setStatus(false);
    }
    public void estadoAtual(){
        System.out.println("---------------------------------");
        System.out.println("Contas: " + this.getNumConta());
        System.out.println("Tipo da Conta: " + this.getTipoConta());
        System.out.println("Titular: " + this.getTitular());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    public void abrirConta(String tipoConta) {
        this.setTipoConta(tipoConta);
        this.setStatus(true);
        if (tipoConta.equals("CC")) { // ele esta pedindo para usar o equals;
            this.setSaldo(50.0);
        } else if(tipoConta == "CP") { // aqui vou deixar assim, da pra usar dos dois jeitos;
            this.setSaldo(150.0);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada,porque ainda tem dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada, pois tem débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(Double valor) {
        if (this.getStatus()) { // ou (this.getStatus() == true)
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizado com sucesso na conta de " + this.getTitular());
        } else {
            System.out.println("Impossível depositar em conta fechada!");
        }
    }

    public void sacar(Double valor) {
        if (this.getStatus()) {  //Assim ja esta perguntando se getStatus é verdadeiro
            if (getSaldo() >= valor) {
                this.setSaldo(getSaldo() - valor);
                System.out.println("Saque realizado na conta de: " + this.getTitular());
            } else {
                System.out.println("Saldo insuficiente para saque!");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada!");
        }
    }
    public void pagarMensal() {
        Double valor = 0.0;
        if (this.getTipoConta() == "CC") {
            valor = 12.0;
        } else if (this.getTipoConta() == "CP") {
            valor = 20.0;
        }
        if (this.getStatus()) {
            if (this.getSaldo() > 0) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Mensalidade paga com sucesso por " + this.getTitular());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível pagar uma conta fechada!");
        }
    }

    public void extrato() {
        System.out.println("Seu saldo é R$ " + getSaldo());
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}