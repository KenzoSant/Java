package aula5;

public class Aula5 {

    public static void main(String[] args) {
        LinguagemDeProgramacao lp = new LinguagemDeProgramacao();
        
        lp.setCodigo(120);
        lp.setLaboratorio("Lab 6");
        
        System.out.println("Lab: "+ lp.obterLaboratorio());
        System.out.println("Cod: "+ lp.getCodigo());
        System.out.println("Media: "+ lp.calculaMedia());
    }
    
}
