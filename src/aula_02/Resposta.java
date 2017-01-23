package aula_02;

/**
 * Created by Administrador on 02/01/2017.
 */
public interface Resposta {
    void responde(Requisicao req, Conta conta);
    void setProxima(Resposta resposta);

}
