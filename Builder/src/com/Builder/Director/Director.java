package com.Builder.Director;

import java.util.List;

import com.Builder.Builder.*;
import com.Builder.Parts.Osa;

public class Director {
    
    public List<Osa> createHeseBursa(){
        Hese test = new Hese();
        
        test.liaasalaatti();
        test.lisaakastike();
        test.lisaaleipa();

        List<Osa> osat = (List<Osa>) test.getBurger();
        return osat;
    }

    public StringBuilder createMäkkiBursa(){
        Mäkki test = new Mäkki();

        test.liaasalaatti();
        test.lisaakastike();
        test.lisaaleipa();

        StringBuilder osat = (StringBuilder) test.getBurger();
        return osat;
    }

}
