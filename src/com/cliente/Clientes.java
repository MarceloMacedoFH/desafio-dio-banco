package com.cliente;
public class Clientes {

    private static int Id_Padrao = 1;
    private int id; 
    private String nome;

    //Construtor
    public Clientes(String nome){
        this.id   = Id_Padrao++;
        this.nome = nome;
    }

    //Geters e Setters 

    public int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }




}
