package aula_02;

/**
 * Created by Administrador on 02/01/2017.
 */
public class TesteDeDescontos {

    public static void main(String[] args){
        CalculadorDeDescontos descontos = new CalculadorDeDescontos();
        Orcamento orcamento = new Orcamento(500.00);
        orcamento.adicionaItem(new Item("Caneta", 250.00));
        orcamento.adicionaItem(new Item("Lapis", 250.00));

        Double descontoFinal = descontos.calcula(orcamento);

        System.out.println(descontoFinal);
    }
}
