package com.fxpro.ohlcserver.model;

public enum OhlcPeriod {
    M1, // one minute, starts at 0 second of every minute
    M30,
    H1, // one hour, starts at 0:00 of every hour
    H4,
    D1, //one day, starts at 0:00:00 of every day
    W1,
    MN
}
