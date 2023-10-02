package aula4;

public class Aula4 {

    public static void main(String[] args) {
        
        Quadrado q1 = new Quadrado(2 , 5);
        System.out.println("Area do Quadrado: " + q1.calcularArea());
        
        TrianguloRetangulo tr1 = new TrianguloRetangulo(2, 5, 4, 6, 2);
        System.out.println("CalcularHipotenusa: " + tr1.calcularHipotenusa());
        
        Triangulo t1 = new Triangulo(4,4,4);
        System.out.println("CalcularHipotenusa: " + t1.calcularArea());
        
    }
    
}
