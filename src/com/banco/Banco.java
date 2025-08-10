package com.banco;

import java.util.List;
import com.conta.Conta;

public class Banco {

    private String nome; 
    private List<Conta> contas;

    //Getters e Setters 

    public String nome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public List<Conta> geContas(){
        return contas;
    }

    public void setContas(List<Conta> contas){
        this.contas = contas;
    }


}
