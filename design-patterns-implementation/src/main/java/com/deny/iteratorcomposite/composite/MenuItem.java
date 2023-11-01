package com.deny.iteratorcomposite.composite;

record MenuItem(String name, String description, boolean vegetarian, double price) implements MenuComponent {

    @Override
    public void print() {
        System.out.print(" " + name());
        if (vegetarian()) {
            System.out.print("(v)");
        }
        System.out.print(", " + price());
        System.out.print("    -- " + description());
    }
}
