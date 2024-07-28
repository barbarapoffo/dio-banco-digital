
# Desafio Banco Digital

Este projeto é uma simulação de um banco digital implementado em Java, utilizando conceitos de Programação Orientada a Objetos (POO). O objetivo é criar um sistema de banco básico que gerencia contas, clientes e transações financeiras.


## Funcionalidades

1- Conta
* depositar(double valor): Deposita um valor na conta.
* sacar(double valor): Saca um valor da conta, se houver saldo suficiente.
* getSaldo(): Retorna o saldo atual da conta.

2- Cliente
* getNome(): Retorna o nome do cliente.
* getCpf(): Retorna o CPF do cliente.

3- Banco
* criarContaCorrente(String numero, Cliente cliente): Cria uma nova conta corrente.
* criarContaPoupanca(String numero, Cliente cliente): Cria uma nova conta poupança.
* obterConta(String numero): Obtém a conta associada ao número fornecido.
