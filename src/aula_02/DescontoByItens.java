package aula_02;

/**
 * Created by Administrador on 02/01/2017.
 */
public class DescontoByItens implements Desconto{

    private Desconto proximo;

    public Double desconta(Orcamento orcamento){
        if(orcamento.getItens().size() > 5){
            return orcamento.getValor() * 0.1;
        }
        else{
            return proximo.desconta(orcamento);
        }
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }
}
