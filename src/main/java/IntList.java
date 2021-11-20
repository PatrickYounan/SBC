/**
 * @author Patrick
 */
public interface IntList extends Iterable<Integer> {

    /**
     * Adds a int value to the offheap stack.
     *
     * @param value to add.
     */
    void add(int value);

    /**
     * Removes the int value that can be found with the index.
     *
     * @param index of the value to remove from the stack.
     */
    void remove(int index);

    /**
     * Removes a int by its value from the stack. Removing doesn't actually compress
     * memory but sets its stack value to zero.
     *
     * @param value the value used for indexing to be removed.
     */
    void remInt(int value);

    /**
     * Gets the int value by pointing to the stack using the index value.
     *
     * @param index {@code int} used to find the value that is on the stack.
     * @return a int value.
     */
    int getInt(int index);

    /**
     * Gets the index of a int value that is on the stack.
     *
     * @param value to be used to find the index.
     * @return the index pointer.
     */
    int indexOf(int value);

    /**
     * The current size of the {@link IntList}.
     *
     * @return the current size.
     */
    int size();

    /**
     * Clears all the values on the stack.
     */
    void clear();

    /**
     * Frees the memory used to allocate ints to the stack.
     */
    void freeMemory();
}
