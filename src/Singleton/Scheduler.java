package Singleton;

import java.awt.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Scheduler {
    private static BlockingQueue<Thread> readyList = new LinkedBlockingQueue<>();
    private static Scheduler instance = new Scheduler();

    public static Scheduler getInstance() {
        return instance;
    }

    public void put(Thread t) {
        try {
            readyList.put(t);
        } catch (InterruptedException ignored) {
            Thread.currentThread().interrupt();
        }
    }

    public Thread get() {
        return readyList.poll();
    }

    protected Scheduler() {}
}
