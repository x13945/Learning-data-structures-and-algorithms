package question_2;

public class SyncSingleton {
    private SyncSingleton instance = null;

    private SyncSingleton() {
    }

    public SyncSingleton getInstance() {
        synchronized (SyncSingleton.class) {
            if (instance == null) {
                instance = new SyncSingleton();
            }
        }
        return instance;
    }
}
