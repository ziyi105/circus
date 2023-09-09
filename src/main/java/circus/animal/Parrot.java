package circus.animal;

import circus.animal.Bird;

public class Parrot extends Bird {
    @Override
    public String speak() {
        return "Polly wants a cracker";
    }

    @Override
    public String toString() {
        return "I'm a parrot";
    }

    public int getValue() {
        return 10;
    }
}
