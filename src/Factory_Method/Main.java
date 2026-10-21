package Factory_Method;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Running Road Logistics ---");
        Logistics roadLogistics = new RoadLogistics();
        roadLogistics.planDelivery();

        System.out.println("\n--- Running Sea Logistics ---");
        Logistics seaLogistics = new SeaLogistics();
        seaLogistics.planDelivery();
    }
}
