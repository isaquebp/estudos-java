package aula02;

import java.util.Scanner;
public class Copo {
    Scanner scanner = new Scanner(System.in);
    String material;
    int tamanho;
    int agua;

    void encher(){
        System.out.print("Você quer encher quanto de água? ");
        this.agua = this.agua + scanner.nextInt();
        if (this.agua > 200){
            System.out.println("O copo transbordou");
            this.agua = 200;
        } else{
        }
    }
    void esvaziar() {
        if (this.agua > 0) {
            System.out.print("\nQuanto de água você quer tirar? ");
            int derramar = scanner.nextInt();
            if (derramar > this.agua) {
                System.out.println("Nem tem tudo isso de água maluco kkkkkk");
            } else {
                this.agua = this.agua - derramar;
            }
        } else {
            System.out.print("O copo já está vazio");
        }
    }

    void status(){
            System.out.println("O material do copo é " + this.material);
            System.out.println("O tamanho do copo é " + this.tamanho);
            System.out.println("A água do copo está em " +this.agua + "ml");
        }

}
