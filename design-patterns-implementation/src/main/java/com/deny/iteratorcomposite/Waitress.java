package com.deny.iteratorcomposite;

class Waitress {
    private final PancakeHouseMenu pancakeHouseMenu;
    private final DinnerMenu dinnerMenu;

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

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            var menuItem = iterator.next();
            System.out.println(menuItem.name);
            System.out.println(menuItem.price);
            System.out.println(menuItem.description);
            System.out.println("----------------");
        }
    }
}
