package aula_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Administrador on 26/12/2016.
 */
public class Orcamento {

    private final Double valor;

    private final List<Item> itens;

    public Orcamento(Double valor) {
        this.valor = valor;
        itens = new ArrayList<>();
    }

    public Double getValor() {
        return valor;
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public void adicionaItem(Item item){
        itens.add(item);
    }

}
