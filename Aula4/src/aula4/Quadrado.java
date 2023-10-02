package aula4;

public class Quadrado extends Poligono {
    
    private double tamanhoLado;

    public Quadrado(int numeroLados, double tamanhoLado) {
        super(numeroLados);
        this.tamanhoLado = tamanhoLado;
    }  
    
    
    public double calcularArea(){
        return this.tamanhoLado * this.tamanhoLado;
    }
    
    
}
