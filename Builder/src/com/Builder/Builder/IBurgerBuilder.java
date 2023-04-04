package com.Builder.Builder;

public interface IBurgerBuilder {
    
    public abstract IBurgerBuilder lisaaleipa();
    public abstract IBurgerBuilder liaasalaatti();
    public abstract IBurgerBuilder lisaakastike();
    public abstract Object getBurger();

}
