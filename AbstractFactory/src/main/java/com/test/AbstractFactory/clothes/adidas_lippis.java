package AbstractFactory.src.main.java.com.test.AbstractFactory.clothes;


import AbstractFactory.src.main.java.com.test.AbstractFactory.Interfaces.lippis;

public class adidas_lippis implements lippis{
    
    @Override
    public String merkki() {
        return "Adidas";
    }
    
    @Override
    public String toString(){
        return merkki() + " lippis";
    }
    
}
