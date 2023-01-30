package AbstractFactory.src.main.java.com.test.AbstractFactory.factories;


import AbstractFactory.src.main.java.com.test.AbstractFactory.Interfaces.*;
import AbstractFactory.src.main.java.com.test.AbstractFactory.clothes.*;

public class adidasfactory implements vaatetehdas {

    @Override
    public tpaita luoTpaita() {
        return new adidas_tpaita();
    }

    @Override
    public farmarit luoFarmarit() {
        return new adidas_farmarit();
    }

    @Override
    public lippis luoLippis() {
        return new adidas_lippis();
    }

    @Override
    public kengat luoKengat() {
        return new adidas_kengat();
    }
    
}
