public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int tinta;
    boolean tampada;

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Tinta: " + this.tinta + "%");
        System.out.println("Tampada: " + this.tampada);
    }

    void rabiscar(){
        if (tampada == false){
            System.out.println("Rabiscadooo");
        } else {
            System.out.println("Não foi possível rabiscar, a caneta está tampada");
        }
    }

    void tampar(){
        tampada = true;
    }

    void destampar(){
        tampada = false;
    }
}
