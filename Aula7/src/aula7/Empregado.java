package aula7;

public class Empregado {
    
    // atributos de Classe
    private static final String EMPRESA = "FATEC Campinas";
    private static int proxcodigo = 1000;
    
    // atributos de Instancia
    private int codigo;
    private String nome;
    private String departamento;
    private float salario;

    public Empregado(String nome) {
        this.codigo = ++proxcodigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public void imprimeEmpregado(){
        System.out.println(this.getCodigo() + " -- " + this.getNome());
    }
    
    // metodo de Classe
    public static void imprimeEmpresa(){
            System.out.println(EMPRESA);
    }
    
    public static void imprimeClasseEmpregados(Empregado e){
        imprimeEmpresa();
        e.imprimeEmpregado();
    }
}
