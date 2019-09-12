package question_2;

public class InnerClassSingleton {
    private static class SingletonHolder {
        private static final InnerClassSingleton instance = new InnerClassSingleton();
    }

    private InnerClassSingleton() {
    }

    private InnerClassSingleton getInstance(){
        return SingletonHolder.instance;
    }
}
