package com.pigeonstudios.russianpigeon.framework;

/**
 * Created by DennisFedorchuk on 6/23/2016.
 */
public abstract class Screen {
    protected final Game game;

    public Screen(Game game){
        this.game = game;
    }

    public abstract void update(float deltaTime);

    public abstract void draw(float deltaTime);

    public abstract void pause();

    public abstract void resume();

    public abstract void dispose();

}
