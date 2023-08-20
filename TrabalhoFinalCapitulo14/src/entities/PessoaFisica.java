package entities;

public class PessoaFisica extends Imposto {

    private Double gastosSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, double rendaAnual, Double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double calculoImposto() {
        if(getRendaAnual() < 20000.00){
            return (getRendaAnual() * 0.15) - (getGastosSaude() * 0.5);
        }
        else{
            return (getRendaAnual() * 0.25) - (getGastosSaude() * 0.5);

        }
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }
}
