/**
 * @author Patrick
 */
public final class Stopwatch {

    private static long start;

    public static void start() {
        start = System.currentTimeMillis();
    }

    public static void elapsed() {
        long time = System.currentTimeMillis() - start;
        System.out.println("Took " + time + "ms");
    }
    
}
