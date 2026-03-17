package Aula05ExemploPratico;

import java.util.Objects;

// Atributos
public class ContaBancaria {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("--------------------------");
        System.out.println("Conta: " + getNumConta());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Dono: " + getDono());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Status: " + getStatus());
    }

    public ContaBancaria(){
         setSaldo(0);
        setStatus(false);
    }

    // Getters e Setters

    public int getNumConta(){
        return this.numConta;
    }
    public void setNumConta(int nc){
        this.numConta = nc;
    }

    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String t){
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
    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);
        if (Objects.equals(t, "CC")){
            setSaldo(50);
        } else if (Objects.equals(t, "CP")){
            saldo = 150;
        }
        System.out.println("\nConta aberta com sucesso!");
    }

    public void fecharConta(){
        if  (getSaldo() > 0){
            System.out.println("Conta com dinheiro, impossível fechar");
        } else if (getSaldo() < 0){
            System.out.println("Conta em débito");
        } else {
            setStatus(false);
        }
    }

    public void depositar(float v){
        if (getStatus()){
            setSaldo(getSaldo() + v);
            System.out.println("Depósito realizado com sucesso na conta de " + getDono());
        } else {
            System.out.println("Impossível depositar!");
        }
    }

    public void sacar(float v){
        if(getStatus()){
            if (getSaldo() >= 0 && getSaldo() >= v){
                setSaldo(getSaldo() - v);
                System.out.println("Saque realizado com sucesso na conta de " + getDono());
            } else{
                System.out.println("Saldo insuficiente para sacar");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada");
        }
    }

    public void pagarMensal(float pagarM){
        float v = 0;
        if (Objects.equals(getTipo(), "CC")){
            v = 12;
        } else if (Objects.equals(getTipo(), "CP")){
            v = 20;
        }
        if (getStatus()){
            if (getSaldo() > v){
                setSaldo(getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso por " + getDono());
            }else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível pagar uma conta fechada");
        }
    }
}
