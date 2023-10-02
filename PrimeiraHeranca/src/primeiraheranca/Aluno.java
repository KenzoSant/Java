
package primeiraheranca;

public class Aluno extends Pessoa {
    private int ra;

    public Aluno(String nome) {
        super(nome);
        this.ra = -1;
    }
    
    public Aluno(String nome,int ra) {
        super(nome);
        this.ra = ra;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    } 
    
}
