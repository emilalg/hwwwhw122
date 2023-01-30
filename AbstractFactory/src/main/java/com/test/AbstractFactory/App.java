package AbstractFactory.src.main.java.com.test.AbstractFactory;

import AbstractFactory.src.main.java.com.test.AbstractFactory.factories.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Jasper j = new Jasper();
        j.setFactory(new adidasfactory());
        j.kerroVaatteet();
        System.out.println("-----Insinoori-----\n");
        j.setFactory(new bossfactory());
        j.kerroVaatteet();
    }
}
