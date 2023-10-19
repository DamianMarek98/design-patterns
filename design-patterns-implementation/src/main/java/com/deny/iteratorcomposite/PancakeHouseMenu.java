package com.deny.iteratorcomposite;

import java.util.ArrayList;
import java.util.List;

class PancakeHouseMenu {
    private final List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        addItem("A", "b", true, 2.99);
        addItem("C", "d", true, 2.99);
        addItem("E", "f", false, 4.99);
        addItem("G", "h", true, 3.99);
    }

    public void addItem(String name, String desc, boolean vegetarian, double price) {
        menuItems.add(new MenuItem(name, desc, vegetarian, price));
    }

    Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}