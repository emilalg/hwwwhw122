package com.test.Decorator;

import java.util.Scanner;

public class Lock extends DataSourceDecorator{

    private String pass = "1234";

    public Lock(DataSource ds) {
        super(ds);
    }

    public String getData() {
        Scanner myObj = new Scanner(System.in);
        String in = myObj.nextLine();
        myObj.close();
        
        if (in.equals(pass)){
            return super.getData();
        }
        return "error";
    }
    
}
