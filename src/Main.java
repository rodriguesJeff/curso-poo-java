import aula05.ContaBanco;
import aula06.ControleRemoto;

public class Main {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.maisVolume();
        c.play();
        c.abrirMenu();
    }
}