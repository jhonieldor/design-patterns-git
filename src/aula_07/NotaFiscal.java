package aula_07;

import aula_07.ItemNota;

import java.util.Calendar;
import java.util.List;

/**
 * Created by JHoNi on 21/01/2017.
 */
public class NotaFiscal {

    private String razaoSocial;
    private String cnpj;
    private Calendar dataEmissao;
    private Double valorBruto;
    private Double impostos;

    public List<ItemNota> itens;
    private String observacoes;

    public NotaFiscal(String razaoSocial, String cnpj, Calendar dataEmissao, Double valorBruto, Double impostos, List<ItemNota> itens, String observacoes) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.dataEmissao = dataEmissao;
        this.valorBruto = valorBruto;
        this.impostos = impostos;
        this.itens = itens;
        this.observacoes = observacoes;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Calendar getDataEmissao() {
        return dataEmissao;
    }

    public Double getValorBruto() {
        return valorBruto;
    }

    public Double getImpostos() {
        return impostos;
    }

    public List<ItemNota> getItens() {
        return itens;
    }

    public String getObservacoes() {
        return observacoes;
    }
}
