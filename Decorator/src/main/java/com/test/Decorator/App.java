package com.test.Decorator;

/**
 * Hello world!
 *
 */
public class App 
{   
    private static boolean isLocked = true;
    public static void main( String[] args )
    {   
        
        DataSource ds = new Vault();

        if (isLocked){
            ds = new Lock(ds);
        }

        System.out.println(ds.getData());

    }
}
