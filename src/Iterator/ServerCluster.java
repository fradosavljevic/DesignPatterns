package Iterator;

public class ServerCluster implements ClusterCollection {
    private final String[] servers = {"Server-Alpha", "Server-Beta", "Server-Gamma"};

    @Override
    public Iterator<String> createIterator() {
        return new ServerIterator();
    }

    private class ServerIterator implements Iterator<String> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < servers.length;
        }

        @Override
        public String next() {
            if (this.hasNext()) {
                return servers[index++];
            }
            return null;
        }
    }
}
