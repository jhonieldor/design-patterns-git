package aula_05;

/**
 * Created by JHoNi on 18/01/2017.
 */
public class TesteDeDescontoExtra {
    public static void main(String[] args){
        Orcamento reforma = new Orcamento(500.00);
        reforma.applicaDescontoExtra();
        System.out.println("Valor:" + reforma.getValor());

        reforma.aprova();

        reforma.applicaDescontoExtra();

        System.out.println("Valor:" + reforma.getValor());

        reforma.finaliza();

        reforma.applicaDescontoExtra();

    }
}
