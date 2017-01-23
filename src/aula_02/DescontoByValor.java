package aula_02;

import sun.security.krb5.internal.crypto.Des;

/**
 * Created by Administrador on 02/01/2017.
 */
public class DescontoByValor implements Desconto{

    private Desconto proximo;

    public Double desconta(Orcamento orcamento){
        if(orcamento.getValor() > 500){
            return orcamento.getValor() * 0.07;
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
