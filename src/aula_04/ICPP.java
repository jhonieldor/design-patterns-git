package aula_04;

import aula_04.Orcamento;
import aula_04.TemplateImpostoCondicional;

/**
 * Created by Administrador on 02/01/2017.
 */
public class ICPP extends TemplateImpostoCondicional {

    public ICPP() {
    }

    @Override
    public Boolean verificaMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500.00;
    }

    @Override
    public Double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.07;
    }

    @Override
    public Double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.05;
    }

}
