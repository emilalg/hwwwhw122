package com.test.State;

public class Charmeleon extends State{

    Charmeleon(Player player){
        super(player);
    }

    @Override
    public void onAttack() {
        System.out.println(getEvolution() + " attacked for 5xp");
        player.xp += 5;
        if (player.xp>30){
            System.out.println("xp exceeded 30. Evolving from " + getEvolution());
            player.setState(new Charizard(player));
        }
    }

    @Override
    public String getEvolution() {
        return "Charmeleon";
    }
    
}