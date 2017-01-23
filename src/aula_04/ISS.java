package aula_04;


/**
 * Created by Administrador on 26/12/2016.
 */
public class ISS extends Imposto {

    public ISS(Imposto outroImposto) {
        super(outroImposto);
    }

    public ISS(){
    }

    @Override
    public Double calcula(Orcamento orcamento){
        return orcamento.getValor() * 0.06 + calculaDoOutroImposto(orcamento);
    }


}
