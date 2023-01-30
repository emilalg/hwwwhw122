package AbstractFactory.src.main.java.com.test.AbstractFactory;

import AbstractFactory.src.main.java.com.test.AbstractFactory.Interfaces.*;

public class Jasper {
    
    private vaatetehdas tehdas = null;

    public Jasper() {}

    public void setFactory(vaatetehdas t) {
        this.tehdas = t;
    }

    public void kerroVaatteet(){
        if (tehdas != null){
            System.out.println("Paalla on ------");
            System.out.println(tehdas.luoFarmarit());
            System.out.println(tehdas.luoKengat());
            System.out.println(tehdas.luoTpaita());
            System.out.println(tehdas.luoLippis() + "\n");
        } else {
            System.out.println("ei tehdasta");
        }
    }

}
