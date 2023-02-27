package com.test.State;

public class Charizard extends State{

    Charizard(Player player){
        super(player);
    }

    @Override
    public void onAttack() {
        System.out.println(getEvolution() + " = max evolution");
    }

    @Override
    public String getEvolution() {
        return "Charizard";
    }
    
}