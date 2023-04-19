public class Main {
    public static void main(String[] args) {
        Cat coco = new Cat("coco", 14);
        Dog max = new Dog("max", 5, "Paul");
        Rabbit snowBall = new Rabbit("snow ball", "Red");
        Toy robot = new Toy("curious george");

        Toy legoCar = new Toy("lego truck");

        Action[] homeFriends = new Action[4];
        homeFriends[0] = coco;
        homeFriends[1] = max;
        homeFriends[2] = snowBall;
        homeFriends[3] = robot;

        for (Action friend : homeFriends) {
            friend.play(legoCar);
        }
    }
}
