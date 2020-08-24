package exercicios.exercicio01;

public class Funcionario {

    private String nome;
    private int horasTr;
    protected  double valorHr;
    
    public Funcionario(String nome, int horasTr, double valorHr) {
        this.nome = nome;
        this.horasTr = horasTr;
        this.valorHr = valorHr;

    }

    public String getNome() {
        return nome;

    }

    public double calcularSalario() {
        return  horasTr * valorHr;
        

    }

    public String imprimir() {
        return "Funcionario: " + nome + "\nhoras trabalhadas:  " + horasTr +  "\nvalor hora:  " + valorHr + "\nSalario: R$ "
                + calcularSalario();

    }
}
