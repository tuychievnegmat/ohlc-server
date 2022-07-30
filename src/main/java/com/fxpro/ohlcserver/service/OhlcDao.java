package com.fxpro.ohlcserver.service;


import com.fxpro.ohlcserver.model.entity.OhlcEntity;
import com.fxpro.ohlcserver.model.OhlcPeriod;

import java.util.List;

/** already implemented by your co-workers*/
public interface OhlcDao {
   void store(OhlcEntity ohlcEntity);
   /** loads OHLCs from DB selected by parametrs and sorted by
    * periodStartUtsTimestamp in descending order*/
   List<OhlcEntity> getHistorical(long instrumentId, OhlcPeriod period);

}
