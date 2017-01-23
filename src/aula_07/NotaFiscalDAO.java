package aula_07;

/**
 * Created by JHoNi on 21/01/2017.
 */
public class NotaFiscalDAO implements AcaoAposGerarNota {

    public void executa(NotaFiscal nf) {
        System.out.println("Salvou no banco");
    }
}
