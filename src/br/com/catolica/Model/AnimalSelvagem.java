package br.com.catolica.Model;

public class AnimalSelvagem extends Animal{
    public AnimalSelvagem(String nome) {
        super(nome);
    }

    public void emitirSom(){
        System.out.println("ROAR");
    }
}
