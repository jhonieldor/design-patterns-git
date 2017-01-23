package aula_05;

/**
 * Created by JHoNi on 18/01/2017.
 */
public class EmAprovacao implements EstadoOrcamento{

    public void aplicaDescontoExtra(Orcamento orcamento){
        orcamento.valor -= orcamento.valor * 0.05;
    }

    @Override
    public void aprova(Orcamento orcamento) {
        orcamento.estadoAtual = new Aprovado();
    }

    @Override
    public void reprova(Orcamento orcamento) {
        orcamento.estadoAtual = new Reprovado();
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        throw new RuntimeException("Orçamentos em aprovação não podem ir direto para finalizado!");
    }
}
