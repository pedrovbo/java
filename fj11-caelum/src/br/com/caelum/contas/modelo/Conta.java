package br.com.caelum.contas.modelo;

public class Conta {

    private double saldo;
    String titular;
    int numero;


    String agencia;

    public void deposita(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Não é possível depositar um valor negativo");
        }
    }


    // TODO - método saca está aceitando saque de valor negativo e
    // fazendo com que o saldo seja somado no evento saque de valor negativo
    public void saca(double valor) {

        if (valor < 0) {
            System.out.println("Não há como sacar valor negativo.");
        } else {
            if (this.saldo >= valor) {
                this.saldo -= valor;
            } else {
                System.out.println("Saldo insuficiente.");
            }

        }


    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }


    public String getTitular() {
        return titular;
    }

}
