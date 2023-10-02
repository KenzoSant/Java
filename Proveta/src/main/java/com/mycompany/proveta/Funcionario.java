package com.mycompany.proveta;


public class Funcionario extends Pessoa{
    
    public double salario;

    public Funcionario(double salario, int rg, String nome) {
        super(rg, nome);
        this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }
    
    public double obterSalario(double adicional, double desconto){
        return salario = salario + (adicional - desconto);
    }
    
    public double obterSalario(double percentualAcrescimo){
        return salario = salario * (1 + percentualAcrescimo/100);
    }
    
    //NAO PRECISA
    public void mostrar(){
        System.err.println("Salario: "+ this.getSalario());
    }
}
