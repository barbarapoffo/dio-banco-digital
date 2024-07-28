package model;

public class Transacao {
    private String tipo;
    private double valor;
    private Conta conta;

    public Transacao(String tipo, double valor, Conta conta) {
        this.tipo = tipo;
        this.valor = valor;
        this.conta = conta;
    }

    public String getTipo() {
        return tipo;
    }
    
    public double getValor() {
        return valor;
    }
    
    public Conta getConta() {
        return conta;
    }
}