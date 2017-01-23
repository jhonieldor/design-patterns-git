package aula_05;

import aula_05.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrador on 26/12/2016.
 */
public class Orcamento {

    protected Double valor;

    private final List<Item> itens;

    protected EstadoOrcamento estadoAtual;

    public Orcamento(Double valor) {
        this.valor = valor;
        itens = new ArrayList<>();
        this.estadoAtual = new EmAprovacao();
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void applicaDescontoExtra(){
        estadoAtual.aplicaDescontoExtra(this);
    }

    public void adicionaItem(Item item){
        itens.add(item);
    }

    public List<Item> getItens() {
        return itens;
    }

    public void aprova(){
        estadoAtual.aprova(this);
    }

    public void reprova(){
        estadoAtual.reprova(this);
    }

    public void finaliza(){
        estadoAtual.finaliza(this);
    }


}
