package conta;

public class CriarConta {
    public static void main(String[] args) {
        Contas conta001 = new Contas();
        conta001.saldo = 1000;
        conta001.nomeDoTitular = "Thiago Moreira";
        conta001.agencia = 291;
        conta001.numeroDaConta= 1;

        Contas conta002 = new Contas();

        conta001.deposita(10);
        conta001.saque(1000);
        conta001.extrato();

        conta002.nomeDoTitular = "Moreira Juridico";
        conta002.numeroDaConta = 2;
        conta002.agencia = 291;
        conta002.saldo = 500;

        conta002.extrato();
    }
}
