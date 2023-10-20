package com.deny.iteratorcomposite;

import java.util.Iterator;

class Waitress {
    private final Menu pancakeHouseMenu;
    private final Menu dinnerMenu;

    Waitress(PancakeHouseMenu pancakeHouseMenu, DinnerMenu dinnerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu() {
        var pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        var dinnerMenuIterator = dinnerMenu.createIterator();

        System.out.println("Breakfast: \n");
        printMenu(pancakeHouseMenuIterator);
        System.out.println("Lunch \n");
        printMenu(dinnerMenuIterator);
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            var menuItem = iterator.next();
            System.out.println(menuItem.name);
            System.out.println(menuItem.price);
            System.out.println(menuItem.description);
            System.out.println("----------------");
        }
    }
}
