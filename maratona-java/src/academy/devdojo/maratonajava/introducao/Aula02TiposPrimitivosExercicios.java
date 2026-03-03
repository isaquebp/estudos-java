package academy.devdojo.maratonajava.introducao;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>
confirmo que recebi o salário de <salario>, na data de <data>
 */
public class Aula02TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "Isaque";
        String endereco = "Sobral III";
        double salario = 3500;
        String data = "29/12/2025";

        System.out.println("Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de " + salario + ", na data de " + data);
    }
}
