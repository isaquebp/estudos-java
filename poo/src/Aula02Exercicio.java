public class Aula02Exercicio {
    public static void main(String[] args) {
        Copo copo1 = new Copo();
        copo1.material = "Vidro";
        copo1.tamanho = 200;
        copo1.agua = 0;

        copo1.encher();
        copo1.esvaziar();
        copo1.status();
    }
}
