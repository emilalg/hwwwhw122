package com.Builder;
import java.util.List;

import com.Builder.Director.Director;
import com.Builder.Parts.Osa;

public class Main {
    
    public static void main(String args[]){
        Director dt = new Director();

        StringBuilder st = dt.createMäkkiBursa();
        System.out.println(st.toString());

        List<Osa> osat = dt.createHeseBursa();

        for (Osa osa : osat) {
            System.out.println(osa);
        }
        

    }

}
