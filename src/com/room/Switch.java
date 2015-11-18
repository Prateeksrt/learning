package com.room;

/**
 * Created by prateeks on 10/6/15.
 */
public class Switch {
    private Bulb bulb;

    public Switch(Bulb bulb) {
        this.bulb = bulb;
    }

    public void on(){
        this.bulb.setGlowing(true);
    }

    public void off(){
        this.bulb.setGlowing(false
        );
    }
}
