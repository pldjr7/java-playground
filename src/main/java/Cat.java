public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void play() {
        System.out.println("Cat: " + name + " jumps on the table");
    }
    @Override
    public void play(Toy toy) {
        System.out.println("Cat: " + name + " is playing the toy " + toy);
    }

    void age() {
        System.out.println("CAT: " + name + " is " + age + " years old");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
