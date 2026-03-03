package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Vegeta";
        nomes[2] = "Trunks";
        for (int i = 0; i < 3; i++) {
            System.out.println(nomes[i]);
        }
    }
}
