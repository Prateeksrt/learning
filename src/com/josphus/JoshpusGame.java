package com.josphus;

public class JoshpusGame {

    private int numberOfPlayer;
    private int positionToEliminate;
    Player first;

    public JoshpusGame(int numberOfPlayer, int positionToEliminate) {
        this.numberOfPlayer = numberOfPlayer;
        this.positionToEliminate = positionToEliminate;
        init();
    }

    private void init(){
        first = new Player();
        Player temp = first;
        first.id = 1;

        for(int i =2;i <=numberOfPlayer; i++){
            first.nextPlayer =new Player();
            first.nextPlayer.id = i;
            first = first.nextPlayer;
        }

        first.nextPlayer = temp;
    }

    public int play(){
        for(int i = 1; i<numberOfPlayer; i++){
            for(int j=1;j<positionToEliminate;j++)
                first = first.nextPlayer;

            System.out.println("Player Eliminated is "+first.nextPlayer.id);
            first.nextPlayer = first.nextPlayer.nextPlayer;
        }
        return first.id;
    }
}
