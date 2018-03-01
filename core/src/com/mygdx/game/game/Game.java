package com.mygdx.game.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by guille on 1/3/18.
 */

public class Game {
    Casco casco;
    public Game(){
        casco=new Casco();
    }
    public void pintar(SpriteBatch batch, float x, float y){
        casco.pintar(batch,x,y);

    }
}
