package org.example;

import org.example.bridge.CountDisplay;
import org.example.bridge.Display;
import org.example.bridge.RandomDisplay;
import org.example.bridge.StringDisplayImpl;

public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, Korea!"));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World!"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
        RandomDisplay d4 = new RandomDisplay(new StringDisplayImpl("TEST!"));

        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
        d4.randomDisplay(2);
    }
}