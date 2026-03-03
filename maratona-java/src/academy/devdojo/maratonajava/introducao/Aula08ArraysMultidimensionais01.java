package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int[][]dias = new int[3][3];
        int c = 0;

        // Só para alimentar os valores
        for(int i = 0; i < dias.length; i++){
            for (int j = 0;j < dias[0].length; j++){
                c = c+1;
                dias[i][j] = c;
            }
        }

        // Aqui começa a brincadeira
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[0].length; j++) {
                System.out.printf("| %d ", dias[i][j]);
                if (j == 2){
                    System.out.printf("|");
                }
                //int jogada =
            }
            System.out.println("");
        }

    }
}