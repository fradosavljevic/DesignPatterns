package Iterator;

public class Main {
    static void main(String[] args) {
        ServerCluster cluster = new ServerCluster();
        Iterator<String> iterator = cluster.createIterator();

        while (iterator.hasNext()) {
            System.out.println("Connecting to cluster node: " + iterator.next());
        }
    }
}
