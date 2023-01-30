package AbstractFactory.src.main.java.com.test.AbstractFactory.clothes;

import AbstractFactory.src.main.java.com.test.AbstractFactory.Interfaces.lippis;

public class boss_lippis implements lippis {

    @Override
    public String merkki() {
        return "Boss";
    }
    
    @Override
    public String toString(){
        return merkki() + " lippis";
    }
}
