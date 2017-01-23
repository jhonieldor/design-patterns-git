package aula_06;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.zip.CRC32;

/**
 * Created by JHoNi on 21/01/2017.
 */
public class TesteDaNotaFiscal {

    public static void main(String[] args){
//        List<ItemNota> itens = Arrays.asList(new ItemNota("item 1", 200.0), new ItemNota("item 2", 400.0));
//        Double valorTotal = itens.stream().mapToDouble(i -> i.getValor()).sum();
//        Double impostos = valorTotal * 0.05;
//        NotaFiscal nf = new NotaFiscal("Razão Social", "Data Emissão", Calendar.getInstance(), valorTotal, impostos, itens, "Obs Qualquer");
        NotaFiscalBuilder builder = new NotaFiscalBuilder();
        builder.paraEmpresa("Caelum Ensino e Inovação")
        .comCnpj("12.345.678/0001-12")
        .comItem(new ItemNota("item 1", 200.0))
        .comItem(new ItemNota("item 2", 300.0))
        .comItem(new ItemNota("item 3", 400.0))
        .comObservacoes("Observacoes")
        .naDataAtual();

        NotaFiscal nf = builder.constroi();

        System.out.println(nf.getValorBruto());

    }
}
