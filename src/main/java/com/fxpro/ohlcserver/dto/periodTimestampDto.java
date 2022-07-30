package com.fxpro.ohlcserver.dto;

import com.fxpro.ohlcserver.model.OhlcPeriod;
import lombok.Data;

@Data
public class periodTimestampDto {
    private OhlcPeriod ohlcPeriod;
    private long timestamp;
}
