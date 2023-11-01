package com.deny.iteratorcomposite.composite;

import com.deny.ImplementationExample;

public class MenuCompositeExample implements ImplementationExample {
    @Override
    public void start() {
        var pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        var dinnerMenu = new Menu("DINNER MENU", "dinner!");
        var cafeMenu = new Menu("CAFE MENU", "cafe");
        var dessertMenu = new Menu("DESSERT MENU", "desserts");
        var allMenus = new Menu("Whole menu", "combination of all");
        allMenus.add(dinnerMenu);
        allMenus.add(cafeMenu);
        allMenus.add(pancakeHouseMenu);
        dinnerMenu.add(new MenuItem("dessert1", "test", true, 11.1));
        dinnerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("Dinner1", "test", true, 111.1));
        pancakeHouseMenu.add(new MenuItem("pancake1", "test", true, 21.1));
        cafeMenu.add(new MenuItem("cafe1", "test", true, 112.1));

        var waitress = new CompositeClientWaitress(allMenus);
        waitress.print();
    }
}
