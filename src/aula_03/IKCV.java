package aula_03;

import aula_02.Orcamento;

/**
 * Created by Administrador on 02/01/2017.
 */
public class IKCV extends TemplateImpostoCondicional {

    @Override
    public Boolean verificaMaximaTaxacao(Orcamento orcamento) {
        return (orcamento.getValor() > 500.00 && orcamento.getItens().stream()
                .filter(i -> i.getValor() > 100).findAny().isPresent());
    }

    @Override
    public Double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }

    @Override
    public Double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }
}
