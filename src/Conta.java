//o fato da classe conta ser abstrata, garante não implementação de um new por exe, a não ser os filhos.
public abstract class Conta implements Iconta{

    private int agencia;
    private int numero;
    private double saldo;

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void transferir(double valor) {

    }

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void depositar(double valor, Conta contaDestino) {

    }
}