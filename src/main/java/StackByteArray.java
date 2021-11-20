/**
 * @author Patrick
 */
public class StackByteArray extends Address {

    protected int size;

    public StackByteArray(long size) {
        super(size);
    }

    public void set(long index, byte value) {
        Secrets.unsafe.putByte(address + index, value);
    }

    public byte get(long index) {
        return Secrets.unsafe.getByte(address + index);
    }

    public void clear() {
        for (int i = 0; i < size; i++) set(i, (byte) 0);
        size = 0;
    }

    protected int find(int value) {
        for (int i = size; i >= 0; i--)
            if (get(i) == value)
                return i;
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
