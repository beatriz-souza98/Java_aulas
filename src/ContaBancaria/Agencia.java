package ContaBancaria;

public class Agencia {

    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria("Beatriz", 500);

    minhaConta.setTitular("Beatriz Souza");
    minhaConta.setSaldo(minhaConta.getSaldo() + 500);

    String titularConta = minhaConta.getTitular();
    double saldoFinal = minhaConta.getSaldo();

        System.out.println("O titular da conta é: " + titularConta);
        System.out.println("Saldo finbal é: " + saldoFinal);

        ContaBancaria contaMae = new ContaBancaria("Maria Cicera");
        System.out.println("O O titular da conta é " + contaMae.getTitular() +
                " o saldo final é "+ contaMae.getTitular());
    }
}
