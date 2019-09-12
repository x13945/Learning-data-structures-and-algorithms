package question_2;

public class SyncSingleton {
    private static SyncSingleton instance = null;

    private SyncSingleton() {
    }

    public static SyncSingleton getInstance() {
        synchronized (SyncSingleton.class) {
            if (instance == null) {
                instance = new SyncSingleton();
            }
        }
        return instance;
    }
}
