
package aula3;

public class Pessoa {
    
    private String nome;
    private int rg;

    public Pessoa(String nome, int rg) {
        this.nome = nome;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }
    
    public void mostrar(){
        System.out.println("Nome: "+ this.getNome());
        System.out.println("RG: "+ this.getRg());
    }
}
