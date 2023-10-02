package com.mycompany.proveta;

public class Proveta {

    public static void main(String[] args) {
       
        Funcionario f1 = new Funcionario(300, 123456, "Kenzo");
        //f1.obterSalario(50,10);
        f1.obterSalario(30);
        f1.mostrar();
        
    }
}
