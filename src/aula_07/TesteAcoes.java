package aula_07;


/**
 * Created by JHoNi on 21/01/2017.
 */
public class TesteAcoes {

    public static void main(String[] args){
        NotaFiscalBuilder notaFiscalBuilder = new NotaFiscalBuilder();
        notaFiscalBuilder.adicionaAcao(new EnviadorEmail());
        notaFiscalBuilder.adicionaAcao(new NotaFiscalDAO());
        notaFiscalBuilder.adicionaAcao(new EnviadorSms());
        notaFiscalBuilder.adicionaAcao(new Impressora());

        NotaFiscal nf = notaFiscalBuilder.paraEmpresa("Caelum")
                .comCnpj("123")
                .comItem(new ItemNota("nome", 100.0))
                .comObservacoes("Obs")
                .naDataAtual()
                .constroi();

        System.out.println(nf.getValorBruto());
    }
}
