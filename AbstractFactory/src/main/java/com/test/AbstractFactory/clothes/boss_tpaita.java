package AbstractFactory.src.main.java.com.test.AbstractFactory.clothes;

import AbstractFactory.src.main.java.com.test.AbstractFactory.Interfaces.tpaita;

public class boss_tpaita implements tpaita {
    @Override
    public String merkki() {
        return "Boss";
    }
    
    @Override
    public String toString(){
        return merkki() + " tpaita";
    }
}
