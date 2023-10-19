package com.deny.iteratorcomposite;

class DinnerMenuIterator implements Iterator {
    private final MenuItem[] menuItems;
    private int position = 0;

    public DinnerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.length && menuItems[position] != null;
    }

    @Override
    public MenuItem next() {
        var menuItem = menuItems[position];
        position++;
        return menuItem;
    }
}
