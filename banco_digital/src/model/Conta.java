package model;

public abstract class Conta {
    protected String numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(String numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public abstract void depositar(double valor);
    public abstract void sacar(double valor);
    public double getSaldo() {
        return saldo;
    }
    
    public String getNumero() {
        return numero;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
}