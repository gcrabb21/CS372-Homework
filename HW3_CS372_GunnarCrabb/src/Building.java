
public abstract class Building {
    protected String name;
    protected int address;
    protected static int lastAddress = 11111;

    public Building() {
        address = lastAddress;
        lastAddress++;
    }

    abstract void populate(Person p);

    public String toString() {
        return String.format("Building name: %s\nBuilding Address: %s", name, address);
    }

    abstract void showOccupants();



}