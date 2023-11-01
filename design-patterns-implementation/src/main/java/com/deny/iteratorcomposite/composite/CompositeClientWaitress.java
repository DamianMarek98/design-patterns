package com.deny.iteratorcomposite.composite;

public class CompositeClientWaitress {
    private final MenuComponent allMenus;

    public CompositeClientWaitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void print() {
        allMenus.print();
    }
}
