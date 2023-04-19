public class Rabbit extends Animal {

    private String eyeColour;

    @Override
    public void play(Toy toy) {

    }

    public Rabbit(String name, String eyeColour) {
        this.name = name;
        this.eyeColour = eyeColour;
    }

    public void play() {
        System.out.println("Rabbit: " + name + " is being still");
    }
}
