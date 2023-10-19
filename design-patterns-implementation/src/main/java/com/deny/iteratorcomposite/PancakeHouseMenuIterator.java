package com.deny.iteratorcomposite;

import java.util.List;

class PancakeHouseMenuIterator implements Iterator {
    private final List<MenuItem> menuItems;
    private int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.size();
    }

    @Override
    public MenuItem next() {
        var menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }
}
