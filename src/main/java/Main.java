import java.util.ArrayList;

/**
 * @author Patrick
 */
public final class Main {

    static void stack() {
        IntList ints = new StackIntList(1_000_000_00);
        Stopwatch.start();
        for (int i = 0; i < 1_000_000_00; i++)
            ints.add(i);

        ints.freeMemory();
        Stopwatch.elapsed();
    }

    static void heap() {
        ArrayList<Integer> intsList = new ArrayList<>(1_000_000_00);
        Stopwatch.start();
        for (int i = 0; i < 1_000_000_00; i++)
            intsList.add(i);
        Stopwatch.elapsed();
    }

    public static void main(String... args) {
        stack();
    }

}
