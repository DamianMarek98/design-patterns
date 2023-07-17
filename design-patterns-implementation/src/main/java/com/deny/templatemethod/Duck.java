package com.deny.templatemethod;

class Duck implements Comparable<Duck> {
    private String name;
    private int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Duck otherDuck) {
        if (weight < otherDuck.weight) {
            return -1;
        } else if (weight == otherDuck.weight) {
            return 0;
        }

        return 1;
    }
}
