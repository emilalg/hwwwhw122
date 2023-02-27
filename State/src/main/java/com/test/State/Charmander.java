package com.test.State;

public class Charmander extends State{

    Charmander(Player player){
        super(player);
    }

    @Override
    public void onAttack() {
        System.out.println(getEvolution() + " attacked for 5xp");
        player.xp += 5;
        if (player.xp>20){
            System.out.println("xp exceeded 20. Evolving from " + getEvolution());
            player.setState(new Charmeleon(player));
        }
    }

    @Override
    public String getEvolution() {
        return "Charamander";
    }
    
}
