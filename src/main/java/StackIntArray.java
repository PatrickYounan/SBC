import static java.lang.Integer.*;

/**
 * @author Patrick
 */
public class StackIntArray extends Address {

    protected int byteSize;
    protected int size;

    public StackIntArray(long size) {
        super(size * BYTES);
    }

    public void add(int value) {
        Secrets.unsafe.putInt(address + byteSize, value);
        byteSize += BYTES;
        size++;
    }

    public int get(long index) {
        return Secrets.unsafe.getInt(address + index * BYTES);
    }

    public void set(long index, int value) {
        Secrets.unsafe.putInt(address + index, value);
    }

    public void clear() {
        size = 0;
    }

    protected int find(int value) {
        int index = 0;
        while (index++ != size)
            if (get(index) == value) return index;
        return -1;
    }

    public void free() {
        Secrets.unsafe.freeMemory(address);
    }

    @Override
    public String toString() {
        return "OffHeapByteArray{" +
                "address=" + address +
                '}';
    }

}
