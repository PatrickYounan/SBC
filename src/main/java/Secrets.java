import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @author Patrick
 */
public final class Secrets {

    protected static Unsafe unsafe;

    static {
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            unsafe = (Unsafe) field.get(null);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
