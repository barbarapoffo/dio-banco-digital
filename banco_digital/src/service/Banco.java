package service;

import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

import java.util.HashMap;
import java.util.Map;

public class Banco {
    private Map<String, Conta> contas = new HashMap<>();

    public void criarContaCorrente(String numero, Cliente cliente) {
        contas.put(numero, new ContaCorrente(numero, cliente));
    }

    public void criarContaPoupanca(String numero, Cliente cliente) {
        contas.put(numero, new ContaPoupanca(numero, cliente));
    }

    public Conta obterConta(String numero) {
        return contas.get(numero);
    }
}