package aula_07;

/**
 * Created by JHoNi on 21/01/2017.
 */
public class EnviadorEmail implements AcaoAposGerarNota {

    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("Enviou por email");
    }

}
