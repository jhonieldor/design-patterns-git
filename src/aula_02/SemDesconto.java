package aula_02;

/**
 * Created by Administrador on 02/01/2017.
 */
public class SemDesconto implements  Desconto{
    @Override
    public Double desconta(Orcamento orcamento) {
        return 0.0;
    }

    @Override
    public void setProximo(Desconto desconto) {

    }
}
