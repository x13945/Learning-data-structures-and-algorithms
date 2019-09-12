package question_2;

final class HungrySingleton {
    private HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public HungrySingleton getInstance() {
        return instance;
    }
}
