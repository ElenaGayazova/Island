package island.animals;

import island.Predator;

// Лиса
public class Fox extends Predator {
    public Fox() {
        super("Лиса");
        setProbability("Кролик",70);
        setProbability("Мышь",90);
    }

}
