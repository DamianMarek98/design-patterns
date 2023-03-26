package com.deny.singleton;

public class ChocolateBoilerSingleton {
    private static volatile ChocolateBoilerSingleton chocolateBoilerSingleton;
    private boolean empty;
    private boolean boiled;

    private ChocolateBoilerSingleton() {
        empty = true;
        boiled = false;
    }

    /**
     * Making this method synchronized works well for multithreaded system,
     * but it is rather slow when we access this method a lot.
     * Because of that we just synchronize instance creation and by making instance field volatile
     * we ensure that all operations are done in correct order (not reorder by jit compiler or other mechanism)
     */
    public static ChocolateBoilerSingleton getInstance() {
        if (chocolateBoilerSingleton == null) {
            synchronized (ChocolateBoilerSingleton.class) {
                chocolateBoilerSingleton = new ChocolateBoilerSingleton();
                System.out.println("new instance");
            }
        }
        return chocolateBoilerSingleton;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
     }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
