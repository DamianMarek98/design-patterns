package com.deny.iteratorcomposite;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class CafeMenu implements Menu {
    private final Map<String, MenuItem> menuItemMap = new HashMap<>();

    public CafeMenu() {
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {

    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return null;
    }
}
