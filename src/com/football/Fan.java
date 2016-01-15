package com.football;

public class Fan implements GameObserver {

    private Team favourite;

    public Fan(Team favourite) {
        this.favourite = favourite;
    }

    @Override
    public void goalOccured(GoalEvent goalEvent) {
        System.out.print("Fan of Team " + favourite.getName() + " says ");
        if (goalEvent.getTeam().equals(favourite))
            System.out.println("Huraah");
        else
            System.out.println("Aaaahh");

    }
}
