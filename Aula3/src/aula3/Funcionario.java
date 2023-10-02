
package aula3;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(double salario, String nome, int rg) {
        super(nome, rg);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double obterSalario(double adicional, double desconto){
        salario=salario + adicional - desconto  ;       
        return this.salario;
    }
    
    public double obterSalario(double percentualAcrescimo){
        salario += salario + (percentualAcrescimo/100);
        return this.salario;
    }
    
    public void mostrar(){
        super.mostrar();
        System.out.println("Salario: "+this.getSalario());
    }
    
}
