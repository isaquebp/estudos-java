package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.
        // Condição valorParcela >= 1000

        /** int valorCarro = 90000;
        System.out.println("Os valores das parcelas do carro ficarão em: ");
        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            int valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println(parcela + "x - R$ " + valorParcela);
        } **/

        int valorCarro = 30000;
        for (int parcela = valorCarro; parcela >= 1; parcela--) {
            int valorParcela = valorCarro/parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println(parcela + "x - R$ " + valorParcela);
        }
    }
}