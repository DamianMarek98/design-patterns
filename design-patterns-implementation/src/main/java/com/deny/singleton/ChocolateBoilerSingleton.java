package com.deny.singleton;

public class ChocolateBoilerSingleton {
    private static ChocolateBoilerSingleton chocolateBoilerSingleton;
    private boolean empty;
    private boolean boiled;

    private ChocolateBoilerSingleton() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoilerSingleton getInstance() {
        if (chocolateBoilerSingleton == null) {
            chocolateBoilerSingleton = new ChocolateBoilerSingleton();
            System.out.println("new instance");
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
