
package aula3;

public class Aula3 {

    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario(3000,"Mateus",12345);
        f1.obterSalario(50,10);
        f1.obterSalario(50);
        f1.mostrar();
    } 
}
