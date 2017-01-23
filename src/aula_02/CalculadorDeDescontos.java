package aula_02;

import aula_01.*;

/**
 * Created by Administrador on 02/01/2017.
 */
public class CalculadorDeDescontos {

    public Double calcula(Orcamento orcamento) {
        Desconto d1 = new DescontoByItens();
        Desconto d2 = new DescontoByValor();
        Desconto d3 = new SemDesconto();

        d1.setProximo(d2);
        d2.setProximo(d3);

        return d1.desconta(orcamento);
    }
}
