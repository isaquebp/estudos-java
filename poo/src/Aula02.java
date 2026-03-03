public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Esferográfica";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tinta = 80;
        c1.tampar();
        //c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo = "Tinteiro";
        c2.cor = "Vermelho";
        c2.ponta = 1.0f;
        c2.tinta = 90;
        c2.tampada = true;
        c2.destampar();
        c2.rabiscar();
    }
}
