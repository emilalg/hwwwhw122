package com.test.State;

public class Player {
    private State state;

    protected int xp = 0;

    public Player(){

    }

    public void attack(){
        state.onAttack();
    }

    public void setState(State state){
        this.state = state;
    }

}
