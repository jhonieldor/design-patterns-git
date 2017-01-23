package aula_03;

import aula_02.Orcamento;

/**
 * Created by Administrador on 02/01/2017.
 */
public abstract class TemplateImpostoCondicional implements  Imposto {
    @Override
    public Double calcula(Orcamento orcamento) {

        if(verificaMaximaTaxacao(orcamento)){
            return maximaTaxacao(orcamento);
        }else{
            return minimaTaxacao(orcamento);
        }
    }

    public abstract Boolean verificaMaximaTaxacao(Orcamento orcamento);

    public abstract Double maximaTaxacao(Orcamento orcamento);

    public abstract Double minimaTaxacao(Orcamento orcamento);
}
