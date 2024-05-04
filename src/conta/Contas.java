package conta;

//Contas bancarias: titular, agencia, numero e saldo
public class Contas {
    String nomeDoTitular;
    int agencia = 1;
    int numeroDaConta;
    double saldo;

    void deposita(double valorDeposito) {
        saldo += valorDeposito;
        System.out.println("Valor depositado: " + valorDeposito);
    }

    void saque(double valorSaque) {
        if (valorSaque > saldo) {
            System.out.println("Valor indisponivel para saque");
        } else {
            saldo -= valorSaque;
            System.out.println("Valor do saque: " + valorSaque);
        }
    }

    void extrato() {
        System.out.println("Nome do Titular: " + nomeDoTitular);
        System.out.println("Agencia: " + agencia);
        System.out.println("Numero da conta: " + numeroDaConta);
        System.out.println("Saldo: " + saldo);
    }
}
