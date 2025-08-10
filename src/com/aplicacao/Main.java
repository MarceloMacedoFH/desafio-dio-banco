package com.aplicacao;

import com.cliente.Clientes;
import com.conta.ContaCorrente;
import com.conta.ContaPoupanca;

public class Main {

    public static void main(String[] args) {

        //Cadastrando Cliente
        Clientes cli = new Clientes("Marcelo");

        //Cadastrando contas 
        ContaCorrente ccCli1 = new ContaCorrente(cli);
        ContaPoupanca cpCli1 = new ContaPoupanca(cli);
        
        //Cliente 1
        ccCli1.depositar(100);
        ccCli1.imprimirExtrato();
        cpCli1.imprimirExtrato();
        System.out.println();

        ccCli1.transferir(100, cpCli1);
        ccCli1.imprimirExtrato();
        cpCli1.imprimirExtrato();
         
        System.out.println();


    }

    

    

}
