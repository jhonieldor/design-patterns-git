package aula_01;

/**
 * Created by Administrador on 26/12/2016.
 */
public class ICCC implements Imposto {

    @Override
    public Double calcula(Orcamento orcamento) {
        if(orcamento.getValor() < 1000) {
            return orcamento.getValor() * 0.05;
        }
        else if (orcamento.getValor() <= 3000) {
            return orcamento.getValor() * 0.07;
        }
        else {
            return orcamento.getValor() * 0.08 + 30;
        }
    }
}