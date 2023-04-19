public class Dog extends Animal {
    private String owner;

    public void play() {
        System.out.println("Dog: " + name + " is chasing its tail");
    }
    public void play(Toy toy) {
        System.out.println("Dog: " + name + " is playing the toy " + toy);
    }

    public Dog(String name, int age, String owner) {
        super(name, age);
        this.owner = owner;
    }
}
