package AbstractFactory.src.main.java.com.test.AbstractFactory.clothes;

import AbstractFactory.src.main.java.com.test.AbstractFactory.Interfaces.farmarit;

public class adidas_farmarit implements farmarit {

    @Override
    public String merkki() {
        return "Adidas";
    }
    
    @Override
    public String toString(){
        return merkki() + " farmarit";
    }
    
}
