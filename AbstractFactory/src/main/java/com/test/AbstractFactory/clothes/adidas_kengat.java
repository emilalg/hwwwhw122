package AbstractFactory.src.main.java.com.test.AbstractFactory.clothes;

import AbstractFactory.src.main.java.com.test.AbstractFactory.Interfaces.kengat;

public class adidas_kengat implements kengat {

    @Override
    public String merkki() {
        return "Adidas";
    }
    
    @Override
    public String toString(){
        return merkki() + " kengat";
    }
}
