public class Toy implements Action {
    private String name;

    public Toy(String brand) {
        this.name = brand;
    }
    @Override
    public void play() {
        System.out.println("Toy: " + name + " is making a weird sound");
    }

    @Override
    public void play(Toy toy) {
        System.out.println("Robot: " + name + " is happy to see another toy " + toy);
    }

    @Override
    public String toString() {
        return name;
    }
}
