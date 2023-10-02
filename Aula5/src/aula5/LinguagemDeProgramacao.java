package aula5;

import javax.swing.JOptionPane;


public class LinguagemDeProgramacao extends Disciplina implements Pratica {
    
    private String laboratorio;

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public LinguagemDeProgramacao() {
        System.out.println("Disciplina LPI Criada");
    }

    @Override
    public float calculaMedia() {
        String entrada;
        float nota1,nota2;
        
        entrada = JOptionPane.showInputDialog("Digite a 2 nota: ");
        nota1 = Float.parseFloat(entrada);
        
        entrada = JOptionPane.showInputDialog("Digite a 2 nota: ");
        nota2 = Float.parseFloat(entrada);
        
        return (nota1 + nota2) / 2;
    }

    @Override
    public String obterLaboratorio() {
        return this.laboratorio;
    }
    
}
