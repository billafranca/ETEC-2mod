public class Teste {

    public double saldoConta;
    public String nomeCliente;


    public void verSaldoConta() {
        System.out.println("Saldo da conta: R$ " + saldoConta);
    }

    public void sacar(double valor) {
        if (valor > saldoConta) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldoConta -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        }
    }

    public void mostrarMensagem() {
        System.out.println("Olá, " + nomeCliente + ", você tem agora:  R$ " + saldoConta);
    }
}
