package com.simulation;

import javafx.geometry.Point2D;

/**
 * Created by prateeks on 10/6/15.
 */
public class Person {
    private Point2D coordinates;
    private int forceCapacity;

    public void throow(Stone stone){
        Environment.createProjectile(stone, forceCapacity);
    }
}
