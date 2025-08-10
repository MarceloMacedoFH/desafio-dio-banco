package com.conta;

import com.cliente.Clientes;

public abstract class Conta implements IConta {

    private static final int Agencia_Padrao = 1;
    private static int Conta_Padrao = 1;
    protected int agencia;
    protected int conta;
    protected double saldo;
    protected Clientes cliente;
    //protected Clientes cliente;

    //Construtor 
    public Conta(Clientes cliente){
        this.agencia = Agencia_Padrao;
        this.conta = Conta_Padrao++;
        this.cliente = cliente;
    }

    //Metodos
    @Override
    public void sacar(double valor) {
        try {
            this.saldo -= valor;    
        } catch (Exception e) {
            throw new UnsupportedOperationException("Unimplemented method 'sacar'");
        }
    }

    @Override
    public void depositar(double valor) {
        try {
            this.saldo += valor;    
        } catch (Exception e) {
            throw new UnsupportedOperationException("Unimplemented method 'depositar'");
        }
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        try {
            this.sacar(valor);
            contaDestino.depositar(valor);    
        } catch (Exception e) {
            throw new UnsupportedOperationException("Unimplemented method 'transferir'");
        }
        
    }

    protected void imprimirDadosConta(){
        System.out.println(String.format("Títular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.conta));
        System.out.println(String.format("Saldo: R$: %.2f", this.saldo));
    }


    //Getters e Setters 

    public int agencia(){
        return agencia;
    }

    public int conta(){
        return conta;
    }

    public double saldo(){
        return saldo;
    }

    

}
