package com.test.State;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Player player = new Player();
        for (int i = 0; i<30; i++){
            player.attack();
        }
    }
}
