package com.josphus;

/**
 * Created by prateeks on 10/4/15.
 */
public class Main {
    public static void main(String[] args) {
        JoshpusGame game = new JoshpusGame(6,3);
        System.out.println("The last player left is "+game.play());
    }

}
