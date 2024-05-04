package conta;

public class CriarConta {
    public static void main(String[] args) {
        Contas conta001 = new Contas();
        conta001.saldo = 1000;
        conta001.nomeDoTitular = "Thiago Moreira";
        conta001.agencia = 291;
        conta001.numeroDaConta= 1;

        conta001.deposita(10);
        conta001.saque(1000);

        conta001.extrato();


    }
}
