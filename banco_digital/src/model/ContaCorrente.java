package model;

public class ContaCorrente extends Conta {
    
    public ContaCorrente(String numero, Cliente cliente) {
        super(numero, cliente);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}