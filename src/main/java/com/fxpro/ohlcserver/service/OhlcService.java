package com.fxpro.ohlcserver.service;

import com.fxpro.ohlcserver.model.entity.OhlcEntity;
import com.fxpro.ohlcserver.model.OhlcPeriod;

import java.util.List;

public interface OhlcService extends QuoteListener{
    /** latest non persisted OHLC*/
    OhlcEntity getCurrent(long instrumentId, OhlcPeriod ohlcPeriod);
    /** all OHLC which are kept in a database */
    List<OhlcEntity> getHistorical(long instrumentId, OhlcPeriod ohlcPeriod);
    /** latest non persisted OHLC and OHLCs which are kept in a database */
    List<OhlcEntity> getHistoricalAndCurrent(long instrumentId, OhlcPeriod period);
}
