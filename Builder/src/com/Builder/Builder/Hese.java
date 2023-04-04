package com.Builder.Builder;

import java.util.ArrayList;
import java.util.List;
import com.Builder.Parts.*;

public class Hese implements IBurgerBuilder{
    private List<Object> ainekset;

    public Hese(){
        ainekset = new ArrayList<Object>();
    }

    @Override
    public IBurgerBuilder lisaaleipa() {
        ainekset.add(new Leipa());
        return this;
    }

    @Override
    public IBurgerBuilder liaasalaatti() {
        ainekset.add(new Salaatti());
        return this;
    }

    @Override
    public IBurgerBuilder lisaakastike() {
        ainekset.add(new Kastike());
        return this;
    }

    @Override
    public Object getBurger() {
        return ainekset;
    }

    
}
