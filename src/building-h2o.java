class H2O {
    private volatile int o = 0,  h = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public H2O() {
        
    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
        try {
            lock.lock();
            while(h == 2) {
                condition.await();
            }
            releaseHydrogen.run();
            h ++;
            if (h == 2 && o == 1) {
                o = h = 0;
            }
            condition.signalAll();
        } finally {
            lock.unlock();
        } 
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        
        // releaseOxygen.run() outputs "O". Do not change or remove this line.
        try {
            lock.lock();
            while(o == 1){
                condition.await();
            }
            releaseOxygen.run();
            o ++;
            if (h == 2 && o == 1) {
                o = h = 0;
            }
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }
}