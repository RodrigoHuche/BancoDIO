public class Main {
    public static void main(String[] args) {
        Iconta cc = new ContaCorrente();
        cc.depositar(100);

        Iconta poupanca = new ContaPoupanca();
        //poupanca.depositar(500);
        cc.transferir(90, poupanca);


        System.out.println("$===Banco DIO===$");
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
