package AbstractFactory.src.main.java.com.test.AbstractFactory.clothes;

import AbstractFactory.src.main.java.com.test.AbstractFactory.Interfaces.farmarit;

public class boss_farmarit implements farmarit {

    @Override
    public String merkki() {
        return "Boss";
    }
    
    @Override
    public String toString(){
        return merkki() + " farmarit";
    }
    
}
