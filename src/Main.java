public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca();
        //poupanca.depositar(500);
        cc.transferir(90, poupanca);


        System.out.println("$===Banco DIO===$");
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
