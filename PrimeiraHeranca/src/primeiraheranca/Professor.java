
package primeiraheranca;


public class Professor extends Pessoa {
    private int matricula;

    public Professor(String nome,int matricula) {
        super(nome);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    
}
