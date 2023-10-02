
package aula2;

import javax.swing.JOptionPane;

public class Tv {
    
    //Atributos
    private boolean ligada;
    private int volume;
    private int canal;
    
    //Metodos
    public void TV(){
        ligada = false;
    }
    
    public void ligarTv(){
        ligada = true;
    }
    
    public void desligarTv(){
        ligada = false;
    }
    
    public void mostrarTv(){
        if(ligada){
            JOptionPane.showMessageDialog(null,"Tv da Sala esta Ligada");
        }else{
            JOptionPane.showMessageDialog(null,"Tv da Sala esta Desligada");
        }
    }
}
