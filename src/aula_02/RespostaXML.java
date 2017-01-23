package aula_02;

/**
 * Created by Administrador on 02/01/2017.
 */
public class RespostaXML implements Resposta {

    private Resposta outraResposta;

    @Override
    public void responde(Requisicao req, Conta conta) {
        if(req.getFormato()==Formato.XML){
            System.out.println("<conta><titular>" + conta.getTitular() + "</titular><saldo>" + conta.getSaldo() + "</saldo></conta>");
        }else{
            outraResposta.responde(req, conta);
        }
    }

    @Override
    public void setProxima(Resposta resposta) {
        this.outraResposta = resposta;
    }
}
