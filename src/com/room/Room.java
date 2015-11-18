package com.room;

import java.util.List;

public class Room {
    List<Switch> switches;

    public Room(List<Switch> switches) {
        this.switches = switches;
    }

    public void addSwitch(Switch switchObj){
        switches.add(switchObj);
    }
}
