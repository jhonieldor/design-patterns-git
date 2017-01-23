package aula_04;

//import aula_01.Orcamento;

/**
 * Created by JHoNi on 17/01/2017.
 */
public abstract class Imposto {

    protected Imposto outroImposto;

    public Imposto(Imposto outroImposto) {
        this.outroImposto = outroImposto;
    }

    public Imposto() {
    }

    public abstract Double calcula(Orcamento orcamento);

    protected Double calculaDoOutroImposto(Orcamento orcamento) {
        if (outroImposto == null) return 0.0;
        return outroImposto.calcula(orcamento);
    }
}
