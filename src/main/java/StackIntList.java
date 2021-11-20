import java.util.Iterator;

/**
 * This should only be used when only a fixed amount of memory is being used.
 *
 * @author Patrick
 */
public final class StackIntList extends StackIntArray implements IntList {

    private final StackIntListIterator iterator = new StackIntListIterator();

    public StackIntList(long size) {
        super(size);
    }

    @Override
    public void add(int value) {
        super.add(value);
    }

    @Override
    public int indexOf(int value) {
        return find(value);
    }

    @Override
    public void remove(int index) {
        set(index, 0);
        size--;
    }

    @Override
    public void remInt(int value) {
        int index = indexOf(value);
        if (index == -1)
            return;
        remove(index);
    }

    @Override
    public int getInt(int index) {
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
    public Iterator<Integer> iterator() {
        iterator.index = 0;
        return iterator;
    }

    private class StackIntListIterator implements Iterator<Integer> {

        private int index;

        @Override
        public boolean hasNext() {
            return index++ < size;
        }

        @Override
        public Integer next() {
            return getInt(index);
        }
    }

}
