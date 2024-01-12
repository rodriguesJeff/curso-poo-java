public class Caneta {
    private String modelo;
    private float ponta;

    private boolean tampada;

    private String cor;

    public Caneta(String m, String c, float p) {
        this.cor = c;
        this.ponta = p;
        this.modelo = m;
        this.tampar();
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("A caneta esta tampada? " + this.tampada);
    }
}
