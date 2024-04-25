public class ContaUsuario {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public ContaUsuario(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public void imprimeMensagem() {
        System.out.printf(("Olá %s,\n" +
                        "obrigado por criar uma conta em nosso banco, sua agência é %s, " +
                        "conta %d e seu saldo %.2f já está disponível para saque."),
                this.nomeCliente, this.agencia, this.numero, this.saldo);
    }
}
