package aula_01;

/**
 * Created by Administrador on 26/12/2016.
 */
public class ISS implements Imposto{

    @Override
    public Double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }
}
