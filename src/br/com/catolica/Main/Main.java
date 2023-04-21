package br.com.catolica.Main;

import br.com.catolica.Model.Animal;
import br.com.catolica.Model.AnimalSelvagem;
import br.com.catolica.Model.Cachorro;
import br.com.catolica.Model.Gato;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void emitirSom(List<Animal> animais) {
        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }

    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro("Cachorro"));
        animais.add(new Gato("Gato"));
        animais.add(new AnimalSelvagem("Leao"));

        emitirSom(animais);
    }
}