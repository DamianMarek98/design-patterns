package com.deny.iteratorcomposite;

import com.deny.ImplementationExample;

public class MenuIteratorExample implements ImplementationExample {
    @Override
    public void start() {
        var pancakeHouseMenu = new PancakeHouseMenu();
        var dinnerMenu = new DinnerMenu();
        var waitress = new Waitress(pancakeHouseMenu, dinnerMenu);
        waitress.printMenu();
    }
}
