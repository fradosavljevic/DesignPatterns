package Singleton;

public class Main {
    public static boolean running = true;

    public static void main(String[] args) throws InterruptedException {
        Scheduler SC = Scheduler.getInstance();
        for (int i = 1; i <= 3; i++) {
            final int id = i;
            Thread worker = new Thread(() -> {
                while (true) {
                    try {
                        System.out.println("Worker-" + id);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        break;
                    }
                }
            });
            worker.setName("Worker-" + id);
            SC.put(worker);
        }

        long startTime = System.currentTimeMillis();

        while (System.currentTimeMillis() - startTime < 200) {
            Thread currentWorker = SC.get();

            if (currentWorker != null) {
                System.out.println(">> Scheduler started: " + currentWorker.getName());

                Thread.sleep(20);

                System.out.println("<< Putting back to scheduler: " + currentWorker.getName());

                SC.put(currentWorker);
            }
        }

        running = false;
        System.out.println("--- END ---");
    }
}
