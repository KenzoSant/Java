package aula4;


public class TrianguloRetangulo extends Triangulo implements Retangulo{
    
    private double catetoAdj;
    private double catetoOpo;

    public TrianguloRetangulo(double catetoAdj, double catetoOpo, int numeroLados, double base, double altura) {
        super(numeroLados, base, altura);
        this.catetoAdj = catetoAdj;
        this.catetoOpo = catetoOpo;
    }

    @Override
    public void setCatetos(double catetoAdj, double catetoOpo) {
        this.catetoAdj = catetoAdj;
        this.catetoOpo = catetoOpo;    
    }

    @Override
    public double calcularHipotenusa() {
//        double hipotenusa;
//        hipotenusa = Math.pow(2, catetoAdj)+Math.pow(2, catetoOpo);
//        hipotenusa = Math.pow(2, hipotenusa);
//        return hipotenusa;
        return Math.hypot(this.catetoAdj, this.catetoAdj);
    }
    
}
