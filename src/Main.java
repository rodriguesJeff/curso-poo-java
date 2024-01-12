import aula05.ContaBanco;

public class Main {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        c1.setDono("Jecefon");
        c1.setNumConta(11);
        c1.abrirConta("CC");
        c1.depositar(300f);


        ContaBanco c2 = new ContaBanco();
        c2.setDono("Xiquinha");
        c2.setNumConta(22);
        c2.abrirConta("CP");
        c2.depositar(500f);
        c2.sacar(100);
        c2.sacar(1000);
        c2.fecharConta();


        c1.estadoAtual();
        c2.estadoAtual();
    }
}