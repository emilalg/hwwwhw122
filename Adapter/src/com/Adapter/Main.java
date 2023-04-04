package com.Adapter;

public class Main{

    public static void main(String args[]){

        LampotilaCelsius lampotilaCelsius = new LampotilaCelsius(0);

        LampotilaFahrenheit lampotilaAdapteri = new LampotilaAdapteri(lampotilaCelsius);

        lampotilaAdapteri.asetaLampotilaFahrenheit(68);
        System.out.println("Lämpötila Fahrenheit-asteikolla: " + lampotilaAdapteri.haeLampotilaFahrenheit() + "°F");

 
        System.out.println("Lämpötila Celsius-asteikolla: " + lampotilaCelsius.haeLampotila() + "°C");

    }

}