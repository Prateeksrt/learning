package com.room;

/**
 * Created by prateeks on 10/6/15.
 */
public class Bulb {

    private boolean glowing;

    public boolean isGlowing() {
        return glowing;
    }

    public void setGlowing(boolean glowing) {
        this.glowing = glowing;
    }

    public Bulb(boolean glowing) {
        this.glowing = glowing;
    }
}
