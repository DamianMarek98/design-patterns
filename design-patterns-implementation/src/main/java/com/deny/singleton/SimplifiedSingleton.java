package com.deny.singleton;

public enum SimplifiedSingleton {
    UNIQUE_INSTANCE;
    //possible values, methods etc

    //simple usage
    public static class SingletonClient {
        public static void main(String[] args) {
            SimplifiedSingleton simplifiedSingleton = SimplifiedSingleton.UNIQUE_INSTANCE;
        }
    }
}
