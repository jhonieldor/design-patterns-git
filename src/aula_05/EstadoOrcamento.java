package aula_05;

/**
 * Created by JHoNi on 18/01/2017.
 */
public interface EstadoOrcamento {
    void aplicaDescontoExtra(Orcamento orcamento);

    void aprova(Orcamento orcamento);

    void reprova(Orcamento orcamento);

    void finaliza(Orcamento orcamento);
}
