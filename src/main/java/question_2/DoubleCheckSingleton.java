package question_2;

public class DoubleCheckSingleton {
    private DoubleCheckSingleton instance = null;

    private DoubleCheckSingleton() {
    }

    public DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
