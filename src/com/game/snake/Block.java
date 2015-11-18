package com.game.snake;

/**
 * Created by prateeks on 10/11/15.
 */
public class Block {

    int value;
    Block right;
    Block left;
    Block top;
    Block bottom;

    public Block(int value) {
        this.value = value;
        right = null;
        left = null;
        bottom = null;
        top = null;
    }
}
