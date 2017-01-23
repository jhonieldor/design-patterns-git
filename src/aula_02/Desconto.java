package aula_02;

/**
 * Created by Administrador on 02/01/2017.
 */
public interface Desconto {

    Double desconta(Orcamento orcamento);
    void setProximo(Desconto desconto);
}
