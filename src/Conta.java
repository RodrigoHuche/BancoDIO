//o fato da classe conta ser abstrata, garante não implementação de um new por exe, a não ser os filhos.
public abstract class Conta implements Iconta {

    private static final int AGENCIA_PADRAO = 1;
    private static int Sequencial = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = Sequencial++;
    }

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void depositar(double valor, Conta contaDestino) {

    }

    @Override
    public void transferir(double valor) {

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
