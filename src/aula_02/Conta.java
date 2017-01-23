package aula_02;

/**
 * Created by Administrador on 02/01/2017.
 */
public class Conta {

    private final String titular;
    private final Double saldo;

    public Conta(String titular, Double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public Double getSaldo() {
        return saldo;
    }
}
