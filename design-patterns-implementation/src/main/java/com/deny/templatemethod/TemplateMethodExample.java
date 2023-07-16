package com.deny.templatemethod;

import com.deny.ImplementationExample;

public class TemplateMethodExample implements ImplementationExample {
    @Override
    public void start() {
        Tea tea = new Tea();
        tea.prepareRecipe();
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
        coffeeWithHook.prepareRecipe();
    }
}
