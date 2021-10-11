package revisao_heranca;

public class TesteContas {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("Silvano", "Araujo", 35);
        System.out.println(cliente01.toString());
        cliente01.setNome("");
        cliente01.setSobrenome("");
        cliente01.setIdade(15);
        System.out.println(cliente01.toString());
        Conta conta = new Conta(1337, 23334);
        conta.deposita(200.0);
        System.out.println(conta.getSaldo());
        conta.setAgencia(570);
        System.out.println(conta.getAgencia());
        System.out.println("O total de contas é: " + Conta.getTotal());
    }
}
