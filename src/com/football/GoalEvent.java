package com.football;

/**
 * Created by prateeks on 10/4/15.
 */
public class GoalEvent {

    private Team team;

    public Team getTeam() {
        return team;
    }

    public GoalEvent(Team team) {

        this.team = team;
    }
}
