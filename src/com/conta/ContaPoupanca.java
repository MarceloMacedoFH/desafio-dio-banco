package com.conta;

import com.cliente.Clientes;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Clientes cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("==== Dados Conta Poupança ====");   
        super.imprimirDadosConta();
    }
    

}
