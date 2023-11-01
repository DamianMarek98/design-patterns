package com.deny.iteratorcomposite;

import java.util.Iterator;

class Waitress {
    private final Menu pancakeHouseMenu;
    private final Menu dinnerMenu;
    private final Menu cafeMenu;

    Waitress(PancakeHouseMenu pancakeHouseMenu, DinnerMenu dinnerMenu, CafeMenu caffeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
        this.cafeMenu = caffeMenu;
    }

    public void printMenu() {
        var pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        var dinnerMenuIterator = dinnerMenu.createIterator();
        var cafeMenuIterator = cafeMenu.createIterator();

        System.out.println("Breakfast: \n");
        printMenu(pancakeHouseMenuIterator);
        System.out.println("Lunch \n");
        printMenu(dinnerMenuIterator);
        System.out.println("Cafe \n");
        printMenu(cafeMenuIterator);
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
