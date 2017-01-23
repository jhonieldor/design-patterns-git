package aula_04;

import aula_04.ISS;
import aula_04.Imposto;
import aula_04.Orcamento;

/**
 * Created by JHoNi on 16/01/2017.
 */
public class TestesDeImpostosComplexos {

    public static void main(String[] args){
        Imposto iss = new ISS(new ICMS(new ICPP()));


        Orcamento orcamento = new Orcamento(500.00);
        Double valor = iss.calcula(orcamento);
        System.out.println(valor);
    }
}
