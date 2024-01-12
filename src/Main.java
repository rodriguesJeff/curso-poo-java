public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.modelo = "Bic Cristal";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.carga = 80;
        c1.rabiscar();
        c1.status();
        System.out.println("");
        Caneta c2 = new Caneta();
        c2.cor = "Vermelha";
        c2.modelo = "Bic Cristal";
        c2.ponta = 0.5f;
        c2.destampar();
        c2.carga = 80;
        c2.rabiscar();
        c2.status();
    }
}