/**
 * Think about interface as a contract for the outside world
 * <p>
 * void pee();
 * all methods/functions have to implemented in all classes
 */
public interface Action {
    void play();

    void play(Toy toy);
}
