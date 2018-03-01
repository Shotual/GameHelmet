package com.mygdx.game.game;

/**
 * Created by guille on 1/3/18.
 */

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class Casco {
    Texture img;
    int x=50;
    int y=50;

    public Casco(){
        img= new Texture("casco.png");
    }
     public void pintar(SpriteBatch batch,float x,float y){
         batch.draw(img,x,y);

     }


}
