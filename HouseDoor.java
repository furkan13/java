public class HouseDoor extends Door {
    HouseDoor()
    {
        super();

    }

    void lock()
    {
        super.close();
    }

    void unlock()
    {
        super.open();
    }
}
