package com.conta;

import com.cliente.Clientes;

public class ContaCorrente extends Conta{

    public ContaCorrente(Clientes cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("==== Dados Conta Corrente ====");
        super.imprimirDadosConta();
    }



}

