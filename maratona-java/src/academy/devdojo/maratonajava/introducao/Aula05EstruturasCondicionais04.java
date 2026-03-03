package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 65000;
        double imposto;

        if (salarioAnual <= 34712) {
            System.out.println("Você vai precisar pagar " + (salarioAnual * 9.70)/100 + " de imposto anual");
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            System.out.println("Você vai precisar pagar " + (salarioAnual * 37.35)/100 + " de imposto anual");
        } else {
            System.out.println("Você vai precisar pagar " + (salarioAnual * 49.50)/100 + " de imposto anual");
        }

    }
}