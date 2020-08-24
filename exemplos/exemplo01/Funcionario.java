package exemplos.exemplo01;

/**
 * Funcionario
 */
public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(){ // construtor default
        salario = 0;

    }

    /* Overload (Polimorfismo) - pelo menos um parametro deve ser 
    diferente do construtor default
    */
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    // convenção
    /*  Para obter o valor de um atributo, dou o nome para 
    o método iniciando com o get seguido do nome do atributo
    com o uso do CamelCase.
    para alterar o valor de um atributo inicia o método com 
    o nome do atributo com o uso do CamelCase.
    */

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        if( salario> 0){
            this.salario = salario;
        }       
    }
}