package entities;

public class PessoaJuridica extends Imposto {

    private int numFuncionario;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String nome, double rendaAnual, int numFuncionario) {
        super(nome, rendaAnual);
        this.numFuncionario = numFuncionario;
    }

    @Override
    public double calculoImposto() {
        if(this.numFuncionario < 10){
            return getRendaAnual() * 0.16;
        }
        else {
            return getRendaAnual() * 0.14;
        }
    }

    public int getNumFuncionario() {
        return numFuncionario;
    }

    public void setNumFuncionario(int numFuncionario) {
        this.numFuncionario = numFuncionario;
    }
}
