package com.deny.iteratorcomposite;

import java.util.Iterator;

public class DinnerMenu implements Menu {
    private static final int MAX_ITEMS = 6;
    private final MenuItem[] menuItems;
    private int numberOfItems = 0;

    public DinnerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Ad", "bd", true, 2.99);
        addItem("Cd", "dd", true, 2.99);
        addItem("Ed", "fd", false, 4.99);
        addItem("Gd", "hd", true, 3.99);
    }

    public void addItem(String name, String desc, boolean vegetarian, double price) {
        if (numberOfItems == MAX_ITEMS) {
            System.out.println("Dinner menu is full!");
            return;
        }
        menuItems[numberOfItems] = new MenuItem(name, desc, vegetarian, price);
        numberOfItems++;
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new DinnerMenuIterator(menuItems);
    }
}
