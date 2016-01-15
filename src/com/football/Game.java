package com.football;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Team team1;
    private Team team2;

    private List<GameObserver> observers;

    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public Game(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
        this.observers = new ArrayList<>();
    }

    public void addGameObserver(GameObserver gameObserver) {
        this.observers.add(gameObserver);
    }

    public void goal(Team team) {
        GoalEvent newGoalEvent = new GoalEvent(team);
        for (GameObserver gameObserver : observers) {
            gameObserver.goalOccured(newGoalEvent);
        }
    }
}
