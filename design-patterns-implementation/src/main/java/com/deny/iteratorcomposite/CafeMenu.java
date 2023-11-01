package com.deny.iteratorcomposite;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class CafeMenu implements Menu {
    private final Map<String, MenuItem> menuItemMap = new HashMap<>();

    public CafeMenu() {
        addItem("Cafe1", "test", false, 12.2);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        var menuItem = new MenuItem(name, description, vegetarian, price);
        menuItemMap.put(name, menuItem);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItemMap.values().iterator();
    }
}
