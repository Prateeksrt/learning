package com.football;

public class Stadium {

    public static void main(String[] args) {
        Team india = new Team("India");
        Team pakistan = new Team("Pakistan");

        Fan indianFan = new Fan(india);
        Fan pakistaniFan = new Fan(pakistan);

        MediaPersonal cnnReporter = new MediaPersonal("CNN");

        Game game = new Game(india, pakistan);
        game.addGameObserver(indianFan);
        game.addGameObserver(pakistaniFan);
        game.addGameObserver(cnnReporter);
        playGame(game);
    }

    private static void playGame(Game game) {
        double random = Math.random();
        Team goaled = (random <= .5) ? game.getTeam1() : game.getTeam2();
        game.goal(goaled);
    }
}
