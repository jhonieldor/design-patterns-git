package aula_06;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by JHoNi on 21/01/2017.
 */
public class NotaFiscalBuilder {

    private String razaoSocial;

    private String cnpj;

    private Double valorBruto;

    private Double impostos;

    private String observacoes;

    private Calendar data;

    private List<ItemNota> todosItens = new ArrayList<>();

    public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
        this.razaoSocial = razaoSocial;
        return this;
    }

    public NotaFiscalBuilder comCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public NotaFiscalBuilder comItem(ItemNota itemNota) {
        todosItens.add(itemNota);
        if (valorBruto == null)
            valorBruto = 0.0;

        if (impostos == null)
            impostos = 0.0;

        valorBruto += itemNota.getValor();
        impostos += itemNota.getValor() * 0.05;
        return this;
    }

    public NotaFiscalBuilder comObservacoes(String observacoes) {
        this.observacoes = observacoes;
        return this;
    }

    public NotaFiscalBuilder naDataAtual() {
        this.data = Calendar.getInstance();
        return this;
    }

    public NotaFiscal constroi() {
        return new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, todosItens, observacoes);
    }
}
