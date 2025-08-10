package com.banco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.cliente.Clientes;

public class Banco {

    private String nome; 
    private List<Object> contas = new ArrayList<>();

    public Banco(Clientes cliente, int agencia, int conta){
        this.nome = "Bradesco";
        List<Object> infoCliente = Arrays.asList(cliente.getId(),cliente.getNome(),agencia,conta);
        contas.addAll(infoCliente); 
    }

    //Getters e Setters 

    public String nome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public List<Object> getContas(){
        return contas;
    }

    public void setContas(List<Object> contas){
        this.contas = contas;
    }


}
