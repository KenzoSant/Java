
package primeiraheranca;

public class PrimeiraHeranca {

    public static void main(String[] args) {
        /*Pessoa p1 = new Pessoa("Maria"); //Construtor exige que tenha um nome(Valor)
        
        p1.setNome("Maria Clara");
        System.out.println(p1.getNome());*/
        
        Aluno a1 = new Aluno("Carlos", 2003);
        System.out.println("Nome:"+a1.getNome()+"\nRA:"+a1.getRa());
        
        Professor p1 = new Professor("Alek", 1420);
        System.out.println("\n\nNome:"+p1.getNome()+"\nMatricula:"+p1.getMatricula());
    }
    
}
