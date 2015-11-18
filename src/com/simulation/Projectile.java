package com.simulation;

import javafx.geometry.Point2D;

/**
 * Created by prateeks on 10/6/15.
 */
public class Projectile {

    private Stone stone;
    private float velocity;
    private int angle;
    static final float pi =  3.14f;

    public Projectile(Stone stone, float velocity, int angle) {
        this.stone = stone;
        this.velocity = velocity;
        this.angle = angle;
    }

    public Point2D nextCoordinate(){
        double cosOfAngle = Math.cos((2f * pi) / 360 * angle);
        double horizontalVelocity = velocity * cosOfAngle;
        return null;
    }
}
