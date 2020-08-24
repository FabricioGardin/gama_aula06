package exemplos.exemplo01;

public class Gerente extends Funcionario {
    private int numFuncionarios;
    private double bonus;

    public Gerente(String nome, double salario, int numFuncionarios){
        super(nome, salario); // chama o construtor da classe base
        this.numFuncionarios = numFuncionarios;
    }

    public int getNumFuncionrios(){
        return numFuncionarios;

    }

    public void setNumFuncionarios(int numFuncionarios){
        if(numFuncionarios > 0){
            this.numFuncionarios = numFuncionarios;
        }
        
    }

    @Override
    public String imprimir(){
        // forma 1:
        // acessa diretamente um dado protected e um método public, e uma variavel local
       // return "Funcionario: " + nome + " salario: " + getSalario() + "numFunc" + numFuncionarios;
      
        // forma 2:
        // utilizar o método da classe base e adicionar o que for diferente
         return super.imprimir() + " numFunc: " + numFuncionarios + " bônus: " + bonus;
    }

    @Override
    public void aumentarSalario(double perc){
        // solução 1:  aumentar masi 20 %
        // super.aumentarSalario(perc  0.2);
        bonus = getSalario() * 0.2;
        super.aumentarSalario(perc);

        
    }
}