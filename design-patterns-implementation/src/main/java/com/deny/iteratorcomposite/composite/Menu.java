package com.deny.iteratorcomposite.composite;

import java.util.ArrayList;
import java.util.List;

class Menu implements MenuComponent {
    private final List<MenuComponent> menuComponents = new ArrayList<>();
    private final String name;
    private final String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String description() {
        return description;
    }

    @Override
    public void print() {
        System.out.print("\n" + name());
        System.out.println(", " + description());
        System.out.println("------------------");
        menuComponents.forEach(MenuComponent::print);
    }
}
