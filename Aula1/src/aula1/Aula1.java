package aula1;

import javax.swing.JOptionPane;

public class Aula1 {

    public static void main(String[] args) {
        float n1=10, n2=0, n3=0;
        int op;
        //Opcoes =new Conta();
        
        //System.out.println("Fala");
        //JOptionPane.showMessageDialog(null, "Ola");
        
        n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Base: " ));
        n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Altura: " ));
        n3 = n1 * n2;
        JOptionPane.showMessageDialog(null,"Area = "+n3);
        
        /*do{
            opcao=Integer.parseInt(JOptionPane.showInputDialog(
            "Menu de Opçoes \n\n"
          + "1-Soma \n"
          + "2-Subtracao \n"
          + "3-Multiplicação \n"
          + "4-Fim \n\n Escolha uma opçao do menu:"));
            
            if(op==1){
                n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o 1: " ));
                n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o 1: " ));
                
                op.depositar(valor);
            }
            
        }while(op!=4);*/
}
}
