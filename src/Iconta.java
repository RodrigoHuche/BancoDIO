public interface Iconta {
    void transferir(double valor);

    void sacar(double valor);

    void depositar(double valor, Conta contaDestino);
}
