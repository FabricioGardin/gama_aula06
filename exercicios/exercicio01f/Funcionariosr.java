package exercicios.exercicio01;

public class Funcionariosr extends Funcionario {
    private double bonus;
    
    public Funcionariosr (String nome, int horasTr, double valorHr, double bonus ){
        super(nome, horasTr, valorHr);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario(){
        double valorbonus = bonus * (valorHr / 10);

    }
    
}