package aula_01;

/**
 * Created by Administrador on 26/12/2016.
 */
public class TesteCalculadorDeImposto {

    public static void main(String[] args){
        Imposto iss = new ISS();
        Imposto icms = new ICMS();

        Orcamento orcamento = new Orcamento(500.0);

        CalculadorDeImposto calculador = new CalculadorDeImposto();

        // Calculando o ISS
        calculador.realizaCalculo(orcamento, iss);

        // Calculando o ICMS
        calculador.realizaCalculo(orcamento, icms);

        Imposto iccc = new ICCC();

        // Calculando o ICCC
        calculador.realizaCalculo(orcamento, iccc);
    }
}
