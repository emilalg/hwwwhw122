package AbstractFactory.src.main.java.com.test.AbstractFactory.factories;

import AbstractFactory.src.main.java.com.test.AbstractFactory.Interfaces.*;
import AbstractFactory.src.main.java.com.test.AbstractFactory.clothes.*;

public class bossfactory implements vaatetehdas{

    @Override
    public tpaita luoTpaita() {
        return new boss_tpaita();
    }

    @Override
    public farmarit luoFarmarit() {
        return new boss_farmarit();
    }

    @Override
    public lippis luoLippis() {
        return new boss_lippis();
    }

    @Override
    public kengat luoKengat() {
        return new boss_kengat();
    }
    
}
