package prob3;

public abstract class Property {
    abstract double computeRent();

    private Address address;

    public Address getAddress() {
        return address;
    }

    public Property(Address address) {
        this.address = address;
    }
}
