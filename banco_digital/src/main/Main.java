package main;

import model.Cliente;
import model.Conta;
import service.Banco;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        
        Cliente cliente1 = new Cliente("Barbara Poffo", "123.456.789-00");
        banco.criarContaCorrente("0001", cliente1);
        
        Conta conta = banco.obterConta("0001");
        conta.depositar(500.0);
        conta.sacar(150.0);
        
        System.out.println("Saldo da conta: " + conta.getSaldo());
    }
}