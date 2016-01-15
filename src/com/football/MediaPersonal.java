package com.football;

public class MediaPersonal implements GameObserver {

    public MediaPersonal(String channel) {
        this.channel = channel;
    }

    private String channel;

    @Override
    public void goalOccured(GoalEvent goalEvent) {
        System.out.println(goalEvent.getTeam().getName() + " has done a goal. \nBrought to you by : " + channel);
    }
}
