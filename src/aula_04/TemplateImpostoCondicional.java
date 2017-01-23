package aula_04;

import aula_04.Orcamento;
import aula_04.Imposto;

/**
 * Created by Administrador on 02/01/2017.
 */
public abstract class TemplateImpostoCondicional extends Imposto {
    @Override
    public Double calcula(Orcamento orcamento) {

        if(verificaMaximaTaxacao(orcamento)){
            return maximaTaxacao(orcamento) + calculaDoOutroImposto(orcamento);
        }else{
            return minimaTaxacao(orcamento) + calculaDoOutroImposto(orcamento);
        }
    }

    public abstract Boolean verificaMaximaTaxacao(Orcamento orcamento);

    public abstract Double maximaTaxacao(Orcamento orcamento);

    public abstract Double minimaTaxacao(Orcamento orcamento);
}
