package com.fxpro.ohlcserver.service;

public interface Quote {
    double getPrice();
    long getInstrumentId();
    long getUtcTimestamp();
}
