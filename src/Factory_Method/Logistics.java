package Factory_Method;

public abstract class Logistics {

    // THE FACTORY METHOD: Subclasses will override this to return a specific Transport object
    public abstract Transport createTransport();

    // Business logic that works with the transport, without knowing its concrete class
    public void planDelivery() {
        Transport transport = createTransport();
        System.out.println("Preparing delivery route...");
        transport.deliver();
    }
}
