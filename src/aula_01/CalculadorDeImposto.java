package aula_01;

/**
 * Created by Administrador on 26/12/2016.
 */
public class CalculadorDeImposto {

    public void realizaCalculo(Orcamento orcamento, Imposto imposto){
        Double valor = imposto.calcula(orcamento);

        System.out.println(valor);
    }
}
