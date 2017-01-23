package aula_05;

/**
 * Created by JHoNi on 18/01/2017.
 */
public class Aprovado implements EstadoOrcamento{
    public void aplicaDescontoExtra(Orcamento orcamento){
        orcamento.valor -= orcamento.valor * 0.02;
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já foi aprovado!");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamentos aprovados não podem ser reprovados!");
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        orcamento.estadoAtual = new Finalizado();
    }
}
