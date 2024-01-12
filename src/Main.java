public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta(
                "Nic",
                "Amarela",
                0.4f
        );
        Caneta c2 = new Caneta(
                "Teste",
                "Preta",
                0.4f
        );
//        c1.setModelo("Bic Cristal");
//        c1.setPonta(0.5f);
//        System.out.println("Tenho uma caneta " + c1.getModelo() + " Com ponta: " + c1.getPonta());
            c1.status();
            c2.status();
    }
}