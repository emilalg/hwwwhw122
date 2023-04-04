package com.Adapter;

public class LampotilaAdapteri implements LampotilaFahrenheit {
    private LampotilaCelsius lampotilaCelsius;

    public LampotilaAdapteri(LampotilaCelsius lampotilaCelsius) {
        this.lampotilaCelsius = lampotilaCelsius;
    }

    @Override
    public double haeLampotilaFahrenheit() {
        return (lampotilaCelsius.haeLampotila() * 9.0 / 5.0) + 32;
    }

    @Override
    public void asetaLampotilaFahrenheit(double lampotila) {
        double celsius = (lampotila - 32) * 5.0 / 9.0;
        lampotilaCelsius.asetaLampotila(celsius);
    }
}
