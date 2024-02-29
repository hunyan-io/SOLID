package com.directi.training.lsp.exercise_refactored;

public class Pool {
    public void run() {
        Duck donaldDuck = new Duck();
        Duck electricDuck = new ElectronicDuck();
        init(donaldDuck, electricDuck);
        quack(donaldDuck, electricDuck);
        swim(donaldDuck, electricDuck);
    }

    private void init(Duck... ducks) {
        for (Duck duck : ducks) {
            duck.init();
        }
    }

    private void quack(Duck... ducks) {
        for (Duck duck : ducks) {
            duck.quack();
        }
    }

    private void swim(Duck... ducks) {
        for (Duck duck : ducks) {
            duck.swim();
        }
    }

    public static void main(String[] args) {
        Pool pool = new Pool();
        pool.run();
    }
}
