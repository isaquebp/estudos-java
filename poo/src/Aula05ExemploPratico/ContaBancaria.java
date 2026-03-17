package Aula05ExemploPratico;
    // Atributos
public class ContaBancaria {
    public int numConta;
    protected char tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBancaria(){
        this.saldo = 0;
        this.status = false;
    }

    // Getters e Setters

    public int getNumConta(){
        return this.numConta;
    }
    public void setNumConta(int nc){
        this.numConta = nc;
    }

    public char getTipo(){
        return this.tipo;
    }
    public void setTipo(char t){
        this.tipo = t;
    }

    public String getDono(){
        return this.dono;
    }
    public void setDono(String d){
        this.dono = d;
    }

    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float s){
        this.saldo = s;
    }

    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean s){
        this.status = s;
    }

    // Métodos
    public void abrirConta(char t){
        setTipo(t);
        setStatus(true);
        if (t == 'CC'){
            setSaldo(50);
        } else if (t == 'CP'){
            saldo = 150;
        }

    }

    public void fecharConta(){
        if  (getSaldo() > 0){
            System.out.println("Conta com dinheiro");
        } else if (getSaldo() < 0){
            System.out.println("Conta em débito");
        } else {
            setStatus(false);
        }
    }

    public void depositar(float v){
        if (getStatus() == true){
            setSaldo(getSaldo() + v);
        } else {
            System.out.println("Impossível depositar!");
        }
    }

    public void sacar(float v){
        if(getStatus() == true){
            if (getSaldo() > 0){
                setSaldo(getSaldo() - v);
            } else {
                System.out.println("Impossível sacar");
            }
        }
    }

    public void pagarMensal(float pagarM){
        float v;
        if (getTipo() == 'CC'){
            v = 12;
        } else{
            v = 20;
        }
        if (getStatus() == true){
            if (getSaldo() > v){
                setSaldo(getSaldo() - v);
                System.out.println("Mensalidade paga");
            }else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível pagar");
        }
    }
}
