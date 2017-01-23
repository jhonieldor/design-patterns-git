package aula_07;

/**
 * Created by JHoNi on 21/01/2017.
 */
public class ItemNota {

    private String nome;
    private Double valor;

    public ItemNota(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public Double getValor() {
        return valor;
    }
}
