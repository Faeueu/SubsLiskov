package br.com.catolica.Model;

public class Cachorro extends Animal{

    public Cachorro(String nome) {
        super(nome);
    }

    public void emitirSom(){
        System.out.println("AU AU");
    }
}
