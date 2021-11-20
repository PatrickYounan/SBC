/**
 * @author Patrick
 */
public class Address {

    protected final long address;

    public Address(long size) {
        this.address = Secrets.unsafe.allocateMemory(size);
    }

    @Override
    public String toString() {
        return "Struct{" +
                "address=" + address +
                '}';
    }

}
