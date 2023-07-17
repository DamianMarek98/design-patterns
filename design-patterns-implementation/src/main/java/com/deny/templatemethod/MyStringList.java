package com.deny.templatemethod;

import java.util.AbstractList;

class MyStringList extends AbstractList<String> {
    private String[] list;

    public MyStringList(String[] list) {
        this.list = list;
    }

    @Override
    public String get(int index) {
        return list[index];
    }

    @Override
    public int size() {
        return list.length;
    }

    @Override
    public String set(int index, String item) {
        String oldString = list[index];
        list[index] = item;
        return oldString;
    }
}
