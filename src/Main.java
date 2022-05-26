public class Main {
    public static void main(String[] args) {

        Cliente rodrigo = new Cliente();
        rodrigo.setNome("Rodrigo Huche");

        Iconta cc = new ContaCorrente(rodrigo);
        cc.depositar(100);

        Iconta poupanca = new ContaPoupanca(rodrigo);
        //poupanca.depositar(500);
        cc.transferir(90, poupanca);


        System.out.println("$===Banco DIO===$");
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
