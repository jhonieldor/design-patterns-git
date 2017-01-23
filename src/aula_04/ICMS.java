package aula_04;

import aula_04.Imposto;
import aula_04.Orcamento;

/**
 * Created by Administrador on 26/12/2016.
 */
public class ICMS extends Imposto {

    public ICMS(Imposto outroImposto) {
        super(outroImposto);
    }

    public ICMS() {
    }

    @Override
    public Double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.1 + calculaDoOutroImposto(orcamento);
    }
}
