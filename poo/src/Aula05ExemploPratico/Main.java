package Aula05ExemploPratico;

public class Main {
    public static void main(String[] args) {
        ContaBancaria p1 = new ContaBancaria();
        p1.setNumConta(1);
        p1.setDono("Marcos");
        p1.abrirConta("CC");

        ContaBancaria p2 = new ContaBancaria();
        p2.setNumConta(2);
        p2.setDono("Leide");
        p2.abrirConta("CP");

        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(1000);

        p1.sacar(150);
        p1.fecharConta();

        p1.estadoAtual();
        p2.estadoAtual();


    }
}
