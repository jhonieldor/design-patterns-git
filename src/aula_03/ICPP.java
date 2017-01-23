package aula_03;

import aula_02.Orcamento;

/**
 * Created by Administrador on 02/01/2017.
 */
public class ICPP extends TemplateImpostoCondicional{
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
