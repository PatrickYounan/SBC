import java.util.Iterator;

/**
 * @author Patrick
 */
public final class StackByteList extends StackByteArray implements ByteList {

    private final StackByteListIterator iterator = new StackByteListIterator();

    public StackByteList(long size) {
        super(size);
    }

    @Override
    public void add(int value) {
        set(size++, (byte) value);
    }

    @Override
    public int indexOf(int value) {
        return find(value);
    }

    @Override
    public void remove(int index) {
        set(index, (byte) 0);
    }

    @Override
    public void remByte(int value) {
        int index = indexOf(value);
        if (index == -1)
            return;
        remove(index);
    }

    @Override
    public byte getByte(int index) {
        return get(index);
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void clear() {
        super.clear();
    }

    @Override
    public void freeMemory() {
        free();
        size = 0;
    }

    @Override
    public Iterator<Byte> iterator() {
        iterator.index = 0;
        return iterator;
    }

    private class StackByteListIterator implements Iterator<Byte> {

        private int index;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public Byte next() {
            return getByte(index++);
        }
    }

}
