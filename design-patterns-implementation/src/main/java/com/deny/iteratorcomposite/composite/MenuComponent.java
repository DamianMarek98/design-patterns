package com.deny.iteratorcomposite.composite;

public interface MenuComponent {
    default void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    default void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    default MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    default String name() {
        throw new UnsupportedOperationException();
    }

    default String description() {
        throw new UnsupportedOperationException();
    }

    default double price() {
        throw new UnsupportedOperationException();
    }

    default boolean vegetarian() {
        throw new UnsupportedOperationException();
    }

    default void print() {
        throw new UnsupportedOperationException();
    }
}
