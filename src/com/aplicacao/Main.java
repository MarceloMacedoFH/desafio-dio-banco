package com.aplicacao;

import com.cliente.Clientes;
import com.conta.ContaCorrente;
import com.conta.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        Clientes cli1 = new Clientes();
        cli1.setNome("Marcelo");

        Clientes cli2 = new Clientes();
        cli2.setNome("Maria");

        ContaCorrente ccCli1 = new ContaCorrente(cli1);
        ContaPoupanca cpCli1 = new ContaPoupanca(cli1);

        ContaCorrente ccCli2 = new ContaCorrente(cli2);
        ContaPoupanca cpCli2 = new ContaPoupanca(cli2);

        
        //Cliente 1
        ccCli1.depositar(100);
        ccCli1.imprimirExtrato();
        cpCli1.imprimirExtrato();
        System.out.println();

        ccCli1.transferir(100, cpCli1);
        ccCli1.imprimirExtrato();
        cpCli1.imprimirExtrato();
         
        System.out.println();

        //Cliente 2

        ccCli2.depositar(300);
        ccCli2.imprimirExtrato();
        cpCli2.imprimirExtrato();
        System.out.println();

        ccCli2.transferir(200, cpCli2);
        ccCli2.imprimirExtrato();
        cpCli2.imprimirExtrato();
        
    }

    

    

}
