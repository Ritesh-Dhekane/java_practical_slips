class SynchronizedCounter {
    private int value;

    public synchronized void increment() {
        value++;
    }

    public synchronized int getValue() {
        return value;
    }
}

class CounterTask implements Runnable {
    private final SynchronizedCounter counter;
    private final String name;

    CounterTask(String name, SynchronizedCounter counter) {
        this.name = name;
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            counter.increment();
            System.out.println(name + " incremented counter to " + counter.getValue());
            try {
                Thread.sleep(120);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class PriorityThread extends Thread {
    PriorityThread(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    @Override
    public void run() {
        System.out.println(getName() + " started with priority " + getPriority());
        try {
            Thread.sleep(150);
        } catch (InterruptedException ex) {
            interrupt();
        }
        System.out.println(getName() + " finished.");
    }
}

class SharedBuffer {
    private int value;
    private boolean available;

    public synchronized void produce(int newValue) throws InterruptedException {
        while (available) {
            wait();
        }
        value = newValue;
        available = true;
        System.out.println("Producer created value " + value);
        notifyAll();
    }

    public synchronized int consume() throws InterruptedException {
        while (!available) {
            wait();
        }
        available = false;
        System.out.println("Consumer processed value " + value);
        notifyAll();
        return value;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== Multithreading Super Slip ===");

        demonstrateRunnableVsThread();
        demonstratePriorityAndJoin();
        demonstrateSynchronization();
        demonstrateInterThreadCommunication();
    }

    private static void demonstrateRunnableVsThread() throws InterruptedException {
        System.out.println();
        System.out.println("1. Runnable vs Thread");

        Thread runnableThread = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Runnable worker step " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
        }, "RunnableWorker");

        PriorityThread threadSubclass = new PriorityThread("ThreadSubclassWorker", Thread.NORM_PRIORITY);

        runnableThread.start();
        threadSubclass.start();
        runnableThread.join();
        threadSubclass.join();
    }

    private static void demonstratePriorityAndJoin() throws InterruptedException {
        System.out.println();
        System.out.println("2. Thread priority and join()");

        PriorityThread low = new PriorityThread("LowPriorityThread", Thread.MIN_PRIORITY);
        PriorityThread high = new PriorityThread("HighPriorityThread", Thread.MAX_PRIORITY);

        low.start();
        high.start();

        low.join();
        high.join();

        System.out.println("Main thread continued only after both child threads completed.");
    }

    private static void demonstrateSynchronization() throws InterruptedException {
        System.out.println();
        System.out.println("3. Synchronization with shared counter");

        SynchronizedCounter counter = new SynchronizedCounter();
        Thread t1 = new Thread(new CounterTask("Worker-A", counter));
        Thread t2 = new Thread(new CounterTask("Worker-B", counter));

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final synchronized counter value = " + counter.getValue());
    }

    private static void demonstrateInterThreadCommunication() throws InterruptedException {
        System.out.println();
        System.out.println("4. Inter-thread communication using wait()/notifyAll()");

        SharedBuffer buffer = new SharedBuffer();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 3; i++) {
                    buffer.produce(i * 10);
                    Thread.sleep(120);
                }
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }, "ProducerThread");

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 3; i++) {
                    buffer.consume();
                    Thread.sleep(150);
                }
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }, "ConsumerThread");

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();

        System.out.println("Producer-consumer demo completed.");
    }
}
