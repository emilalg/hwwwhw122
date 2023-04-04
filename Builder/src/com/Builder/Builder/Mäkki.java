package com.Builder.Builder;

public class Mäkki implements IBurgerBuilder {

    private StringBuilder ainekset;

    public Mäkki(){
        ainekset = new StringBuilder();
    }

    @Override
    public IBurgerBuilder lisaaleipa() {
        ainekset.append("Leipä");
        return this;
    }

    @Override
    public IBurgerBuilder liaasalaatti() {
        ainekset.append("Salaatti");
        return this;
    }

    @Override
    public IBurgerBuilder lisaakastike() {
        ainekset.append("Kastike");
        return this;
    }

    @Override
    public Object getBurger() {
        return ainekset;
    }
    
}
