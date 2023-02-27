package com.test.Decorator;

public class DataSourceDecorator implements DataSource{

    private DataSource ds;

    DataSourceDecorator(DataSource ds){
        this.ds = ds;
    }

    public String getData() {
        return ds.getData();
    }
    
}
