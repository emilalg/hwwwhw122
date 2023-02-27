package com.test.State;

public abstract class State {
    protected Player player;

    State(Player player){
        this.player = player;
    }

    public abstract void onAttack();
    public abstract String getEvolution();
}
